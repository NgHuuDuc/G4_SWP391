package controllers.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.entities.Account;
import validators.UserValidator;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        DAO dao = new DAO();
        Account account = new Account().setEmail(email).setPassword(password);
        UserValidator validator = new UserValidator();
        if (validator.checkAccount(account)) {
            request.setAttribute("mess", "Email hoặc Mật khẩu không chính xác. Hãy thử lại !");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("acc", account);

            //luu account len tren cookie
            Cookie e = new Cookie("emailE", email);
            Cookie p = new Cookie("passwordP", password);
            e.setMaxAge(60);
            if (remember != null) {
                p.setMaxAge(60);
            } else {
                p.setMaxAge(0);
            }
            //luu u va p len trinh duyet
            response.addCookie(e);
            response.addCookie(p);

            request.getRequestDispatcher("Home").forward(request, response);
        }

    }
}
