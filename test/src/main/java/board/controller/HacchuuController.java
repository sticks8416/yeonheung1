package board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import board.domain.HacchuuVO;
import board.service.HacchuuService;

@Controller
@SessionAttributes("hacchuuVO")
public class HacchuuController {
	@Resource
	private HacchuuService hacchuuService;

	public void setHacchuuService(HacchuuService HacchuuService) {
		this.hacchuuService = HacchuuService;
	}

	@RequestMapping(value = "/board/kensaku", method = RequestMethod.GET)
	public String hacchuulist(ModelMap model, HttpSession session, HttpServletRequest req, String kensaku)
			throws Exception {
		// 制御マスタ의 값이랑 発注マスタ의 상품코드,료한텐코드.length값이랑 같으면 hacchuuService.kensakulist를 실행하게 함
	     HashMap<String, Object> hashMap2 = new HashMap<>();//해쉬맵 인스턴스화
	     List<Map<String, Object>> list2 = new ArrayList<>();//리스트 인스턴스화
	 	 list2 = hacchuuService.hacchuulist();	 
		 hashMap2.put("HashMapList", list2); 
		 System.out.println(list2);
		 model.addAttribute("HashMapList", list2);	
		return "/board/kensaku";
	}

	@RequestMapping(value = "/board/kensaku", method = RequestMethod.POST)
	public String kensakukekka(HttpSession session, Model model,ModelMap modelmap,
		HttpServletRequest req, HttpServletResponse resp,HacchuuVO hacchuuVO) throws Exception {
		String shhn_cd = req.getParameter("shhn_cd");
		String ryhntn_cd = req.getParameter("ryhntn_cd");
		String sakujyoChk = req.getParameter("削除");
		HashMap<String, Object> hashMap = new HashMap<>();//해쉬맵 인스턴스화
	
		List<Map<String, Object>> map = new ArrayList<>();//리스트 인스턴스화
		//List<HacchuuVO> list2 = new ArrayList<HacchuuVO>();
		hashMap.put("shhn_cd", shhn_cd);
		hashMap.put("ryhntn_cd", ryhntn_cd);
		System.out.println(shhn_cd);
		System.out.println(ryhntn_cd);
		System.out.println(hacchuuVO.getShhn_cd());
		List<HacchuuVO> list = hacchuuService.kensakukekka(hashMap);
		
		if (list.size() == 0) {
			return "redirect:/board/main";
			//밑에 else if 하나 만들어서 삭제버튼 만들기
		}
		else{
			if(sakujyoChk != null) {
			hacchuuService.sakujyo(hashMap);
			return "redirect:/board/main";
			}
				else {	
					session.setAttribute("kensakukekka", list);
					return "redirect:/board/kensaku";
					} 
		}
	}
}