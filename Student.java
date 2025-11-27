public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       public Student() {
       }
       
       public Student(String firstName, String lastName) {
    	   this.firstName = firstName;
    	   this.lastName = lastName;
       }
       
       public Student(String firstName, String lastName, int registration, int grade, int year) {
    	   this.firstName = firstName;
    	   this.lastName = lastName;
    	   this.registration = registration;
    	   this.grade = grade;
    	   this.year = year;
       }
       
       public void printFullName(){
    	   System.out.println(firstName + " " + lastName);
    	   }//fullName

    	   public boolean isApproved() {
    	       //TODO implement: should return true if grade >= 60
    		   return grade >= 60;
    		}//approved

    	   public int changeYearIfApproved(){
    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
    	       if (isApproved()) {
    	    	   year = year + 1;
    	    	   System.out.println("Congratulations");
    	       }//if isApproved
    	       return year;
    	   }//changeYearIfApproved
       
}//student 
