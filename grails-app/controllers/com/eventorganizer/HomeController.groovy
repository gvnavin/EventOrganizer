package com.eventorganizer

import com.eventorganizer.viewhelper.BootstrapViewHelper

class HomeController {

    def index() {
        [homeViewHelper: BootstrapViewHelper.HOME_VIEW_HELPER]
    }
}
