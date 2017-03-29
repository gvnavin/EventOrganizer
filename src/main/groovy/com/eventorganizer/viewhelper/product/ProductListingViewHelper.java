package com.eventorganizer.viewhelper.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * Created by gnavin on 2/23/17.
 */
@Builder
@AllArgsConstructor
public class ProductListingViewHelper {

    @Singular
    private final List<ProductViewHelper> productViewHelpers;
}
