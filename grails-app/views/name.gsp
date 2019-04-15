<!doctype html>
<html>
<head>
    <title>Demo App</title>
    <asset:stylesheet src="bootstrap.css" rel="stylesheet"/>
</head>

<body>
<g:form controller="home" action="save" method="post">
    <div class="input-group mb-3" style="width: 50%;">
        <div class="input-group-prepend">
            <span class="input-group-text">Person</span>
        </div>
        <input type="text" name="firstName" class="form-control" placeholder="First Name">
        <input type="text" name="lastName" class="form-control" placeholder="Last Name">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</g:form>
</body>
</html>