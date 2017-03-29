package com.eventorganizer.viewhelper.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by gnavin on 2/23/17.
 */
@AllArgsConstructor
@Getter
public class ProductViewHelper {

    private final String productType;
    private final String name;
    private final String thumbnailUrl;
    private final String location;
    private final String price;
    private final String unit;
    private final String vendor;

}
