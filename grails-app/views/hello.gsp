<!DOCTYPE HTML>
<html>
<head>
    <title>Demo App</title>
    <asset:stylesheet src="bootstrap.css" rel="stylesheet"/>
</head>
<body>
<div class="content">
    <div class="jumbotron">
        <h1>Grails Tutorial</h1>
        <p><h1>Hello ${name.firstName} _ ${name.lastName}</h1></p>
        <g:link controller="home" action="index" class="btn btn-primary">Go back</g:link>
    </div>

</div>
</body>
</html>