package SILab2;

import java.util.List;

class User {
	String username;
	String password;
	String email;

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}

public class SILab2 {

	public boolean function(User user, List<String> allUsers) {	//1
		if (user == null) {	//2
			throw new RuntimeException("The user argument is not initialized!"); //3
		} else { 
			if (user.getUsername() == null || allUsers.contains(user.getUsername())) { //4, 5
				throw new RuntimeException("User already exists!"); //6
			} else { 
				if (user.getEmail() == null) //7,8
					return false; //9
				boolean atChar = false, dotChar = false; //10
				for (int i = 0; i < user.getEmail().length(); i++) { //11
					if (user.getEmail().charAt(i) == '@')	//12
						atChar = true;	//13
					if (atChar && user.getEmail().charAt(i) == '.') { //14
						dotChar = true; //15
					}
				}	
				if (!atChar || !dotChar) { //16
					return false; //17
				} 
			}
		}
		return true; //18
	} 

	
}