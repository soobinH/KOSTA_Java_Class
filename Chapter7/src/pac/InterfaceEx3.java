package pac;

interface IClick {
	void click();
}

class Button {
	IClick iclick;

	void addClickEventListner(IClick iclick) {
		this.iclick= iclick;
	}
	void onClick() {
		
		System.out.println("버튼이 눌러짐");
		if(iclick!=null)
			iclick.click();
	}
}

//class LoginBtn implements IClick {
//	@Override
//	public void click() {
//		System.out.println("로그인 처리");
//	}
//}


public interface InterfaceEx3 {
	public static void main(String[] args) {
		Button loginBtn = new Button();
//		loginBtn.addClickEventListner(new LoginBtn());
		
		// 익명 클래스: 한 번 쓰고 말 클래스를 메인에 바로 선언해서 사용하는 것이다. 
		loginBtn.addClickEventListner(new IClick() {
			
			@Override
			public void click() {
				System.out.println("로그인 처리");
			}
		});
		
		loginBtn.onClick();
	}
}
