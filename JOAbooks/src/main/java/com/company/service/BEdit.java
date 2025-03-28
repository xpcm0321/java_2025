package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVO;

public class BEdit implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// utf-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// request
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// dto
		BoardVO vo = new BoardVO();
		BoardDao dao = new BoardDao();
		vo.setBtitle(btitle);
		vo.setBcontent(bcontent);
		vo.setBno(bno);
		
		// 결과물
		request.setAttribute("result", String.valueOf(dao.update(vo)));
		// http://localhost:8080/JOAbooks/edit.do?bno=8&btitle=제목&bcontent=내용
		/*
		BoardVO vo = new BoardVO();
		vo.setBtitle("제목-new");
		vo.setBcontent("내용-new");
		vo.setBno(9);
		System.out.println(dao.update(vo));
		*/
	}

}
