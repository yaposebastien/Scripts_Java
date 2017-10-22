<%-- 
    Document   : index
    Created on : Jul 6, 2017, 8:35:22 PM
    Author     : yankees
--%>


<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>

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

    <title>Delaware County Community College - Navigation Project </title>

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
        <%
            String location_id = request.getParameter("location_id");
            String source_location = request.getParameter("source_location");
            String description_source = request.getParameter("description_source");
            String destination_location = request.getParameter("destination_location");
            String description_destination = request.getParameter("description_destination");
            String url_location = request.getParameter("url_location");
        %>
        
         <%!
                    public class Navigate {
                        String URL = "jdbc:mysql://localhost:3306/navigatedccc";
                        String USERNAME = "yaposebastien";
                        String PASSWORD = "!yaposebastien!";

                        Connection connection = null;
                        PreparedStatement selectNavigate = null;
                        ResultSet resultSet = null;
                        
                        public Navigate() {
                        try {
                            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                            selectNavigate = connection.prepareStatement(
                                "SELECT * FROM navigate");
                        
                        } catch (SQLException e) {
                            e.printStackTrace();
                            }
                        } //End contructor Class Navigate
                        
                        public ResultSet getNavigates() {
                            try {
                                resultSet = selectNavigate.executeQuery();
                            } catch (SQLException e) {
                                e.printStackTrace();
                                }
                                return resultSet;
                        } //End class ResultSet
                    }//End Class Navigate
                    %>
                    
                     <%
                        Navigate navigate = new Navigate();
                        ResultSet navigates = navigate.getNavigates();
                     %>
                     
                     
        <div class="container">
         <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-left">
            <li role="Home" class="active"><a href="index.jsp">Home</a></li>
            <li role="About"><a href="about.jsp">About</a></li>
            
          </ul>
            <div>
                <form name="myForm" class="navbar-form navbar-right" action="displaySearch.jsp" method="POST">
            <div class="form-group" >
              <input type="text" placeholder="initial" class="form-control" name="source_location">
            </div>
            <div class="form-group">
              <input type="text" placeholder="destination" name="destination_location" class="form-control">
            </div>
            <button type="submit" name="submit" value="submit"class="btn btn-success">Search</button>
          </form>
            </div>
        </nav>
      </div>
             

      
      
            <div>
                <p>Most students, especially new students and visitors tend to get lost while trying to access the following offices; The Financial Aid Office, Student Advising Center, Student Employment Office, Learning Commons (library, tutoring services) and The Learning/Testing assessment center.</p>
                <p>These are among the important areas identified. The I.P.S will help save a lot of time that would be spent trying to find your way.</p>
                <p>How does it work? You may ask. Well it’s simple. Upon downloading the app, you will be required to input your desired destination. The school’s blueprint will then open with the destination you requested.</p>
                <p>You will then receive a link on your mobile device that will show you the direction from your exact position. You will also be able to view a short film from the link that would help in the event you do not understand the directions provided. The clip will act as a guide.
</p>
                <p>For the indoor positioning system to function effectively, we require clear pictures of the entire school building.</p>
                <p>We are therefore requesting for volunteers to help us take the required photos and videos to be used in our system. We also welcome any students that have great new ideas that could be used in the second phase of our I.P.S project.</p>
                <p></p>
                <p></p>
                <p></p>
                <p></p>
            </div>
      
       
      
                     
        </div>
          
     
        
    </body>
</html>
