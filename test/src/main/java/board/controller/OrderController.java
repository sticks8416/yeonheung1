package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.domain.HacchuuVO;

public class OrderController {
	@RequestMapping(value = "/board/chuumonn", method = RequestMethod.GET)
	public String chuumonn(ModelMap model, HttpSession session, HttpServletRequest req, String kensaku)
			throws Exception {
		//현재 있는 아이템들의 리스트를 보여주며(체크박스) 
	  
		return "/board/chuumonn";
	}

	@RequestMapping(value = "/board/chuumonn", method = RequestMethod.POST)
	public String chuumonn(HttpSession session, Model model,ModelMap modelmap,
		HttpServletRequest req, HttpServletResponse resp,HacchuuVO hacchuuVO) throws Exception {
		//수량 정해서 주문 박스로 넘김 ==> 발주 리스트에서 확인 가능하게 함
		return "/board/chuumonn";
	}
}
