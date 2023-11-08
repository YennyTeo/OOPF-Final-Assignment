import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		//Display student
		ArrayList<User> ulist = new ArrayList<User>();
		Student s1 = new Student("Ahmad", "1124, Jalan S2/F26, Garden Homes, 70300, Seremban, Negeri Sembilan ", "PRG1203", "BCNS", 2022);
		Student s2 = new Student("John", "178, Jalan Rimbun Vista 8, Rimbun Vista 70300, Seremban, Negeri Sembilan ", "PRG1203", "BCNS", 2022);
		Student s3 = new Student("Mindy", "12, Jalan S2/F15, Garden Homes, 70300, Seremban, Negeri Sembilan ", "PRG1203", "BCNS", 2022);
		ulist.add(s1);
		ulist.add(s2);
		ulist.add(s3);
		for(User u:ulist) {
			System.out.println(u);
		}
		
		//display lecturer
		ArrayList<User> llist = new ArrayList<User>();
		Lecturer l1 = new Lecturer("Dr.Tan", "1124, Jalan S2/F26, Garden Homes, 70300, Seremban, Negeri Sembilan ", "PRG1203", "Sunway Department");
		llist.add(l1);
		for(User l:llist) {
			System.out.println(l);
		}

	}
}
