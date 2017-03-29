package com.eventorganizer

import com.eventorganizer.viewhelper.BootstrapViewHelper

class PlanController {

    def index(String eventTypeName) {
        println eventTypeName
        [planViewHelper: BootstrapViewHelper.PLAN_VIEW_HELPER]
    }
}