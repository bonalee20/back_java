package view;

import dao.MemberDAO;
import vo.MemberVO;


public class View {
	
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemberEmail("g11H");
		memberVO.setMemberPassword("12");
		memberVO.setMemberName("홍길동");
		memberVO.setMemberAge(13);
		memberVO.setMemberAddress("서울시");
		
		if(memberDAO.checkId(memberVO.getMemberEmail())) {
			System.out.println("사용가능 아이디");
		memberDAO.join(memberVO);
		}else {
			System.out.println("중복된 아이디");
		}
		//memberDAO.join(memberVO);
		
		
		
	}
}
