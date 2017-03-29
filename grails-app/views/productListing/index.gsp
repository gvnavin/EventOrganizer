<!DOCTYPE html>
<html>
<head>

    <meta name="layout" content="nav_footer"/>
    <title>Product Listing</title>

</head>

<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Reports</a></li>
                <li><a href="#">Analytics</a></li>
                <li><a href="#">Export</a></li>
            </ul>
        </div>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="row">
                <h3>${productListingViewHelper.productViewHelpers[0].productType}</h3>
                <g:each in="${productListingViewHelper.productViewHelpers}" var="productViewHelper">
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <asset:image src="${productViewHelper.thumbnailUrl}"
                                         alt="Generic placeholder thumbnail"/>
                            <div class="caption">
                                <h4>${productViewHelper.name}</h4>
                                <h6>${productViewHelper.location}</h6>
                                <h6>Rs. ${productViewHelper.price} per ${productViewHelper.unit}</h6>
                            </div>
                        </div>
                    </div>
                </g:each>
            </div>
        </div>
    </div>
</div>

</body>
</html>