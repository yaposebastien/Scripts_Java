<%-- 
    Document   : insert
    Created on : Jun 30, 2017, 11:07:15 PM
    Author     : yankees
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Covanta Powering Today, Protecting tomorrow </title>

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
    <body >
  
        
        <div class="container">
             <div class="header clearfix">
                 <nav>
                    <ul class="nav nav-pills pull-right">
                      <li role="presentation" class="active"><a href="index.jsp">Home</a></li>
                      <li role="presentation"><a href="#">About</a></li>
                    </ul>
                 </nav>
             <h3 class="text-muted">Lockeroom Manager </h3>
      </div>

      <div class="jumbotron">
        <h2>Lockers Manager</h2>
        <p class="lead">Covanta works with companies and communities to find sustainable solutions to their waste management challenges.</p>
           <table border="0" align='center'>
          
            <tbody>
                <tr>
                    <td><p><a class="btn btn-lg btn-success" href="insert.jsp" role="button">Update</a></p></td>
                       <div><td><p> </p></td></div> 
                    <td><p><a class="btn btn-lg btn-success" href="search.jsp" role="button">Search</a></p></td>
                </tr>
            </tbody>
        </table>
      </div>
      <form name="myForm" action="resultSearch.jsp" method="POST">
          <div class="form-group">
            <label for="employeeNameSearch">Employee Name : </label>
            <input type="text" name="assignedto" class="form-control" id="employeeNameSearch" placeholder="Employee name to research">
         </div>
           <div><p> </p> </div> 
          
          
           
      <div><p> </p> </div> 
       
        <button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg btn-block">Submit</button>
        <button type="reset" name="clear" value="clear" class="btn btn-default btn-lg btn-block">Clear</button>
        </form> 

           
            

       
            
    </body>
</html>
