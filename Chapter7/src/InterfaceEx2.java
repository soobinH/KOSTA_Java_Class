class Button {
	public void onClick() {
		System.out.println("버튼이 눌러짐");
	}
}

class LoginButton extends Button {
	@Override
	public void onClick() {
		super.onClick();
		System.out.println("로그인 처리");
	}
}

class JoinButton extends Button {
	@Override
	public void onClick() {
		super.onClick();
		System.out.println("회원가입 처리");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		LoginButton loginBtn = new LoginButton();
		loginBtn.onClick();
		
		JoinButton joinBtn = new JoinButton();
		joinBtn.onClick();
		
	}

}
