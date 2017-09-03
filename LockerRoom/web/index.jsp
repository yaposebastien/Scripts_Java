<%-- 
    Document   : index
    Created on : Jun 22, 2017, 5:18:24 PM
    Author     : yankees
--%>
<%@page import="java.util.Date" %>
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
    <%
    Date date= new Date();
    %>
    
   
    <body>
         <%
            String lockerid = request.getParameter("lockerid");
            String assignto = request.getParameter("employee");
            
        %>
         <%!
                    public class Locker {
                        String URL = "jdbc:mysql://localhost:3306/lockerdb";
                        String USERNAME = "root";
                        String PASSWORD = "2001vjanv1981binger";

                        Connection connection = null;
                        PreparedStatement selectLockers = null;
                        ResultSet resultSet = null;
                        
                        public Locker() {
                        try {
                            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                            selectLockers = connection.prepareStatement(
                                "SELECT lockerid,assignedto FROM locker ");
                        
                        } catch (SQLException e) {
                            e.printStackTrace();
                            }
                        } //End contructor Class Locker
                        
                        public ResultSet getLockers() {
                            try {
                                resultSet = selectLockers.executeQuery();
                            } catch (SQLException e) {
                                e.printStackTrace();
                                }
                                return resultSet;
                        } //End class ResultSet
                    }//End Class Locker
                    %>
                    <%
                        Locker locker = new Locker();
                        ResultSet lockers = locker.getLockers();
                     %>
      
      
      <div class="container">
         <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="index" class="active"><a href="index.jsp">Home</a></li>
            <li role="presentation"><a href="#">About</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Lockeroom Management </h3>
      </div>

      <div class="jumbotron">
        <h2>Lockeroom Management</h2>
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
       
       <div class="panel panel-default">
                        <!-- Default panel contents -->
                        <div class="panel-heading">List of assigned lockers.</div>

                            <!-- Table -->
                            <table class="table">
                              <tr>
                                  <td> <p><b># LOCKER ID :</b></p></td>
                                 <td><p> <b># ASSIGNED TO :</b></p></td>
                             </tr>
                               <% while (lockers.next()) { %>
                             <tr>
                                 <td><%= lockers.getString("lockerid") %></td>
                                 <td><%= lockers.getString("assignedto") %></td>
                             </tr>
                             <% } %>
                            </table>
                        </div>
                     
                     </div>
          
     
      <footer class="footer">
        <p align='center'>&copy; 2017 Covanta, Inc.</p>
      </footer>

    </body>
</html>
