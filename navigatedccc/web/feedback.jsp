<%-- 
    Document   : search
    Created on : Jul 9, 2017, 1:13:12 PM
    Author     : yankees
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Select your destination - Delaware County Community College </title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="custom.css" rel="stylesheet">
    <script src="js/ie-emulation-modes-warning.js"></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
     <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </head>
    <body>
        <div class="container">
         <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="Home" class="active"><a href="index.jsp">Home</a></li>
            <li role="About"><a href="#">About</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Dccc :.. Navigation Project </h3>
      </div>

      <div class="jumbotron">
        <h2>Navigation Project</h2>
        <p class="lead">DCCC helps you to find yourself, our's helps you find your classroom.</p>
        <p><a class="btn btn-lg btn-success" href="search.jsp" role="button">Get direction</a></p>
      </div>
        <h1>Select your destination</h1>
        <form name="myForm" action="displaySearch.jsp" method="POST">
            
            <div class="form-group">
                <label for="exampleSourceLocation">Enter your current location :</label>
                <input type="text" name="source_location" class="form-control" id="exampleSourceLocation" placeholder="Source Location">
            </div>
            
            <div class="form-group">
                <label for="exampleDestinationLocation">Enter your final location :</label>
                <input type="text" name="destination_location" class="form-control" id="exampleDestinationLocation" placeholder="Destination Location">
            </div>
            
            <button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg btn-block">Submit</button>
            <button type="reset" name="clear" value="clear" class="btn btn-default btn-lg btn-block">Clear</button>
              
        </form>
    </body>
</html>
