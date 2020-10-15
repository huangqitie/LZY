package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.User;
import service.IUserService;
import service.impl.UserService;

@SuppressWarnings("serial")
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	private String encoding;

	public UserServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		encoding = super.getServletContext().getInitParameter("encoding");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		resp.setContentType("text/html;charset=" + encoding);

		PrintWriter out = resp.getWriter();
		String name = req.getParameter("loginname");
		if ("admin".equals(name)) {
			out.print(true);
		} else {
			out.print(false);
		}

		String cmd = req.getParameter("cmd");
		if ("login".equals(cmd)) {
			login(req, resp);
		} else if ("updateUser".equals(cmd)) {
			updateUser(req, resp);
		} else if ("logout".equals(cmd)) {
			logout(req, resp);
		}
	}

	private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().invalidate();
		resp.sendRedirect("/csi/loginForm.jsp");
	}

	private void updateUser(HttpServletRequest req, HttpServletResponse resp) {
		String password = req.getParameter("password");
		String uid = req.getParameter("uid");
		User user = new User(password);
		req.setAttribute("user", user);
		IUserService service = new UserService();
		int line = service.updateUser(uid, user);
		if (line > 0) {
			req.getRequestDispatcher("login.jsp");
		}
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginname = req.getParameter("loginname");
		String password = req.getParameter("password");
		IUserService service = new UserService();
		User user = service.login(loginname, password);
		if (user == null) {
			req.setAttribute("login_msg", "账号或密码有误, 请检查后登录");
			req.getRequestDispatcher("/loginForm.jsp").forward(req, resp);
			return;
		}
		req.getSession().setAttribute("user", user);
		resp.sendRedirect("/csi/main.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
