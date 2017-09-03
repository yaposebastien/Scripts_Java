<%-- 
    Document   : displaySearch
    Created on : Jul 9, 2017, 1:13:38 PM
    Author     : yankees
--%>



<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head><meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Display selected destination - Delaware County Community College </title>

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
                                "SELECT * FROM navigate WHERE source_location= ? AND destination_location = ? ");
                                
                        } catch (SQLException e) {
                            e.printStackTrace();
                            }
                        } //End contructor Class Navigate
                        
                        public ResultSet getNavigates(String source_location, String destination_location) {
                            try {
                                selectNavigate.setString(1, source_location);
                                selectNavigate.setString(2, destination_location);
                                resultSet = selectNavigate.executeQuery();
                                
                            } catch (SQLException e) {
                                e.printStackTrace();
                                
                                }
                                return resultSet;
                        } //End class ResultSet
                    }//End Class Navigate
                    %>
                    
                    <%
                        String source_location = new String();
                        String destination_location = new String();
                        
                        if(request.getParameter("source_location") != null) {
                            source_location = request.getParameter("source_location");
                        }
                        if(request.getParameter("destination_location") != null) {
                            destination_location = request.getParameter("destination_location");
                        }
                        
                        Navigate navigate = new Navigate();
     
                        ResultSet navigates = navigate.getNavigates(source_location, destination_location);
                        
                        
                        
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
                 
       <div class="panel panel-default">
                        <!-- Default panel contents -->
                        <div class="panel-heading" align="center">The result of your selected location.</div>

                            <!-- Table -->
                            <table class="table table-hover table-condensed table-striped">
                              <tr>
                                   <td class="info"> <p><b>N°:</b></p></td>
                                   <td class="info"><p> <b>Source :</b></p></td>
                                   <td class="info"> <p><b>Detail source :</b></p></td>
                                   <td class="info"><p> <b> Destination :</b></p></td>
                                   <td class="info"> <p><b> Detail destination :</b></p></td>
                                   <td class="info"><p> <b> Action :</b></p></td>
                             </tr>
                               <% while (navigates.next()) { %>
                             <tr>
                                 <td><%= navigates.getString("location_id") %></td>
                                 <td><%= navigates.getString("source_location") %></td>
                                 <td><%= navigates.getString("description_source") %></td>
                                 <td><%= navigates.getString("destination_location") %></td>
                                 <td><%= navigates.getString("description_destination") %></td>
                                 <td><a href="<%= navigates.getString("url_location") %>" class="btn btn-primary btn-sm active" role="button">Direction</a></td>
                                 
                                 

                             </tr>
    
                            
                            </table><table  class="table table-hover table-condensed table-striped" >
                                
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="videoWrapper">
                                             
                                             <iframe width="800" height="400" src="<%= navigates.getString("url_location") %>" frameborder="0" allowfullscreen></iframe>
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

                            <% } %>



    </body>
</html>
