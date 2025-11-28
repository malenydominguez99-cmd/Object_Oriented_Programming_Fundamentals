import java.util.ArrayList;
import java.util.List;

public class Courses {
	String coursesName;
	String professorName;
	int year;
	List<Student> students;
	
	public Courses(String coursesName, String professorName, int year) {
		this.coursesName = coursesName;
		this.professorName = professorName;
		this.year = year;
		this.students = new ArrayList<>();
	}//constructor 
	
	public void enroll(Student student) {
		students.add(student);
	}//enroll
	
	public void enroll(Student[] studentsArray) {
		for (Student s: studentsArray) {
			students.add(s);
		}
	}//enroll
	
	public void unEnroll(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}//enroll
	
	public int countStudents() {
		return students.size();
	}//countStudents
	
	public int bestGrade() {
		int best =0;
		for (Student s: students) {
			if(s.grade > best) {
				best = s.grade;
			}
		}
		return best;
	}//bestGrade
	
	public double averageGrade() {
		if (students.isEmpty()) return 0;
		
		double sum= 0;
		for (Student s : students) {
			sum += s.grade;
		}
		return sum / students.size();
	}//averageGrade
		
	public void ranking() {
		System.out.println("Ranking del curso: " + coursesName);
		for (Student s : students) {
			System.out.println(s.firstName + " " + s.lastName + " - Nota: " + s.grade);
		}
	}//ranking
	
	 public void aboveAverage() {
	        double avg = averageGrade();
	        System.out.println("Promedio del curso: " + avg);
	        
	        for (Student s : students) {
	            if (s.grade > avg) {
	                System.out.println(s.firstName + " " + s.lastName + " Esta por encima del promedio");
	            } else {
	                System.out.println(s.firstName + " " + s.lastName + " No esta por encima del promedio");
	            }
	        }
	 }//aboveAverage
}//couses