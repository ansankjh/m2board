package controller;

import java.io.IOException;
import vo.*;
import service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddBoardAction")
public class AddBoardAction extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Controller
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println(title + " <-- AddBoardActionController.doPost.title");
		// System.out.println(content);
		
		// 메서드 호출 매개값
		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
		
		// 메서드 호출
		BoardService boardService = new BoardService();
		int row = boardService.insertBoard(board);
		
		// BoardList로 돌아가게 강제
		response.sendRedirect(request.getContextPath()+"/BoardList");
	}

}
