
public class Teacher implements LoginInterfaceTeacher {
	private String teacherName1;
	private String teacherID1;


	@Override
	public void ValidatUserName(String teacherName1) {
		// TODO Auto-generated method stub
		String teacherName2="Amaal";
		if(teacherName1.equals(teacherName2)){
			System.out.println("User name is exit");
		}
		else
		{
			System.out.println("User name is not exit");

		}
		
	}

	@Override
	public void ValidatPassword(String teacherID1) {
		// TODO Auto-generated method stub
		String teacherID2="1234";
		if(teacherID1.equals(teacherID2)){
			System.out.println("Password is correct");
		}
		else
		{
			System.out.println("Password is not correct");

		}
	}

}
