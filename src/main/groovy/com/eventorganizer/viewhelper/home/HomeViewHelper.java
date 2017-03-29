package com.eventorganizer.viewhelper.home;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * Created by gnavin on 2/23/17.
 */
@Builder
@AllArgsConstructor
public class HomeViewHelper {
    @Singular
    private final List<String> locations;
    @Singular
    private final List<EventTypeViewHelper> eventTypeViewHelpers;
}
