package board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import board.domain.SeigyoVO;

import board.service.SeigyoService;


	@Controller
	@SessionAttributes("seigyoVO")
	public class SeigyoController {
		@Resource
		private SeigyoService seigyoService;

		public void setSeigyoService(SeigyoService SeigyoService) {
			this.seigyoService = SeigyoService;
		}
		@RequestMapping(value="/board/main" , method=RequestMethod.GET)
		public String seigyolist(ModelMap model,HttpSession session, HttpServletRequest req) throws Exception{
		
			
			HashMap<String, Object> hashMap = new HashMap<>();//해쉬맵 인스턴스화
			List<Map<String, Object>> list = new ArrayList<>();//리스트 인스턴스화
	
			list = seigyoService.seigyolist();
		
			hashMap.put("SeigyoList", list);

			System.out.println(list);
			model.addAttribute("SeigyoList", list);
			System.out.println(list);
			SeigyoVO seigyoVO = (SeigyoVO) session.getAttribute("SeigyoList");
			return "/board/main";
			
			}
		@RequestMapping(value="/board/main" , method=RequestMethod.POST)
		public String seigyolist(Model model, String shhn_cd,HttpSession session) throws Exception {
		

			return "/board/kensaku";
			}
}
