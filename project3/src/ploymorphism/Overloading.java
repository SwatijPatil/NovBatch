package ploymorphism;

public class Overloading {
	
	public void login(String username, int password) {
		System.out.println("Login by using the username in String form and passwod in int form");
	}
	public void login(String usernmae, String password) {
		System.out.println("Login by using username and password both in string format");
	}
	public void login(String username, String email, String password) {
		System.out.println("Login by adding the username, email and password");
	}
	
	public static void main(String[] args) {
		Overloading over=new Overloading();
		over.login("test", "1234");
        over.login("test", 1232);
        over.login("test123", "test@gmail.com","123456");
	}

}
