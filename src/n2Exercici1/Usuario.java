package n2Exercici1;

public class Usuario {
	
	private String nickName;
	private String name;
	private int phoneNumber;
	
	public Usuario(String nickName, String name, int phoneNumber) {
		
		this.nickName = nickName;
		this.name = name;
		this.phoneNumber = phoneNumber;
	
	}

	public String getNickName() {
		return nickName;
	}

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

}
