
public class SubjectEnrollmentSystem {
	//variables
	private String name;
	private String address;
	private String subCode;
	private String programme;
	private int intakeYear;
	private String department;
	
	//constructors
	public SubjectEnrollmentSystem() {
		
	}
	
	public SubjectEnrollmentSystem(String name, String address, String subCode, String department) {
		this.name = name;
		this.address = address;
		this.subCode = subCode;
		this.department = department;
	}
	
	public SubjectEnrollmentSystem(String name, String address, String subCode, String programme, int intakeYear) {
		this.name = name;
		this.address = address;
		this.subCode = subCode;
		this.programme = programme;
		this.intakeYear = intakeYear;
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

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public int getIntakeYear() {
		return intakeYear;
	}

	public void setIntakeYear(int intakeYear) {
		this.intakeYear = intakeYear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format(
				"SubjectEnrollmentSystem [name=%s, address=%s, subCode=%s, programme=%s, intakeYear=%s, department=%s]",
				name, address, subCode, programme, intakeYear, department);
	}
}
