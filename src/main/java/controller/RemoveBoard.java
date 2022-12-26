package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;

/**
 * Servlet implementation class RemoveBoard
 */
@WebServlet("/RemoveBoard")
public class RemoveBoard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		// System.out.println(no);
		
		BoardService boardService = new BoardService();
		int row = boardService.removeBoard(no);
		
		response.sendRedirect(request.getContextPath()+"/BoardList");
	}

}
