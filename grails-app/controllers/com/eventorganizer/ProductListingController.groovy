package com.eventorganizer

import com.eventorganizer.viewhelper.BootstrapViewHelper

class ProductListingController {

    def index(String listingType) {
        [productListingViewHelper: BootstrapViewHelper.PRODUCT_TYPE_PRODUCT_LISTING.get(listingType)]
    }

    def all() {
        [productListingViewHelperMap: BootstrapViewHelper.PRODUCT_TYPE_PRODUCT_LISTING]
    }
}
