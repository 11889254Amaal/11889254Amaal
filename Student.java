
import java.util.ArrayList;

public class Student {
	String StudentName;
	int StudentId;
	String StudentEmail;
	
	ArrayList<Course> courseList1=new ArrayList<Course>();
	
	public void setArrayListCourse(ArrayList<Course> courseList)
	{
		this.courseList1=courseList;
	}
	
	public ArrayList<Course>getArrayListCourse() {
		return courseList1;
	}
	
	public void setStudentName(String StudentName){
		this.StudentName=StudentName;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	
	public void setStudentEmail(String StudentEmail) {
		this.StudentEmail=StudentEmail;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}

}
