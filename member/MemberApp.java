package member;

import java.util.Scanner;

import race.Player;

public class MemberApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			member = new Member();
			System.out.println("메뉴: 0.종료  1.회원가입  2.로그인  3.회원목록");
			switch(sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: 
				System.out.print("아이디: ");
				member.setUserid(sc.next());
				System.out.print("비밀번호: ");
				member.setPassword(sc.next());
				System.out.print("이름: ");
				member.setName(sc.next());
				System.out.println("*** 회원가입 정보확인 ***");
				System.out.println(member);
				memberService.join(member);
				break;
			case 2:	
				System.out.print("아이디를 입력하세요");
				String userid = sc.next();
				System.out.print("비밀번호를 입력하세요");
				String password = sc.next();
				memberService.login(userid, password); break;
			case 3: memberService.member(); break;
			default : System.out.println("다시 고르세요"); break;
			}
		}
	}
}
