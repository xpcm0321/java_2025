package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class jsp025_login
 */
@WebServlet("/user_login")
public class jsp025_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public jsp025_login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		int result = -1;
		
		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "select count(*) 'cnt' from member where name=? and pass=?";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			rset = pstmt.executeQuery(); // select - executeQuery / insert, update, delete - executeQuery
			
			if(rset.next()) {
				result = rset.getInt("cnt");
				// result = rset.getInt("count(*)");
			}
			
			if(result == 1) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);  // 세션설정
				// response.sendRedirect("jsp025_my.jsp");
				out.print("<script>alert('로그인 성공!'); location.href='jsp025_my.jsp';</script>");
			} else {
				out.print("<script>alert('정보를 확인해주세요!'); history.go(-1);</script>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}