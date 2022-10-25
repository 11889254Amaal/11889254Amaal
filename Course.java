

import java.util.ArrayList;

public class Course {
	String CourseName;
	
	

	public void setCourseName(String CourseName) 
	{
	
		this.CourseName=CourseName;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	///set and get for marks
	ArrayList<Marks> courseMarkss=new ArrayList<Marks>();
	 void setCourseMarks(ArrayList<Marks> courseMarkss)
	{
			this.courseMarkss=courseMarkss;
	}
	public ArrayList<Marks> getCourseMarksList() {
		return courseMarkss;
	}

}
