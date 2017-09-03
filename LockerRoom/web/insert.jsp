<%-- 
    Document   : insert
    Created on : Jun 30, 2017, 11:07:15 PM
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
    <body onload="displayResults()">
  
        <%!
                    public class Locker {
                        String URL = "jdbc:mysql://localhost:3306/lockerdb";
                        String USERNAME = "root";
                        String PASSWORD = "2001vjanv1981binger";

                        Connection connection = null;
                        PreparedStatement insertLockers = null;
                        ResultSet resultSet = null;
                        
                        //creation d'une classe particuliere pour la table et la requete SQL
                        public Locker() {
                        try {
                            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                            insertLockers = connection.prepareStatement(
                            "INSERT INTO locker (lockerid,assignedto)"
                            + "VALUES (?,?)");

                                
                        
                        } catch (SQLException e) {
                            e.printStackTrace();
                            }
                        } //End contructor Class Locker
                        
                        //Creation d'une methode pour assigner les valeurs de la classe a partir du formulaire
                       public int setLockers (String lockerid, String assignedto) {
                            int result = 0;
                            try {
                                insertLockers.setString(1, lockerid);
                                insertLockers.setString(2,assignedto);
                                result = insertLockers.executeUpdate();

                            } catch (SQLException e) {
                                e.printStackTrace();
                                }
                            return result;
                        }
                    }//End Class Locker
                    %>
                    
                   
                    <%
                        int result = 0;
                        if (request.getParameter("submit") !=null) {
                            
                       
                        String lockeridParam = new String();
                        String assignedtoParam = new String();
                        //Verifier si la valeur n'est pas null
                        if (request.getParameter("lockerid") != null) {
                            lockeridParam = request.getParameter("lockerid");
                        }
                        
                        if (request.getParameter("assignedto") != null) {
                            assignedtoParam = request.getParameter("assignedto");
                        }
                        
                        Locker locker = new Locker();
                        result = locker.setLockers(lockeridParam,assignedtoParam);
                        
                        } 
                        
                        
                    %>
    
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
      <form name="insertForm" action="insert.jsp" method="POST">
          <div>
          <span class="input-group-addon" id="sizing-addon1">Locker ID:</span>
            <select name="lockerid" class="form-control" placeholder="Locker ID" >
                <option>Select locker number </option>
                <option>Row 1-A1</option>
                <option>Row 1-A2</option>
                <option>Row 1-A3</option>
                <option>Row 1-A4</option>
                <option>Row 1-A5</option>
                <option>Row 1-A6</option>
                <option>Row 1-A7</option>
                <option>Row 1-A8</option>
                <option>Row 1-A9</option>
                <option>Row 1-A10</option>
                <option>Row 1-A11</option>
                <option>Row 1-A12</option>
                <option>Row 2-A13</option>
                <option>Row 2-A14</option>
                <option>Row 2-A15</option>
                <option>Row 2-A16</option>
                <option>Row 2-A17</option>
                <option>Row 2-A18</option>
                <option>Row 2-A19</option>
                <option>Row 2-A20</option>
                <option>Row 2-A21</option>
                <option>Row 1-B1</option>
                <option>Row 1-B2</option>
                <option>Row 1-B3</option>
                
                
            </select>
          </div>
           <div><p> </p> </div> 
          
          <div>
          <span class="input-group-addon" id="sizing-addon1">Locker ID:</span>
            <select name="assignedto" class="form-control" placeholder="Select employee" >
                <option>Select employee </option>
                <option>Steve Palmer</option>
                <option>Vaughn Anthony</option>
                <option>Darryl Townsend</option>
                <option>Buddy Washington</option>
                 <option>Sebastien Yapo</option>
            </select>
          </div>    
           
      <div><p> </p> </div> 
        <input type="hidden" name="hidden" value="<%= result %>" />
        <button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg btn-block">Submit</button>
        <button type="reset" name="clear" value="clear" class="btn btn-default btn-lg btn-block">Clear</button>
        </form> 

           
            

       
            <script language="JavaScript">
                //<!--
                function displayResults() 
                {
                    if(document.insertForm.hidden.value == 1) {
                        alert("Locker successfully assigned");
                    }
                }
            </script>
    </body>
</html>
