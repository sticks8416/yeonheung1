package board.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import board.dao.MemberDao;
import board.domain.MemberVO;
import member.request.LoginRequest;

public interface MemberService {
	public List<MemberVO> memberlist();
	public MemberVO memberLogin(Map map);
	public void memberInsert(MemberVO memberVO);
	public MemberVO matchPW(Map map);
	public int matchID(String email);
	public int userIdCheck(String email);
	public void memberUpdate(MemberVO memberVO);
	
}