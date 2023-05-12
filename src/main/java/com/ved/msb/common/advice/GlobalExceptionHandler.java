package com.ved.msb.common.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ved.msb.common.result.ResultUtil;

/**
 * @author D
 * @date 2023/5/11 17:23
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object errorHandler(HttpServletRequest request, Exception e) throws Exception {

        e.printStackTrace();
        return ResultUtil.genErrorResult();
    }
}
