

import java.util.ArrayList;

public class Marks implements MarksInterface {
	private int courseMarks;
	
	  protected void finalize() throws Throwable {
		    try {
		      System.out.println("Inside finalize method of Marks Class.");
		    } 
		    catch (Throwable e) {
		      throw e;
		    } 
		    finally {
		      System.out.println("Calling finalize method of the Object class");

		      // Calling finalize() of Object class
		      super.finalize();
		    }}
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

	@Override
	public void CheckDegree(int inputMarksCourse) {
		// TODO Auto-generated method stub
		if(courseMarks<40)
		{
			System.out.println("====Student Degree===");

			System.out.println("=======Fail==========");
		}
		else if(courseMarks>=40 && courseMarks<=50)
		{
			System.out.println("====Student Degree===");

			System.out.println("=======Pass==========");

		}
		else if(courseMarks>50 && courseMarks<=55)
		{
			System.out.println("====Student Degree===");

			System.out.println("===========C=========");
		}
		else if(courseMarks>55 && courseMarks<=60)
		{
			System.out.println("====Student Degree===");

			System.out.println("==========B==========");

		}
		else if(courseMarks>60 && courseMarks<=70)
		{
			System.out.println("====Student Degree===");

			System.out.println("==========B+=========");

		}
		else if(courseMarks>70 && courseMarks<=80)
		{
			System.out.println("====Student Degree===");

			System.out.println("==========A==========");

		}	
		else if(courseMarks>80 && courseMarks<=90)
		{
			System.out.println("====Student Degree===");

			System.out.println("=========A+==========");

		}
		else if(courseMarks>90 && courseMarks<=100)
		{
			System.out.println("====Student Degree===");

			System.out.println("==========A==========");

		}
		
	}
}
