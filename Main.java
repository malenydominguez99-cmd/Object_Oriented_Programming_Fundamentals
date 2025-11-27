public class Main {
	public static void main(String[] args) {
			Students1 aldo = new Student("Aldo", "Gomez", 101, 75, 1);
			Students2 maria = new Student("Maria", "Torres", 102, 31, 1);
			Students3 monse = new Student("Monse", "Hernandez", 103, 68, 1);
			
			aldo.printFullName();
			System.out.println("¿Aprobado?" + aldo.isApproved());
			maria.changeYearIfApproved();
			monse.changeYearIfApproved();
			
			
		}//class Main

	}//main
