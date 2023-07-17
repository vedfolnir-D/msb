package com.ved.msb.file.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class FileVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
    private String remark;
    private String originalFilename;
    private String fileName;
    private Long fileSize;
    private String filePath;
    private String contentType;
    private String fileType;
}
