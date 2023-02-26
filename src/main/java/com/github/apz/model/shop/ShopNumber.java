package com.github.apz.model.shop;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class ShopNumber {

    @NotNull
    @Min(1) @Max(200)
    private Integer value;
}
