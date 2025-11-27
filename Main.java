public class Main {
	public static void main(String[] args) {
			Student aldo = new Student("Aldo", "Gomez", 101, 75, 1);
			Student maria = new Student("Maria", "Torres", 102, 31, 1);
			Student monse = new Student("Monse", "Hernandez", 103, 68, 1);
			
			aldo.printFullName();
			System.out.println("¿Aprobado?" + aldo.isApproved());
			maria.changeYearIfApproved();
			monse.changeYearIfApproved();
			
			
		}//class Main

	}//main
