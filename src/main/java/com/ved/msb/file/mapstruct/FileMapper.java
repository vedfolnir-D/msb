package com.ved.msb.file.mapstruct;

import org.mapstruct.Mapper;

import com.ved.msb.common.mapstruct.EntityMapper;
import com.ved.msb.file.vo.FileDto;
import com.ved.msb.file.vo.FileEntity;
import com.ved.msb.file.vo.FileVo;

@Mapper(componentModel = "spring")
public interface FileMapper extends EntityMapper<FileDto, FileEntity, FileVo> {

}
