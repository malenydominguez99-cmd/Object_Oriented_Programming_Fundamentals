public class Main {
	public static void main(String[] args) {
			Student aldo = new Student("Aldo", "Gomez", 101, 75, 1);
			Student maria = new Student("Maria", "Torres", 102, 31, 1);
			Student monse = new Student("Monse", "Hernandez", 103, 68, 1);
			
			aldo.printFullName();
			System.out.println("¿Aprobado?" + aldo.isApproved());
			maria.changeYearIfApproved();
			monse.changeYearIfApproved();
			
			Courses math = new Courses("Matemáticas", "Prof. López", 2025);
			math.enroll(aldo);
			Student[] moreStudents = {maria, monse};
			math.enroll(moreStudents);
			
			System.out.println("Estudiantes inscritos: " + math.countStudents());
	        System.out.println("Mejor calificación: " + math.bestGrade());
	        
	        System.out.println("Promedio del curso: " + math.averageGrade());
	        math.ranking();
	        math.aboveAverage();
			
		}//class Main

	}//main
