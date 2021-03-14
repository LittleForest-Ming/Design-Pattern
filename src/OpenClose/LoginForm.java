package OpenClose;

public class LoginForm {
	AbstractButton button;
	public void display() {
		button = new CircleButton();
		button.view();
		System.out.println("display");
	}
}
