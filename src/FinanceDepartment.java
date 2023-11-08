
public class FinanceDepartment {
	//variables
	private String name;
	private String address;
	private String subCode;
	private String programme;
	private int intakeYear;
	private String department;
	private int studentFee = 0;
	private int lecturerSalary = 0;
	
	//constructors
	public FinanceDepartment() {
		
	}
	
	public FinanceDepartment(String name, String address, String subCode, String department, int lecturerSalary) {
		this.name = name;
		this.address = address;
		this.subCode = subCode;
		this.department = department;
		this.lecturerSalary = lecturerSalary;
	}
	
	public FinanceDepartment(String name, String address, String subCode, String programme, int intakeYear, int studentFee) {
		this.name = name;
		this.address = address;
		this.subCode = subCode;
		this.programme = programme;
		this.intakeYear = intakeYear;
		this.studentFee = studentFee;
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

	public int getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(int studentFee) {
		this.studentFee = studentFee;
	}

	public int getLecturerSalary() {
		return lecturerSalary;
	}

	public void setLecturerSalary(int lecturerSalary) {
		this.lecturerSalary = lecturerSalary;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format(
				"FinanceDepartment [name=%s, address=%s, subCode=%s, programme=%s, intakeYear=%s, department=%s, studentFee=%s, lecturerSalary=%s]",
				name, address, subCode, programme, intakeYear, department, studentFee, lecturerSalary);
	}

}


