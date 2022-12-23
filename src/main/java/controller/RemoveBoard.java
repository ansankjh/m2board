package controller;

import java.io.IOException;
import service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveBoard
 */
@WebServlet("/RemoveBoard")
public class RemoveBoard extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("no"));
		// System.out.println(no);
		
		// 서비스 호출
		BoardService boardService = new BoardService();
		int row = boardService.removeBoard(no);
		
		response.sendRedirect(request.getContextPath()+"/BoardList");
	}

}
