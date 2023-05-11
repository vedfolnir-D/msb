package com.ved.msb.common.result;

public class ResultUtil {
    private ResultUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> DataResult<T> genSuccessResult() {
        DataResult<T> result = new DataResult<>();
        result.setCode("200");
        result.setMsg("success");
        result.setSuccess(true);
        return result;
    }

    public static <T> DataResult<T> genErrorResult() {
        DataResult<T> result = new DataResult<>();
        result.setCode("500");
        result.setMsg("error");
        result.setSuccess(false);
        return result;
    }
}
