package com.github.apz.controller;

import com.github.apz.model.shop.ShopNumber;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @ToString
public class ShopForm {
    @Valid  // Validation対象を対象のクラス内にも広げる
    private ShopNumber shopNumber;

    @NotEmpty
    @Size(min = 2, max = 8)
    private String shopName;
}
