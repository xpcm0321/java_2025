package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;

public class BDetail implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// utf-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// request 데이터 받아오기  no
		int bno = Integer.parseInt(request.getParameter("bno"));
		// dao 조회수 올리기 dao.updateHit(번호) / 해당글상세 dao.select(번호)
		BoardDao dao = new BoardDao();
		dao.updateHit(bno);
		
		// 결과물 셋팅 : request.setAttribute()
		request.setAttribute("dto", dao.select(bno));
		// http://localhost:8080/JOAbooks/detail.do?bno=8

	}

}
