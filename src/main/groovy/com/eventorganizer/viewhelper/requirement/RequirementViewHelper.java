package com.eventorganizer.viewhelper.requirement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * Created by gnavin on 2/23/17.
 */

@Builder
@AllArgsConstructor
public class RequirementViewHelper {
    private final String requirementType;
    @Singular
    private final Map<String, List<String>> options;



}
