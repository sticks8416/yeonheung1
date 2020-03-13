package board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import board.domain.HacchuuVO;
import board.service.OrderService;

@Controller
@SessionAttributes("orderVO")
public class OrderController {
	@Resource
	private OrderService orderService;

	public void setOrderService(OrderService OrderService) {
		this.orderService = OrderService;
	}
	@RequestMapping(value = "/board/chuumonn", method = RequestMethod.GET)
	public String chuumonn(ModelMap model, HttpSession session, HttpServletRequest req, String kensaku)
			throws Exception {
		//현재 있는 아이템들의 리스트를 보여주며(체크박스) 
	  //아이디 로그인 -> 장바구니에 담았을때 다른 정보와 같이 세션에 있는 아이디 값도 들어감(따로 칼럼하나 더)  pk.fk 해서 발주리스트랑 연동 시켜서 관리자도 볼 수 있게 해둠
		return "/board/chuumonn";
	}

	@RequestMapping(value = "/board/chuumonn", method = RequestMethod.POST)
	public String chuumonn(HttpSession session, Model model,ModelMap modelmap,
		HttpServletRequest req, HttpServletResponse resp,HacchuuVO hacchuuVO) throws Exception {
		//수량 정해서 주문 박스로 넘김 ==> 발주 리스트에서 확인 가능하게 함
		return "/board/chuumonn";
	}
}
