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
            <h1 class="page-header">Hi Bob, Let's Plan</h1>

            <h4>Location: Adayar</h4>

            <br/>

            <table class="table" border="0">
                <tbody>
                <g:each in="${planViewHelper.requirementViewHelpers}" var="requirement">
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>${requirement.requirementType}</td>
                        <td>
                            <g:link controller="ProductListing" action="index"
                                    params="[listingType: requirement.requirementType]">
                                See More</g:link>
                        </td>
                        <td></td>
                    </tr>
                </g:each>
                </tbody>
            </table>

        </div>
    </div>
</div>

</body>
</html>
