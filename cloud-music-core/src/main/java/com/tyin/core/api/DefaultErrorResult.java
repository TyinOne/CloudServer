package com.tyin.core.api;

import java.util.Date;

/**
 * {
 *   "timestamp": "2023-01-19T07:29:14.376+00:00",
 *   "status": 500,
 *   "error": "Internal Server Error",
 *   "path": "/login"
 * }
 */
public record DefaultErrorResult(Date timestamp,Integer status,String error,String path) {

}
