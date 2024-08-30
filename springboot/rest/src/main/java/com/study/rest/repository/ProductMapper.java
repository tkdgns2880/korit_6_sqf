package com.study.rest.repository;

import com.study.rest.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int save(Product product);
    // 인설트 업데이트 인트는 int 로 잡는다
}
