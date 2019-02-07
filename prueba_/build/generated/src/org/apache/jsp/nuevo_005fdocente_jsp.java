package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public final class nuevo_005fdocente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conexion.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                ");

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

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <CENTER>\n");
      out.write("        <form action=\"nuevo_docente.jsp\" method=\"post\">\n");
      out.write("            <TABLE>\n");
      out.write("                <TR><TH colspan=\"2\">NUEVO DOCENTE</TH></TR>\n");
      out.write("                <TR><TD>ID</TD><TD><input type=\"text\" name=\"id\"></TD></TR>\n");
      out.write("                <TR><TD>NOMBRE</TD><TD><input type=\"text\" name=\"nombre\"></TD></TR>\n");
      out.write("                <TR><TD>ESPECIALIDAD</TD><TD><input type=\"text\" name=\"especialidad\"></TD></TR>\n");
      out.write("                <TR><TD><input type=\"submit\" name=\"guardar\" value=\"guardar\"></TD></TR>\n");
      out.write("            </TABLE>\n");
      out.write("        </form>\n");
      out.write("        ");

        int id= Integer.parseInt(request.getParameter("id"));
        String nom= request.getParameter("nombre");
        String esp=request.getParameter("especialidad");
        
        if(request.getParameter("guardar")!=null)
        {
         try{
             String sql="insert into DOCENTE values ("+id+",'"+nom+"','"+esp+"')";
             PreparedStatement ps= conex.prepareStatement(sql);
             ps.execute();
         } 
         catch(Exception e)
         {
             out.print("no se pudo guardar");
         }
        }
        
      out.write("\n");
      out.write("    </CENTER>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
