package com.ved.msb.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vedfolnir
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataResult<T> extends JsonBean {
    private T data;
}
