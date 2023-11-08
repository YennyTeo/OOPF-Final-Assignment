
public class Student extends User {
	//variables
	private String programme;
	private int intakeYear;
	
	//constructors
	public Student() {
		
	}
	
	public Student(String name, String address, String subCode, String programme, int intakeYear) {
		super(name, address, subCode);
		this.programme = programme;
		this.intakeYear = intakeYear;
	}
	
	//setter/getters
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
	
	String name = super.getName();
	String address = super.getAddress();
	String subCode = super.getSubCode();
	
	//toString
	@Override
	public String toString() {
		return "Student:[" + name + " Address=" + address + "SubCode=" + subCode + " Programme=" + programme + "IntakeYear=" + intakeYear + "]";
	}
}
