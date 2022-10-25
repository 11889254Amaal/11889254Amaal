

import java.util.ArrayList;

public class Marks {
	int courseMarks;
	 void  setCourseMarks(int courseMarks)
		{
			if(courseMarks>0 && courseMarks<100)
			{
				this.courseMarks=courseMarks;
			}
			else
			{
				System.out.println("plz enter number between 0 and 100");
			}
		}
	 
	 int getCourseMarks() {
		 return courseMarks;
	 }
}
