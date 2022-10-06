package servlet;

import entity.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ntbic
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			ArrayList<Cart> cartList = new ArrayList<>();
			int idd = Integer.parseInt(request.getParameter("productID"));
			Cart pd = new Cart();
			pd.setId(idd);
			pd.setQuantity(1);

			HttpSession session = request.getSession();
			ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
			if (cart_list == null) {
				// neu cart list khong co gi thi tien hanh them item vao cart
				cartList.add(pd);
				session.setAttribute("cart-list", cartList);
				response.sendRedirect("cart.jsp");
			} else {
				cartList = cart_list;
				boolean exist = false;

				for (Cart c : cart_list) {
					if (c.getId() == idd) {
						exist = true;
						out.println("<h1>Item existed. <a href='cart.jsp'>Go to cart</a> </h1>");
						// neu item da co trong gio hang -> khong cho phep add tiep
					}
				}
				if (!exist) {
					cartList.add(pd);
					response.sendRedirect("cart.jsp");
					// neu item dc add va chua co trong cart -> add vao cart va chuyen den cart page
				}
			}
		}
	}

}