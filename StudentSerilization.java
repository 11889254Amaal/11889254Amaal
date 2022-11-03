import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerilization {

	public void studentSerlization() {
		
		Student student1 = new Student("amaal", "26j1230@gmail");
		Student student2 = new Student("ahaid", "ahaidj1230@gmail");
		Student student3 = new Student("ali", "alij1230@gmail");

		try {
			FileOutputStream fileName = new FileOutputStream("C:\\Users\\Amaal\\OneDrive\\Desktop\\txt\\school0");
			ObjectOutputStream fileWrite = new ObjectOutputStream(fileName);
			ObjectInputStream fileRead = new ObjectInputStream(
					new FileInputStream("C:\\Users\\Amaal\\OneDrive\\Desktop\\txt\\school0"));
			fileWrite.writeObject(student3);
			fileWrite.writeObject(student2);
			fileWrite.writeObject(student1);
			fileWrite.flush();
			fileWrite.close();

			Student s1 = (Student) fileRead.readObject();
			Student s2 = (Student) fileRead.readObject();
			Student s3 = (Student) fileRead.readObject();
			System.out.println(
					"Student Name:" + s1.getStudentName() + "Student Email" + s1.getStudentEmail());
			System.out.println(
					"Student Name:" + s2.getStudentName() + "Student Email" + s2.getStudentEmail());
			System.out.println(
					"Student Name:" + s3.getStudentName() + "Student Email" + s3.getStudentEmail());

			System.out.println("Succesis");

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
