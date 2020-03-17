package board.dao;

import java.util.List;
import java.util.Map;

import board.domain.MemberVO;
import member.request.LoginRequest;

public interface MemberDao {
	public abstract List<MemberVO> memberlist();
	public abstract void memberInsert(MemberVO memberVO);
	public abstract MemberVO memberLogin(Map map);
	public abstract MemberVO matchPW(Map map);
	int checkOverId(String user_id);
	public abstract int matchID(String email);
	public abstract void memberUpdate(MemberVO memberVO);
}
