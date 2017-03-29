<!doctype html>
<html>
<head>

    <meta name="layout" content="nav_footer"/>
    <title>Home</title>

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
            <h1 class="page-header">Party 2 Plan</h1>

            <div class="row placeholders">
                <!-- Single button -->
                <div class="btn-group">
                    <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                        Location <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <g:each in="${homeViewHelper.locations}" var="location">
                            <li><a href="#">${location}</a></li>
                        %{--TODO why <a href> is needed for location?--}%
                        </g:each>
                    </ul>
                </div>
            </div>

            <div class="row">
                <g:each in="${homeViewHelper.eventTypeViewHelpers}" var="eventTypeViewHelper">
                    <g:link controller="Plan" action="index" params="[eventTypeName:eventTypeViewHelper.eventTypeName]">
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <asset:image src="${eventTypeViewHelper.homePageThumbnailUrl}"
                                             alt="Generic placeholder thumbnail"/>
                                <div class="caption">
                                    <h4>${eventTypeViewHelper.eventTypeName}</h4>
                                </div>
                            </div>
                        </div>
                    </g:link>
                </g:each>
            </div>

        </div>
    </div>
</div>

</body>
</html>
