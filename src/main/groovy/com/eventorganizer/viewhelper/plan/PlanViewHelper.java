package com.eventorganizer.viewhelper.plan;

import com.eventorganizer.viewhelper.requirement.RequirementViewHelper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * Created by gnavin on 2/23/17.
 */
@AllArgsConstructor
@Builder
public class PlanViewHelper {

    @Singular
    private final List<RequirementViewHelper> requirementViewHelpers;

}
