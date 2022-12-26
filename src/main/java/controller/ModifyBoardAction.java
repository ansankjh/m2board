package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vo.*;
import service.*;


@WebServlet("/ModifyBoardAction")
public class ModifyBoardAction extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// System.out.println(no);
		// System.out.println(title);
		// System.out.println(content);
		
		// 메서드 호출 매개값
		Board board = new Board();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		
		
		// 메서드 호출
		BoardService boardService = new BoardService();
		int row = boardService.ModifyBoard(board);
		
		// BoardList로 돌아가게 강제
		response.sendRedirect(request.getContextPath()+"/BoardList");
	}
}