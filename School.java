import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;
import java.util.*;
public class School  {
	
///write array LIST OF STUDENT FROM CLASS STUDENT
	Scanner sc=new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<>();
	
    void setArrayListStudent(ArrayList<Student> studentList) {
		 this.studentList=studentList;
		 
	 }
	public ArrayList<Student>getArrayList() {
		return studentList;
	}


	private String schoolName;
	 void  setSchoolName(String schoolName)
		{
		
				this.schoolName=schoolName;
		
		}
	 
	 String getSchoolName() {
		 return schoolName;
	 }
	
	

	
	public static void main(String[] args) {
		
}}
