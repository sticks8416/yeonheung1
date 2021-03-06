package board.controller;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import board.domain.BoardVO;
import board.service.BoardService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import board.dao.MemberDao;
import board.domain.MemberVO;
import member.request.LoginRequest;
import board.service.MemberService;

@Controller
@SessionAttributes("memberVO")
public class MemberController {
	
	private MemberService memberService;


	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping(value = "/board/login", method = RequestMethod.GET)
	public String main(Model model) {
		return "/board/login";
	}

	@RequestMapping(value = "/board/login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws Exception {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("password", pass);
		MemberVO memberVO = memberService.memberLogin(map);
		if (memberVO == null) {
			return "redirect:/board/login";
		} else {
			session.setAttribute("member", memberVO);
			return "redirect:/board/main";
		}

	}
	@RequestMapping(value = "/board/signup", method = RequestMethod.GET)
	public String signUp1(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		
		return "/board/signup";
	}
	@RequestMapping(value = "/board/signup", method = RequestMethod.POST)
	public String signUp2(Model model,String email, MemberVO memberVO, HttpServletRequest req) {
		model.addAttribute("memberVO", new MemberVO());
		email = req.getParameter("email");
		int check = memberService.matchID(email);
		if(check==1) {
			System.out.println("이미 존재하는 아이디 입니다.");
			return "redirect:/board/signup";
		}
		else {
		memberService.memberInsert(memberVO);
		return "/member/main";
	}
	}

	@RequestMapping(value = "/board/matchPW", method = RequestMethod.GET)
	public String matchPW(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		
		return "/board/matchPW";
	}
	@RequestMapping(value = "/board/matchPW", method = RequestMethod.POST)
	public String matchPW2(Model model, MemberVO memberVO, HttpServletRequest req) {
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("name", name);
		System.out.println(map);
		memberVO = memberService.matchPW(map);
		System.out.println(memberVO.getPassword());
		if(memberVO.getPassword()!=null) {
			model.addAttribute("memberVO", memberService.matchPW(map));
			System.out.println("비번찾기 성공");
			System.out.println();
			return "/board/matchPW2";
		}
		else
			System.out.println("비번찾기 실패");
		return "/board/signup";
	}	
	@RequestMapping(value = "/board/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest req, HttpServletResponse resp) throws Exception {

		HttpSession session = req.getSession();
		session.invalidate();
		System.out.println("해제완료!");

		return "/board/main";
	}
	@RequestMapping(value = "/board/editProfile", method = RequestMethod.GET)
	public String editProfile(HttpSession session) {
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		if(memberVO == null) {
			return "/board/main";
		}
			return "/board/editProfile";
		}

	@RequestMapping(value = "/board/editProfile", method = RequestMethod.POST)
	public String editProfile(@RequestParam("name")String name,@RequestParam("password")String password, HttpSession session, HttpServletRequest req) {
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		memberVO.setName(name);
		memberVO.setPassword(password);
		memberService.memberUpdate(memberVO);
		return "redirect:/board/main";
	}
}