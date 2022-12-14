package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>MultiShop - Online Shop Website Template</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Topbar Start -->\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row bg-secondary py-1 px-xl-5\">\r\n");
      out.write("            <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("                <div class=\"d-inline-flex align-items-center h-100\">\r\n");
      out.write("                    <a class=\"text-body mr-3\" href=\"\">About</a>\r\n");
      out.write("                    <a class=\"text-body mr-3\" href=\"\">Contact</a>\r\n");
      out.write("                    <a class=\"text-body mr-3\" href=\"\">Help</a>\r\n");
      out.write("                    <a class=\"text-body mr-3\" href=\"\">FAQs</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-6 text-center text-lg-right\">\r\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">My Account</button>\r\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">Sign in</button>\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">Sign up</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"btn-group mx-2\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">USD</button>\r\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">EUR</button>\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">GBP</button>\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">CAD</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">EN</button>\r\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">FR</button>\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">AR</button>\r\n");
      out.write("                            <button class=\"dropdown-item\" type=\"button\">RU</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-inline-flex align-items-center d-block d-lg-none\">\r\n");
      out.write("                    <a href=\"\" class=\"btn px-0 ml-2\">\r\n");
      out.write("                        <i class=\"fas fa-heart text-dark\"></i>\r\n");
      out.write("                        <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"btn px-0 ml-2\">\r\n");
      out.write("                        <i class=\"fas fa-shopping-cart text-dark\"></i>\r\n");
      out.write("                        <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex\">\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                <a href=\"\" class=\"text-decoration-none\">\r\n");
      out.write("                    <span class=\"h1 text-uppercase text-primary bg-dark px-2\">Multi</span>\r\n");
      out.write("                    <span class=\"h1 text-uppercase text-dark bg-primary px-2 ml-n1\">Shop</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4 col-6 text-left\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search for products\">\r\n");
      out.write("                        <div class=\"input-group-append\">\r\n");
      out.write("                            <span class=\"input-group-text bg-transparent text-primary\">\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4 col-6 text-right\">\r\n");
      out.write("                <p class=\"m-0\">Customer Service</p>\r\n");
      out.write("                <h5 class=\"m-0\">+012 345 6789</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-dark mb-30\">\r\n");
      out.write("        <div class=\"row px-xl-5\">\r\n");
      out.write("            <div class=\"col-lg-3 d-none d-lg-block\">\r\n");
      out.write("                <a class=\"btn d-flex align-items-center justify-content-between bg-primary w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; padding: 0 30px;\">\r\n");
      out.write("                    <h6 class=\"text-dark m-0\"><i class=\"fa fa-bars mr-2\"></i>Categories</h6>\r\n");
      out.write("                    <i class=\"fa fa-angle-down text-dark\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 999;\">\r\n");
      out.write("                    <div class=\"navbar-nav w-100\">\r\n");
      out.write("                        <div class=\"nav-item dropdown dropright\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Dresses <i class=\"fa fa-angle-right float-right mt-1\"></i></a>\r\n");
      out.write("                            <div class=\"dropdown-menu position-absolute rounded-0 border-0 m-0\">\r\n");
      out.write("                                <a href=\"\" class=\"dropdown-item\">Men's Dresses</a>\r\n");
      out.write("                                <a href=\"\" class=\"dropdown-item\">Women's Dresses</a>\r\n");
      out.write("                                <a href=\"\" class=\"dropdown-item\">Baby's Dresses</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Shirts</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Jeans</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Swimwear</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Sleepwear</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Sportswear</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Jumpsuits</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Blazers</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Jackets</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-item nav-link\">Shoes</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-9\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0\">\r\n");
      out.write("                    <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\r\n");
      out.write("                        <span class=\"h1 text-uppercase text-dark bg-light px-2\">Multi</span>\r\n");
      out.write("                        <span class=\"h1 text-uppercase text-light bg-primary px-2 ml-n1\">Shop</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\r\n");
      out.write("                        <div class=\"navbar-nav mr-auto py-0\">\r\n");
      out.write("                            <a href=\"index.html\" class=\"nav-item nav-link\">Home</a>\r\n");
      out.write("                            <a href=\"shop.html\" class=\"nav-item nav-link\">Shop</a>\r\n");
      out.write("                            <a href=\"detail.html\" class=\"nav-item nav-link\">Shop Detail</a>\r\n");
      out.write("                            <div class=\"nav-item dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"nav-link dropdown-toggle active\" data-toggle=\"dropdown\">Pages <i class=\"fa fa-angle-down mt-1\"></i></a>\r\n");
      out.write("                                <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\r\n");
      out.write("                                    <a href=\"cart.html\" class=\"dropdown-item active\">Shopping Cart</a>\r\n");
      out.write("                                    <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"contact.html\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\r\n");
      out.write("                            <a href=\"\" class=\"btn px-0\">\r\n");
      out.write("                                <i class=\"fas fa-heart text-primary\"></i>\r\n");
      out.write("                                <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"\" class=\"btn px-0 ml-3\">\r\n");
      out.write("                                <i class=\"fas fa-shopping-cart text-primary\"></i>\r\n");
      out.write("                                <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Breadcrumb Start -->\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row px-xl-5\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <nav class=\"breadcrumb bg-light mb-30\">\r\n");
      out.write("                    <a class=\"breadcrumb-item text-dark\" href=\"#\">Home</a>\r\n");
      out.write("                    <a class=\"breadcrumb-item text-dark\" href=\"#\">Shop</a>\r\n");
      out.write("                    <span class=\"breadcrumb-item active\">Shopping Cart</span>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Breadcrumb End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Cart Start -->\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row px-xl-5\">\r\n");
      out.write("            <div class=\"col-lg-8 table-responsive mb-5\">\r\n");
      out.write("                <table class=\"table table-light table-borderless table-hover text-center mb-0\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Products</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Quantity</th>\r\n");
      out.write("                            <th>Total</th>\r\n");
      out.write("                            <th>Remove</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"align-middle\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"align-middle\"><img src=\"img/product-1.jpg\" alt=\"\" style=\"width: 50px;\"> Product Name</td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\">\r\n");
      out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\r\n");
      out.write("                                        <i class=\"fa fa-minus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary border-0 text-center\" value=\"1\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-times\"></i></button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"align-middle\"><img src=\"img/product-2.jpg\" alt=\"\" style=\"width: 50px;\"> Product Name</td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\">\r\n");
      out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\r\n");
      out.write("                                        <i class=\"fa fa-minus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary border-0 text-center\" value=\"1\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-times\"></i></button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"align-middle\"><img src=\"img/product-3.jpg\" alt=\"\" style=\"width: 50px;\"> Product Name</td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\">\r\n");
      out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\r\n");
      out.write("                                        <i class=\"fa fa-minus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary border-0 text-center\" value=\"1\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-times\"></i></button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"align-middle\"><img src=\"img/product-4.jpg\" alt=\"\" style=\"width: 50px;\"> Product Name</td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\">\r\n");
      out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\r\n");
      out.write("                                        <i class=\"fa fa-minus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary border-0 text-center\" value=\"1\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-times\"></i></button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"align-middle\"><img src=\"img/product-5.jpg\" alt=\"\" style=\"width: 50px;\"> Product Name</td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\">\r\n");
      out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\r\n");
      out.write("                                        <i class=\"fa fa-minus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary border-0 text-center\" value=\"1\">\r\n");
      out.write("                                    <div class=\"input-group-btn\">\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\r\n");
      out.write("                                            <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"align-middle\">$150</td>\r\n");
      out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-times\"></i></button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                <form class=\"mb-30\" action=\"\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control border-0 p-4\" placeholder=\"Coupon Code\">\r\n");
      out.write("                        <div class=\"input-group-append\">\r\n");
      out.write("                            <button class=\"btn btn-primary\">Apply Coupon</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <h5 class=\"section-title position-relative text-uppercase mb-3\"><span class=\"bg-secondary pr-3\">Cart Summary</span></h5>\r\n");
      out.write("                <div class=\"bg-light p-30 mb-5\">\r\n");
      out.write("                    <div class=\"border-bottom pb-2\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between mb-3\">\r\n");
      out.write("                            <h6>Subtotal</h6>\r\n");
      out.write("                            <h6>$150</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                            <h6 class=\"font-weight-medium\">Shipping</h6>\r\n");
      out.write("                            <h6 class=\"font-weight-medium\">$10</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pt-2\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between mt-2\">\r\n");
      out.write("                            <h5>Total</h5>\r\n");
      out.write("                            <h5>$160</h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"btn btn-block btn-primary font-weight-bold my-3 py-3\">Proceed To Checkout</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Cart End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-dark text-secondary mt-5 pt-5\">\r\n");
      out.write("        <div class=\"row px-xl-5 pt-5\">\r\n");
      out.write("            <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\r\n");
      out.write("                <h5 class=\"text-secondary text-uppercase mb-4\">Get In Touch</h5>\r\n");
      out.write("                <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor. Rebum tempor no vero est magna amet no</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\r\n");
      out.write("                <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-8 col-md-12\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                        <h5 class=\"text-secondary text-uppercase mb-4\">Quick Shop</h5>\r\n");
      out.write("                        <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\r\n");
      out.write("                            <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                        <h5 class=\"text-secondary text-uppercase mb-4\">My Account</h5>\r\n");
      out.write("                        <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\r\n");
      out.write("                            <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\r\n");
      out.write("                            <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                        <h5 class=\"text-secondary text-uppercase mb-4\">Newsletter</h5>\r\n");
      out.write("                        <p>Duo stet tempor ipsum sit amet magna ipsum tempor est</p>\r\n");
      out.write("                        <form action=\"\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Your Email Address\">\r\n");
      out.write("                                <div class=\"input-group-append\">\r\n");
      out.write("                                    <button class=\"btn btn-primary\">Sign Up</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <h6 class=\"text-secondary text-uppercase mt-4 mb-3\">Follow Us</h6>\r\n");
      out.write("                        <div class=\"d-flex\">\r\n");
      out.write("                            <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-primary btn-square\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row border-top mx-xl-5 py-4\" style=\"border-color: rgba(256, 256, 256, .1) !important;\">\r\n");
      out.write("            <div class=\"col-md-6 px-xl-0\">\r\n");
      out.write("                <p class=\"mb-md-0 text-center text-md-left text-secondary\">\r\n");
      out.write("                    &copy; <a class=\"text-primary\" href=\"#\">Domain</a>. All Rights Reserved. Designed\r\n");
      out.write("                    by\r\n");
      out.write("                    <a class=\"text-primary\" href=\"https://htmlcodex.com\">HTML Codex</a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\r\n");
      out.write("                <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Back to Top -->\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Contact Javascript File -->\r\n");
      out.write("    <script src=\"mail/jqBootstrapValidation.min.js\"></script>\r\n");
      out.write("    <script src=\"mail/contact.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
