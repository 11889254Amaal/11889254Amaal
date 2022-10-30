
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable  {
	private String StudentName;
	//private int StudentId;
	private String StudentEmail;
	
	ArrayList<Course> courseList1=new ArrayList<Course>();
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.StudentName=StudentName;
		this.StudentEmail=StudentEmail;
	}

	public Student(String StudentName, String StudentEmail) {
		// TODO Auto-generated constructor stub
		this.StudentName=StudentName;
		this.StudentEmail=StudentEmail;
	}

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
