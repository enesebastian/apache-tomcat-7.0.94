/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-28 18:09:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class tabela_005fArtisti_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://static.pingendo.com/bootstrap/bootstrap-4.1.3.css\">\n");
      out.write("</head>\n");
      out.write("    ");
      db.JavaBean jb = null;
      synchronized (session) {
        jb = (db.JavaBean) _jspx_page_context.getAttribute("jb", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (jb == null){
          jb = new db.JavaBean();
          _jspx_page_context.setAttribute("jb", jb, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("jb"), request);
      out.write("\n");
      out.write("<body style=\"\tbackground-image: url(/images/yannis-papanastasopoulos-yWF2LLan-_o-unsplash.jpg);\tbackground-position: top left;\tbackground-size: 100%;\tbackground-repeat: repeat;\">\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\" >\n");
      out.write("    <div class=\"container\"> <button class=\"navbar-toggler navbar-toggler-right border-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar13\" style=\"\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbar13\"> <a class=\"navbar-brand d-none d-md-block\" href=\"index.html\">\n");
      out.write("          <i class=\"fa fa-users\"></i>\n");
      out.write("          <b> ACASA</b>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"navbar-nav mx-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"tabela_Concerte.jsp\">CONCERTE</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"tabela_Artisti.jsp\">ARTISTI</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"tabela_Melodie.jsp\">MELODII</a> </li>\n");
      out.write("        </ul>\n");
      out.write("  \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <h1 class=\"text-light shadow-lg bg-dark\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ARTISTI<br></h1>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"py-5\" style=\"\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("              <form action=\"sterge_Artist.jsp\" method=\"post\">\n");
      out.write("            <table class=\"table table-bordered \">\n");
      out.write("              <thead class=\"thead-dark\">\n");
      out.write("                <tr>\n");
      out.write("                  <th class=\"table-primary text-light\">Mark</th>\n");
      out.write("                  <th>idArtist</th>\n");
      out.write("                  <th>nume</th>\n");
      out.write("                  <th>tip</th>\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                ");

                    jb.connect();
                    ResultSet rs = jb.vedeTabela("artisti");
                    long x;
                    while (rs.next()) {
                        x = rs.getInt("idartist");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"text-light table-dark\" ><input type=\"checkbox\" name=\"primarykey\"  value=\"");
      out.print( x);
      out.write("\" /></td><td class=\"text-light table-dark\">");
      out.print( x);
      out.write("</td>\n");
      out.write("                    <td class=\"text-light table-dark\">");
      out.print( rs.getString("nume"));
      out.write("</td>\n");
      out.write("                    <td class=\"text-light table-dark\">");
      out.print( rs.getString("tip"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table><br/>\n");
      out.write("            <p align=\"center\" >\n");
      out.write("                <input type=\"submit\" value=\"Sterge liniile marcate\" class=\"btn btn-outline-dark w-100 btn-lg\">\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("        ");

            rs.close();
            jb.disconnect();
        
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\"><a class=\"btn btn-outline-dark w-100 mb-4 btn-lg\" href=\"nou_Artist.jsp\">Adauga Artist</a><a class=\"btn btn-outline-dark w-100 btn-lg\" href=\"index.html\" >Home</a></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\"></div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
