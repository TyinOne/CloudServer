//package com.tyin.gateway.config.security.handler;
//
//import com.tyin.core.api.Result;
//import org.springframework.core.io.buffer.DataBuffer;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.server.WebFilterExchange;
//import org.springframework.security.web.server.authentication.WebFilterChainServerAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * @author TyinZero
// * @date 2022/12/28
// * @description ...
// */
//@Component
//public class AuthenticationSuccessHandler extends WebFilterChainServerAuthenticationSuccessHandler {
//    @Override
//    public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
//        ServerWebExchange exchange = webFilterExchange.getExchange();
//        ServerHttpResponse response = exchange.getResponse();
//        //设置headers
//        HttpHeaders httpHeaders = response.getHeaders();
//        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
//        httpHeaders.add("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0");
//        //设置body
//        Result<Object> success = Result.success();
//        byte[] dataBytes = {};
////        try {
////            User user = (User) authentication.getPrincipal();
////            AuthUserDetails userDetails = buildUser(user);
////            byte[] authorization = (userDetails.getUsername() + ":" + userDetails.getPassword()).getBytes();
////            String token = Base64.getEncoder().encodeToString(authorization);
////            httpHeaders.add(HttpHeaders.AUTHORIZATION, token);
////            wsResponse.setResult(userDetails);
////            dataBytes = mapper.writeValueAsBytes(wsResponse);
////        } catch (Exception ex) {
////            ex.printStackTrace();
////            JsonObject result = new JsonObject();
////            result.addProperty("status", MessageCode.COMMON_FAILURE.getCode());
////            result.addProperty("message", "授权异常");
////            dataBytes = result.toString().getBytes();
////        }
//        DataBuffer bodyDataBuffer = response.bufferFactory().wrap(dataBytes);
//        return response.writeWith(Mono.just(bodyDataBuffer));
//    }
//}
