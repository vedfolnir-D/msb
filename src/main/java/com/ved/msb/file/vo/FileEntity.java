package com.ved.msb.file.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class FileEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 文件原始名称
     */
    private String originalFilename;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 访问路径
     */
    private String filePath;

    /**
     * 文件类型
     */
    private String contentType;

    /**
     * 文件来源
     */
    private String fileType;
}
