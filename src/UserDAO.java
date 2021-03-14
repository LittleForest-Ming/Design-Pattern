
public class UserDAO {
	DBUtil db = new DBUtil();
	public boolean findUser(String userName,String userPassword) {
		db.getConnection();
		if(userName == ""&& userPassword == "")
			return true;
		return false;
	}
}
