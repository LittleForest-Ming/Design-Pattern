
public class LoginForm {
	UserDAO user = new UserDAO();
	
	public void init() {
		String name = "xiaoming";
		String password = "123456";
		user.findUser(name, password);
		System.out.println("init");
	}
	
	public void display() {
		System.out.println("display");
	}
	
	public void validate() {
		System.out.println("validate");
	}
}
