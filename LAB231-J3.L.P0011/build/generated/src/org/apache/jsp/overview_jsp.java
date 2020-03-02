package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class overview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/display.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      Controller.CountFilter counter = null;
      synchronized (application) {
        counter = (Controller.CountFilter) _jspx_page_context.getAttribute("counter", PageContext.APPLICATION_SCOPE);
        if (counter == null){
          counter = new Controller.CountFilter();
          _jspx_page_context.setAttribute("counter", counter, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html lang=\"en-US\" class=\"\">\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>My Blog</title>\n");
      out.write("\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"./home_files/9767673.design.v27169.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"https://kit.fontawesome.com/eee6e774ce.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script async=\"\" src=\"./home_files/gtm.js.download\"></script>            \n");
      out.write("\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("                .fancybox-margin {\n");
      out.write("                    margin-right: 17px;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body data-pid=\"422328564\" data-iid=\"\">\n");
      out.write("            <div class=\"container-fluid site-wrapper\">            \n");
      out.write("                <div class=\"container-fluid header-wrapper \" id=\"header\">                \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"title-wrapper\">\n");
      out.write("                            <div class=\"title-wrapper-inner\">\n");
      out.write("                                <a rel=\"nofollow\" class=\"logo \" href=\"\">\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"title \">\n");
      out.write("                                    Blogging About My Life\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"subtitle\">\n");
      out.write("                                    Welcome to my blog\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"navbar navbar-compact\">\n");
      out.write("                            <div class=\"navbar-inner\">\n");
      out.write("                                <div class=\"container\">                          \n");
      out.write("                                    <a rel=\"nofollow\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"\n");
      out.write("                                       title=\"Toggle menu\">\n");
      out.write("                                        <span class=\"menu-name\">Menu</span>\n");
      out.write("                                        <span class=\"menu-bars\">\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>                                \n");
      out.write("                                    <div class=\"nav-collapse collapse\">\n");
      out.write("                                        <ul class=\"nav\" id=\"topMenu\" data-submenu=\"horizontal\">\n");
      out.write("                                            <li class=\" active \" style=\"\">\n");
      out.write("                                                <a rel=\"nofollow\" href=\"index.jsp\">My\n");
      out.write("                                                    Blog</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"  \" style=\"\">\n");
      out.write("                                                <a rel=\"nofollow\" href=\"aboutme.jsp\">About\n");
      out.write("                                                    Me</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                    \n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"container-fluid content-wrapper\" id=\"content\">                \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row-fluid content-inner\">\n");
      out.write("                            <div id=\"left\" class=\"span9\">\n");
      out.write("                                <div class=\"wrapper blogoverview\">\n");
      out.write("                                    <div class=\"heading\">\n");
      out.write("                                        <h1 class=\"page-title\">Overview - My Blog</h1>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"section\">\n");
      out.write("                                            <div class=\"content\">\n");
      out.write("                                                <table class=\"table\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th name=\"month-year\" colspan=\"3\">February 2020</th>\n");
      out.write("                                                            <th name=\"date\" class=\"align-right\">Date</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"right\" class=\"span3 \">\n");
      out.write("                            <div class=\" sidebar\">\n");
      out.write("                                <div class=\"wrapper share-box\">\n");
      out.write("                                    <style>\n");
      out.write("                                        .wordwrapfix {\n");
      out.write("                                            word-wrap: break-word;\n");
      out.write("                                        }\n");
      out.write("                                    </style>\n");
      out.write("                                    <div class=\"heading wordwrapfix\">\n");
      out.write("                                        <h4>Share this page</h4>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"content\"><span>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><a id=\"share-facebook\"\n");
      out.write("                                                       href=\"\"><i class=\"fab fa-facebook-square\"></i><span>Share on\n");
      out.write("                                                            Facebook</span></a></li>\n");
      out.write("                                                <li><a id=\"share-twitter\"\n");
      out.write("                                                       href=\"\"><i class=\"fab fa-twitter-square\"></i><span>Share on Twitter</span></a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </span></div>\n");
      out.write("                                </div>                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>      \n");
      out.write("\n");
      out.write("                </div>        \n");
      out.write("                <div class=\"container-fluid footer-wrapper\" id=\"footer\">                \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"footer-info\">\n");
      out.write("                            <div class=\"footer-info-text\">\n");
      out.write("                                This website was created with team 3\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-page-counter\" style=\"display: block;\">\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"css_simplesite_com_fallback\" class=\"hide\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            <div style=\"display: none; visibility: hidden;\">            \n");
      out.write("                <noscript></noscript>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("post");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr data-id=\"3232873\">\n");
          out.write("                                                            <td width=\"60%\"><a\n");
          out.write("                                                                    href=\"DetailServlet?title=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("                                                            <td><i class=\"fas fa-thumbs-up\"></i>0</td>\n");
          out.write("                                                            <td><i class=\"fas fa-comment\"></i>0</td>\n");
          out.write("                                                            <td class=\"align-right\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        </tr>   \n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
