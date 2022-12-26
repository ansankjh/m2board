package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.Board;

@WebServlet("/ModifyBoardForm")
public class ModifyBoardForm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		
		BoardService boardService = new BoardService();
		Board board = boardService.getBoardModify(no);
		
		// view와 공유할 모델데이터 설정
		request.setAttribute("board", board);
		
		// view 연결
		// RequestDispatcher 1) include 2) forward
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/modifyBoardForm.jsp");
		rd.forward(request, response);
	}
}