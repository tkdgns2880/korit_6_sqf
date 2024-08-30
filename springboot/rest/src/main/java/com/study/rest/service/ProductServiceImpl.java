package com.study.rest.service;

import com.study.rest.dto.*;
import com.study.rest.entity.Color;
import com.study.rest.entity.Size;
import com.study.rest.repository.ColorMapper;
import com.study.rest.repository.ProductMapper;
import com.study.rest.repository.SizeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // implements 자동완성 -> ctrl + i
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SizeMapper sizeMapper;
    @Autowired
    private ColorMapper colorMapper;


// 호출받을 repository 파일의 기능을 가져온다

    @Override
    public List<SizeDto.SizeInfo> getSizeListAll() {
        return SizeDto.toSizeList(sizeMapper.findAll());
    }
    // 리턴 시켜줄때 entity 로 리턴시키는게 아니고 Dto로 리턴시켜줘야 한다

    @Override
    public List<ColorDto.ColorInfo> getColorListAll() {
        return ColorDto.tocolorList(colorMapper.findAll());
    }

    @Override
    public CommonResponseDto registerProduct(ProductDto.Register register) {
        return CommonResponseDto.ofDefault(productMapper.save(register.toEntity()));
    }
//    @Override
//    public CommonResponseDto registerSize(ReqRegisterSizeDto reqRegisterSizeDto) {
//        Size size = Size.builder()
//                .sizeName(reqRegisterSizeDto.getSizeName())
//                .build();
//        int successConut = sizeMapper.save(size);
//        return CommonResponseDto.ofDefault(successConut);
//    }
    @Override // 위에 registerSize 와 동일한 코드 toEntity 객체 안에 기능을 넣어서 간단하게 만듬
    public CommonResponseDto registerSize(ReqRegisterSizeDto reqRegisterSizeDto) {
        return CommonResponseDto.ofDefault(sizeMapper.save(reqRegisterSizeDto.toSizeEntity()));
    }
////        @Override 위와 같은 문법 Register 안에서 toEntity 를 사용해 문법이 간단해진다
////        public boolean registerProduct(ProductDto.Register register) {
////            Product product = Product.builder()
////                    .productName(register.getProductName())
////                    .price(register.getPrice())
////                    .sizeId(register.getSizeId())
////                    .colorId(register.getColorId())
////                    .build();
//        return productMapper.save(product) > 0;
    @Override
    public CommonResponseDto registerColor(ReqRegisterColorDto reqRegisterColorDto) {
        return CommonResponseDto.ofDefault(colorMapper.save(reqRegisterColorDto.toColorEntity()));
    }
}
