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
	
}//couses