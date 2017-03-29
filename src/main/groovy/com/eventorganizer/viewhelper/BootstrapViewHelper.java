package com.eventorganizer.viewhelper;

import com.eventorganizer.viewhelper.home.EventTypeViewHelper;
import com.eventorganizer.viewhelper.home.HomeViewHelper;
import com.eventorganizer.viewhelper.plan.PlanViewHelper;
import com.eventorganizer.viewhelper.product.ProductListingViewHelper;
import com.eventorganizer.viewhelper.product.ProductViewHelper;
import com.eventorganizer.viewhelper.requirement.RequirementViewHelper;
import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.Map;

/**
 * Created by gnavin on 2/23/17.
 */
public final class BootstrapViewHelper {

    private BootstrapViewHelper() {
    }

    public static final EventTypeViewHelper BIRTHDAY = new EventTypeViewHelper("Birthday", "eventtype/birthday.jpg");
    public static final EventTypeViewHelper WEDDING = new EventTypeViewHelper("Wedding", "eventtype/wedding.jpg");
    public static final EventTypeViewHelper BACHELOR = new EventTypeViewHelper("Bachelor", "eventtype/bachelor.jpg");
    public static final EventTypeViewHelper FAREWELL = new EventTypeViewHelper("Farewell", "eventtype/farewell.jpg");

    public static final HomeViewHelper HOME_VIEW_HELPER = HomeViewHelper.builder()
            .location("Velacherry")
            .location("Guindy")
            .location("Adayar")
            .location("Taramani")
            .eventTypeViewHelper(BIRTHDAY)
            .eventTypeViewHelper(WEDDING)
            .eventTypeViewHelper(BACHELOR)
            .eventTypeViewHelper(FAREWELL)
            .build();

    public static final RequirementViewHelper VENUE = RequirementViewHelper.builder()
            .requirementType("Venue")
            .option("Location", Collections.emptyList())
            .option("Budget Min", Collections.emptyList())
            .option("Budget Max", Collections.emptyList())
            .build();

    public static final RequirementViewHelper CAKE = RequirementViewHelper.builder()
            .requirementType("Cake")
            .build();

    public static final RequirementViewHelper DECORATION = RequirementViewHelper.builder()
            .requirementType("Decoration")
            .build();

    public static final RequirementViewHelper SNACKS = RequirementViewHelper.builder()
            .requirementType("Snacks")
            .build();

    public static final RequirementViewHelper CATERING = RequirementViewHelper.builder()
            .requirementType("Catering")
            .build();

    public static final RequirementViewHelper TRANSPORT = RequirementViewHelper.builder()
            .requirementType("Transport")
            .build();

    public static final RequirementViewHelper PHOTO = RequirementViewHelper.builder()
            .requirementType("Photo")
            .build();

    public static final PlanViewHelper PLAN_VIEW_HELPER = PlanViewHelper.builder()
            .requirementViewHelper(VENUE)
            .requirementViewHelper(CAKE)
            .requirementViewHelper(DECORATION)
            .requirementViewHelper(SNACKS)
            .requirementViewHelper(CATERING)
            .requirementViewHelper(TRANSPORT)
            .requirementViewHelper(PHOTO)
            .build();

    public static final ProductViewHelper VENUE_GK = new ProductViewHelper("Venue", "GK Hall", "venue/gk.jpeg", "Kolathur", "20000", "day", "");
    public static final ProductViewHelper VENUE_HABLIS = new ProductViewHelper("Venue", "Hablis", "venue/hablis.jpeg", "Guindy", "15000", "day", "");
    public static final ProductViewHelper VENUE_KUBERA = new ProductViewHelper("Venue", "Kubera Banquets", "venue/kubera.jpeg", "R A Puram", "30000", "day", "");
    public static final ProductViewHelper VENUE_NILA = new ProductViewHelper("Venue", "Nila Party Hall", "venue/nila.jpeg", "Adyar", "25000", "day", "");
    public static final ProductViewHelper VENUE_SRINIVASA = new ProductViewHelper("Venue", "Sri Srinivasa Mini Hall", "venue/srinivasa.jpeg", "Tharamani", "40000", "day", "");

    public static final ProductViewHelper CAKE_1 = new ProductViewHelper("Cake", "Chocolate", "cake/cake-1.jpeg", "", "250", "kg", "Saravana bhavan");
    public static final ProductViewHelper CAKE_2 = new ProductViewHelper("Cake", "Cheese", "cake/cake-2.jpeg", "", "300", "kg", "Akshaya bhavan");
    public static final ProductViewHelper CAKE_3 = new ProductViewHelper("Cake", "Red velvet", "cake/cake-3.jpeg", "", "400", "kg", "ABC Cakes");
    public static final ProductViewHelper CAKE_4 = new ProductViewHelper("Cake", "Sponge", "cake/cake-4.jpeg", "", "350", "kg", "King Cakes");

    public static final ProductListingViewHelper VENUE_PRODUCT_LISTING_VIEW_HELPER
            = ProductListingViewHelper.builder()
            .productViewHelper(VENUE_GK)
            .productViewHelper(VENUE_HABLIS)
            .productViewHelper(VENUE_KUBERA)
            .productViewHelper(VENUE_NILA)
            .productViewHelper(VENUE_SRINIVASA)
            .build();

    public static final ProductListingViewHelper CAKE_PRODUCT_LISTING_VIEW_HELPER
            = ProductListingViewHelper.builder()
            .productViewHelper(CAKE_1)
            .productViewHelper(CAKE_2)
            .productViewHelper(CAKE_3)
            .productViewHelper(CAKE_4)
            .build();

    public static final Map<String, ProductListingViewHelper> PRODUCT_TYPE_PRODUCT_LISTING = ImmutableMap.of("Venue", VENUE_PRODUCT_LISTING_VIEW_HELPER, "Cake", CAKE_PRODUCT_LISTING_VIEW_HELPER);
}
