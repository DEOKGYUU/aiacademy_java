package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int index;
	
	public MemberServiceImpl() {
		members = new Member[3];
		index = 0;
	}
	
	@Override
	public void join(Member member) {
		System.out.println("*** App에서 넘어온 회원 정보");
		System.out.println(member);
		members[index++] = member;
	}

	@Override
	public void login(String userid, String password) {
		for(int i=0; i<index; i++) {
			if(members[i].getUserid().equals(userid)) {
				if(members[i].getPassword().equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
			} else if(i == index) {
				System.out.println("아이디가 없습니다.");
			}
		}
	}
	
	@Override
	public void member() {
		System.out.println("*** 배열에 저장된 회원 정보");
		for(int i=0; i<index; i++) {
			System.out.println(members[i]);
		}
		
	}

}
