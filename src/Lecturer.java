
public class Lecturer extends User {
	//variables
	private String department;
	
	//constructors
	public Lecturer() {
		
	}
	
	public Lecturer(String name, String address, String subCode, String department) {
		super(name, address,subCode);
		this.department = department;
	}
	
	//setter/getters
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	String name = super.getName();
	String address = super.getAddress();
	String subCode = super.getSubCode();
	
	//toString
	@Override
	public String toString() {
		return "Lecturer:[" + name + " Address=" + address + "SubCode=" + subCode + " Department=" + department + "]";
	}

}
