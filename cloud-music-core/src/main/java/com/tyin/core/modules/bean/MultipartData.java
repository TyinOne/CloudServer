package com.tyin.core.modules.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ------WebKitFormBoundaryJJfBBoGzgAVr8ADv
 * Content-Disposition: form-data; name="remark"
 * <p>
 * 123
 * ------WebKitFormBoundaryJJfBBoGzgAVr8ADv
 * Content-Disposition: form-data; name="file"; filename="flutter_demo – main.dart [flutter_demo] 2023_1_30 10_19_54.png"
 * Content-Type: image/png
 * <p>
 * PNG...
 * ------WebKitFormBoundaryJJfBBoGzgAVr8ADv--
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultipartData {
    private Map<String, String> header;
    private String value;

    public static Map<String, List<MultipartData>> readline(ByteBuffer buffer) {
        //读取数据不移动索引。
        byte[] bytes = new byte[buffer.limit()];
        for (int i = 0; i < buffer.limit(); i++) {
            bytes[i] = buffer.get(i);
        }
        String s = new String(bytes, StandardCharsets.UTF_8);
        String[] split = s.split("\n");
        AtomicReference<String> key = new AtomicReference<>("");
        for (int i = 0; i < split.length; i++) {
            if (i < 1) {
                key.set(split[i].replace("\r", ""));
            }
        }
        List<String> strings = Arrays.stream(split).toList();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String item = strings.get(i);
            if (item.startsWith(key.get())) {
                list.add(i);
            }
        }
        Map<String, List<String>> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            List<String> item = strings.subList(start, integer);
            if (item.size() > 0) {
                map.put(Integer.valueOf(i).toString(), item);
            }
            start = item.size();
        }
        List<MultipartData> multipartDataList = new ArrayList<>();
        map.forEach((k, v) -> {
            int i = v.indexOf("\r");
            List<String> header = v.subList(1, i);
            Map<String, String> headers = new HashMap<>();
            for (String item : header) {
                int i1 = item.indexOf(": ");
                headers.put(item.substring(0, i1).toLowerCase(), item.substring(i1 + 1).trim());
            }
            String value = "";
            if (Objects.nonNull(headers.get("content-disposition")) && headers.get("content-disposition").contains("filename")) {
                String disposition = headers.get("content-disposition");
                String[] dispositionSplit = disposition.split("; ");
                for (String item : dispositionSplit) {
                    if (item.split("=")[0].equals("filename")) {
                        value = item.split("=")[1];
                    }
                }
            } else {
                List<String> values = v.subList(i + 1, v.size());
                StringBuilder builder = new StringBuilder();
                for (String item : values) {
                    builder.append(item);
                }
                value = builder.toString().replace("\r", "");
            }
            multipartDataList.add(new MultipartData(headers, value));
        });
        return new HashMap<>() {{
            put(key.get(), multipartDataList);
        }};
    }
}
