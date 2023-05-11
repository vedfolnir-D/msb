package com.ved.msb.common.result;

import lombok.Data;

/**
 * @author vedfolnir
 */
@Data
public class JsonBean {
    private String code = "200";
    private String msg = "success";
    private boolean success;
}
