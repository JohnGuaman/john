<%-- 
    Document   : buscar
    Created on : 05-feb-2019, 9:22:46
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="buscar.jsp" method="post">
       <%@include file="conexion.jsp" %> 
       
        <table>
            <tr><td><input type="text" name="nom"></td><td><input type="button" name="buscar" value="buscar"></td></tr>
            
            <%
            if (request.getParameter("buscar")!=null)
            {
             try{
                 String nombre= request.getParameter("nom");
                 PreparedStatement ps=conex.prepareStatement("SELECT * FROM MAQUINARIA WHERE NOMBRE_MAQ='"+nombre+"'");
                 ResultSet rs= ps.executeQuery();
                
                 %>
                 <TR><th>codigo</th><th>nombre</th><th>precio</th></TR>
            <%
                while(rs.next()==true)
                {
                 %>
                                 
                 <tr>
                 <td><input type="text" name="n" value="<%out.print(rs.getString("CODIGO_MAQ"));%>"></td>
                 <td><input type="text" name="DD" value="<%out.print(rs.getString("NOMBRE_MAQ"));%>"></td>
                 <td><input type="text" name="D" value="<%out.print(rs.getString("PRECIO_MAQ"));%>"></td>
                 <tr>
                 <%    }
             } 
             catch(Exception e)
                     {
                       out.print("no se ha encontrado");  
                     }
            }
            %>
        </table>
       
        </form>
    </center>
    </body>
</html>
