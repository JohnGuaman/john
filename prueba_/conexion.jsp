<%-- 
    Document   : conexion
    Created on : 05-feb-2019, 9:02:56
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.PreparedStatement"
        import="java.sql.ResultSet"
        import="java.sql.Statement"
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        Connection conex=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL="jdbc:sqlserver://JOHN;"+"database=DOCENTE;"+"user=sa;"+"password=fenixtkd;";
            conex=DriverManager.getConnection(connectionURL);
        }
        catch(Exception e)
        {
            
            out.print("ERROR EN LA CONECCION");
        }
%>
    </body>
</html>
