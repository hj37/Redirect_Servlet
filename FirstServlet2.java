package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//주제:redirect 방식을 이용하면 웹 브라우저를 통해 다른 서블릿을 호출하면서 원하는 데이터를 전달 할 수도 있다.
//예제:redirect 방법으로 최초 요청한 서블릿에서 GET방식으로 다른 서블릿으로 데이터를 전달하는 예제 

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//response의 addHeader()메서드에 Refresh를 설정하고 
		//1초 후 url=second에 지정한 second서블릿에 브라우저에서 재요청하게 합니다.
		response.sendRedirect("second?name=lee");
	}

}
