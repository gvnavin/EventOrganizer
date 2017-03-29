<!doctype html>
<html lang="en" class="no-js">
<head>

    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <!-- don't change the below order bootstrap first and dashboard next-->
    %{--<asset:stylesheet src="application.css"/>--}%
    <asset:stylesheet src="bootstrap.css"/>
    <asset:stylesheet src="dashboard.css"/>
    <asset:stylesheet src="sticky-footer.css"/>

    <title>
        <g:layoutTitle default="Welcome to Event Organizer"/>
    </title>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <g:link controller="Home" action="index" class="navbar-brand">Party 2 Plan</g:link>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Login</a></li>
                <li><a href="#">Party Tips</a></li>
            </ul>
            index.gsp
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<g:layoutBody/>

<footer class="footer">
    <div class="container">
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">About us</a></li>
                <li><a href="#">Team</a></li>
                <li><a href="#">Policies</a></li>
                <li><a href="#">Testimonials</a></li>
            </ul>
        </div>
    </div>
</footer>


<asset:javascript src="application.js"/>

</body>
</html>
