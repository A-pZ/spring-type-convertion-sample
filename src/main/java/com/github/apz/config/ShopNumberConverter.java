package com.github.apz.config;

import com.github.apz.model.shop.ShopNumber;
import org.springframework.core.convert.converter.Converter;

public class ShopNumberConverter implements Converter<String, ShopNumber> {
    @Override
    public ShopNumber convert(String source) {
        return ShopNumber.of(Integer.valueOf(source));
    }

}
