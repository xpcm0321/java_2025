package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;

public class BDelete implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// utf-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// request
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// dto
		BoardDao dao = new BoardDao();
		
		// 결과물
		request.setAttribute("result", String.valueOf(dao.delete(bno)));
		// http://localhost:8080/JOAbooks/delete.do?bno=8
	}
}
