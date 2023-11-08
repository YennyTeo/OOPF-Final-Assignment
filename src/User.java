
public class User {
	//variables
	private String name;
	private String address;
	private String subCode;
	
	//constructors
	public User() {
		
	}
	
	public User(String name, String address, String subCode) {
		this.name = name;
		this.address = address;
		this.subCode = subCode;
	}
	
	//setter/getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	
	@Override
	public String toString() {
		return String.format("User [name=%s, address=%s, subCode=%s]", name, address, subCode);
	}
}
