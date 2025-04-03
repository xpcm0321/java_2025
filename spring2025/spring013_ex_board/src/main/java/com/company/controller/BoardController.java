package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.BoardDto;
import com.company.service.BoardService;
// ver-2
@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardService service;
	
	// 전체리스트 가져오기 : 전체데이터가져오기 (selectAll()) + view (board/list)
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", service.selectAll());
		return "board/list";
	}
	
	// 글쓰기화면 : X + view (board/write)
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create() {
		return "board/write";
	}
	
	// 글쓰기기능 : 글쓰기기능 (insert(BoardDto dto)) + board/list (새로갱신된 list)
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create_post(BoardDto dto) {
		if (dto != null) {
			service.insert(dto);
		}  // 글쓰기
		return "redirect:/board/list";
	}
	
	// 글상세보기 : detail(int bno) + view (board/detail)
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model, int bno) {
		model.addAttribute("dto", service.detail(bno));
		return "board/detail";
	}

	// 글 수정하기폼 : updateForm(int bno) + view (board/edit)
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String edit(Model model, int bno) {
		model.addAttribute("dto", service.updateForm(bno));
		return "board/edit";
	}
	
	// 글 수정기능 : update(BoardDto dto) + 글수정확인-상세보기 : board/detail
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit_post(BoardDto dto) {
		if (dto != null) {
			service.update(dto);
		}
		return "redirect:/board/detail?bno=" + dto.getBno();
	}
	
	// 글 삭제폼 : X + view (board/delete)
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {
		return "board/delete";
	}
	
	// 글 삭제기능 : delete(BoardDto dto) + 갱신된 리스트 - board/list
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete_post(BoardDto dto) {
		if (dto != null) {
		service.delete(dto);
	}
		return "redirect:/board/list";
	}
}

/* ver-1
@Controller
public class BoardController {
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public String list() {
		return "board/list";
	}
	
	@RequestMapping(value="/board/create", method=RequestMethod.GET)
	public String create() {
		return "board/write";
	}
	
	@RequestMapping(value="/board/create", method=RequestMethod.POST)
	public String create_post() {
		return "board/write";
	}
	
	@RequestMapping(value="/board/detail", method=RequestMethod.GET)
	public String detail() {
		return "board/detail";
	}
	
	@RequestMapping(value="/board/edit", method=RequestMethod.GET)
	public String edit() {
		return "board/edit";
	}
	
	@RequestMapping(value="/board/edit", method=RequestMethod.POST)
	public String edit_post() {
		return "board/edit";
	}
	
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String delete() {
		return "board/delete";
	}
	
	@RequestMapping(value="/board/delete", method=RequestMethod.POST)
	public String delete_post() {
		return "board/delete";
	}
}
*/

/*
http://localhost:8080/spring011_ex_board/board/list
http://localhost:8080/spring011_ex_board/board/create
http://localhost:8080/spring011_ex_board/board/detail
http://localhost:8080/spring011_ex_board/board/edit
http://localhost:8080/spring011_ex_board/board/delete

@RequestMapping("/board/create")
public String create() {
	return "board/write";
}
*/
