<%-- 
    Document   : insertar_maq
    Created on : 05-feb-2019, 8:54:55
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
        <%@include file="conexion.jsp" %> 
    <center>
        <form action="insertar_maq.jsp" method="post">
            
            <table>
                <tr><th COLSPAN="2">NUEVA MAQUINARIA</th></tr>
                <tr><td>codigo</td><td><input type="text" name="cod"></td></tr>
                <tr><td>nombre</td><td><input type="text" name="nom"></td></tr>
                <tr><td>precio</td><td><input type="text" name="precio"></td></tr>
                <tr><td><input type="submit" name="guardar" value="guardar"></td><td></td></tr>
            </table>
        </form>
    </center>
    <%
        if(request.getParameter("guardar")!=null)
        {
          try{
          int codigo= Integer.parseInt(request.getParameter("cod"));
          String nombre= request.getParameter("nom");
          int precios= Integer.parseInt(request.getParameter("precio"));
              PreparedStatement ps=conex.prepareStatement("INSERT INTO MAQUINARIA VALUES("+codigo+",'"+nombre+"',"+precios+")");
              ps.execute();
              out.print("datos guardados");
          }
          catch(Exception e)
          {
              out.print("no se puede guardar"+e);
          }
        }
    %>
    </body>
</html>
