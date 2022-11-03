import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {

	public int extraLongFactorials(int facNumber) {
		if (facNumber == 0) {
			return 1;
		} else {
			return (facNumber * extraLongFactorials(facNumber - 1));
		}
	}

	static ArrayList<School> SchoolList = new ArrayList<>();

	void setArrayListSchool(ArrayList<School> SchoolList) {
		this.SchoolList = SchoolList;

	}

	public ArrayList<School> getArrayList() {
		return SchoolList;
	}

	public static void main(String[] args) throws Throwable {
		ArrayList<Course> courseList1 = new ArrayList<>();
		ArrayList<Marks> marksList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();
		Stack<String> stack = new Stack<String>();
		Set<String> setEmaildata = new HashSet<String>();
		ArrayList<String> EmailArray = new ArrayList<String>();
		HashMap<String, Double> studentFees = new HashMap<String, Double>();
		HashMap<String, HashMap<String, Double>> studentFeesWithCurrency = new HashMap<String, HashMap<String, Double>>();
		Main man = new Main();
		// List<Byte> file11 = new ArrayList<Byte>();
		double amountcal = 0;
		String nameCurrency = "";
		double amount = 0;
		String Dollar = "";
		String Pound = "";
		String Euro = "";
		boolean isRun = true;
		boolean isTeacherRun = true;
		int code;
		String y = null;
		String variavleGatFromArray = null;
		ObjectInputStream fileRead = null;
		FileOutputStream fileName;
		ObjectOutputStream fileWrite = null;
		ObjectInputStream fileRead1 = null;
		FileOutputStream fileName1;
		ObjectOutputStream fileWrite1 = null;
		boolean chooseInput = true;
		boolean isExit = true;
		boolean isHasExit = true;
		Main ourSchool = new Main();
		boolean isExitSchool = true;
		boolean isHasExitAmount = true;

		try {
			fileName1 = new FileOutputStream("C:\\Users\\Amaal\\OneDrive\\Desktop\\txt\\school2");
			fileWrite1 = new ObjectOutputStream(fileName1);
			fileRead1 = new ObjectInputStream(new FileInputStream("C:\\Users\\Amaal\\OneDrive\\Desktop\\txt\\school2"));

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+         WELOCOME  TO My System Teacher                         +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		while (isTeacherRun) {

			// System.out.println("\n" + "Please Enter your User Name");
			// String teacherName1 = sc1.next();
			boolean tryagain = false;
			String teacherName1 = null;
			String teacherID1 = null;
			Teacher TeacherDetails=new Teacher();
			
			do {
				try {
				
					System.out.println("\n" + "Please Enter your User Name");
					teacherName1 = sc1.nextLine();
					TeacherDetails.ValidatUserName(teacherName1);

					if (!teacherName1.matches("^[a-zA-Z]*$")) {

						// Scanner sc1=new Scanner(System.in);
						System.out.println("You probably entered an invalid String data format");

					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					tryagain = false;

				}

				System.out.println("please Enter your Password");
				teacherID1 = sc1.nextLine();
				TeacherDetails.ValidatPassword(teacherID1);

				try {
					Integer.parseInt(teacherID1);
					System.out.println(teacherID1 + " is a valid String");

				}

				catch (NumberFormatException e) {
					System.out.println(teacherID1 + " is not a valid integer");
				}

			} while (tryagain);
			TeacherDetails.finalize();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			String teacherName2 = "Amaal";
			boolean check = teacherName1.equals(teacherName2);
			if (check == true) {
				if (teacherID1.equals("1234")) {
					System.out.println("=============Login Succefully==================");
					do {
						Scanner sc = new Scanner(System.in);
						HashMap<Integer, String> subMenuProgram = new HashMap<Integer, String>();
						HashMap<Integer, String> menuProgram = new HashMap<Integer, String>();
						menuProgram.put(1, "INPUT STUDENT Details \n");
						menuProgram.put(2, "REPORTS FOR ALL STUDENTS\n");
						menuProgram.put(3, "HISTORY OF PROGRAMM\n");
						menuProgram.put(4, "print currency and Amout\n");
						menuProgram.put(5, "print dublicate email\n");
						menuProgram.put(6, "coding Probleams\n");
						menuProgram.put(7, "Serilization for student Class\n");
						menuProgram.put(8, "Exit from Program");

						System.out.println(menuProgram);

						String sel = null;

						do {
							try {
								System.out.println("Please Enter your option:\n");
								sel = sc.nextLine();
								Integer.parseInt(sel);
								System.out.println(sel + " is a valid Number");
								chooseInput = false;
							} catch (NumberFormatException e) {
								System.out.println(sel + " is a invalid Number");
							}
						} while (chooseInput);
						switch (sel) {
						case "1":

							System.out.println("===================");
							// TODO Auto-generated method stub
						
					
							while (isExitSchool) {
								School schoolDetails = new School();
								System.out.println("plz enter your school Name");
								String inputschoolName = sc.next();
								schoolDetails.finalize();
								schoolDetails.setSchoolName(inputschoolName);
								stack.push(inputschoolName);

								try {
									if (!inputschoolName.matches("^[a-zA-Z]*$")) {

										throw new Exception("You probably entered an invalid String data format");
									}
								} catch (Exception e) {
									System.out.println(e.getMessage());
									continue;

								}

								// SchoolList.add(schoolDetails);
								// this code to enter name to list
								isExitSchool = Boolean.TRUE;
								while (isExit) {
									// Scanner sc=new Scanner(System.in);
									
									
									Student studentDetails=new Student();
									studentDetails.finalize();
									System.out.println("plz enter your Name");
									String inputStudentName = sc.next();
									stack.push(inputStudentName);
									studentDetails.setStudentName(inputStudentName);
									 
										System.out.println("plz enter your Age");
										int inputStudentAge=sc.nextInt();
										studentDetails.setStudentAge(inputStudentAge);
										studentDetails.Age(inputStudentAge);
										if(inputStudentAge>3 && inputStudentAge<20) {
									    try {
										if (!inputStudentName.matches("^[a-zA-Z]*$")) {

											throw new Exception("You probably entered an invalid String data format");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										continue;

									}
									isHasExit = Boolean.TRUE;

									System.out.println("plz enter your Email");
									String inputStudentEmail = sc.next();
									studentDetails.setStudentEmail(inputStudentEmail);
									EmailArray.add(inputStudentEmail);
									try {
										if (!inputStudentEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {

											throw new Exception("You probably entered an invalid String data format");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										continue;

									}
									while (isHasExit) {

										// this code to enter course and marks to list
										System.out.println("Enter Course Name \n");
										Course CourseDetails = new Course();
										String inputStudentCourse = sc.next();
										stack.push(inputStudentCourse);

										CourseDetails.setCourseName(inputStudentCourse);
										courseList1.add(CourseDetails);
										studentDetails.courseList1.add(CourseDetails);

										try {
											if (!inputStudentCourse.matches("^[a-zA-Z]*$")) {

												throw new Exception(
														"You probably entered an invalid String data format");
											}
										} catch (Exception e) {
											System.out.println(e.getMessage());
											continue;

										}
										try {
											System.out.println("Enter marks \n");
											Marks MarksDetails = new Marks();
											MarksDetails.finalize();
											int inputMarksCourse = sc.nextInt();
											String inputMarksCourseConvert = String.valueOf(inputMarksCourse);
											stack.push(inputMarksCourseConvert);
											MarksDetails.CheckDegree(inputMarksCourse);
											MarksDetails.setCourseMarks(inputMarksCourse);
											CourseDetails.courseMarkss.add(MarksDetails);
										} catch (Exception e) {
											System.out.println(e.getMessage());
											continue;

										}

										//// user enter currency
										while (isHasExitAmount) {
											System.out.println(" Currency Converter!");

											System.out.println("which currency You want to Convert  your Amount? ");

											System.out.println("1:BRL \t2:USD \t3:EUR ");
											code = sc.nextInt();

											System.out.println("How much Amount you want to convert ?");
											amount = sc.nextDouble();

											if (code == 1) {
												nameCurrency = "BRL";
												amountcal = amount * 13.69;
											} else if (code == 2) {
												nameCurrency = "USD";
												amountcal = amount * 2.60;
											} else if (code == 3) {
												nameCurrency = "EUR";
												amountcal = amount * 2.65;
											} else {
												System.out.println("plz choose currency from the list");
												System.out.println("1:BRL \t2:USD \t3:EUR ");

											}
											System.out.println("Student Amount" + amountcal);
											studentFees.put(nameCurrency, amountcal);
											studentFeesWithCurrency.put(studentDetails.getStudentName(), studentFees);

											System.out.println(
													"Do You Want To Add  another amount press 1 if not press 0 ");
											int exitoutputAmount = sc.nextInt();
											if (exitoutputAmount == 0) {
												isHasExitAmount = false;
											}
										}
										System.out.println("Do You want To Add course press 1 if not press 0");
										int exitoutput = sc.nextInt();
										if (exitoutput == 0) {

											isHasExit = false;
										}
										studentList.add(studentDetails);
									}

									//
									SchoolList.add(schoolDetails);

									System.out.println("Do You want To Add student press 1 ");
									int exitStudentOutput = sc.nextInt();
									if (exitStudentOutput == 0) {
										isExit = false;
										isHasExit = true;
									}
								}
										else
										{
											System.out.println("----------------------------------------------");
											System.out.println("--------------THANK YOU Exit From Program-----");
											System.out.println("----------------------------------------------");
											System.exit(0);
											break;	
										}		
								
								}
								System.out.println("Do You want To Add school press 1 if not press 0 ");
								int schoolOutput = sc.nextInt();
								if (schoolOutput == 1) {
									isExit = true;
									isHasExit = true;
									isExitSchool = true;
								} else {
									isExit = false;
									isHasExit = false;
									isExitSchool = false;
								}

							
							
							
							}
							break;

						case "2":
							System.out.println("----------------------------------------------");
							System.out.println("--------------REPORTS FOR ALL STUDENT--------------");
							System.out.println("----------------------------------------------");
							for (School ssc : SchoolList) {
								for (Student s : studentList) {
									for (Course c : s.courseList1) {
										for (Marks m : c.getCourseMarksList()) {

											System.out.println("SchoolName:    " + ssc.getSchoolName());
											System.out.println("student name:  " + s.getStudentName()
													+ "Student Email :" + s.getStudentEmail());
											System.out.println("course Name:   " + c.getCourseName() + " " + "marks"
													+ m.getCourseMarks());

										}
									}
								}
							}
							break;
						case "3":

							System.out.println("----------------------------------------------");
							System.out.println("--------------HISTORY OF PROGRAMM--------------");
							System.out.println("----------------------------------------------");
							fileWrite1.writeObject(stack);
							try {
								Stack<String> st = (Stack<String>) fileRead1.readObject();
								System.out.println(st);

							} catch (ClassNotFoundException | IOException e) {
								System.out.println(e.getMessage());

							}

							break;
						case "4":
							System.out.println("----------------------------------------------");
							System.out.println("--AMOUNT AND CURRENCY OF ALL STUDENT----------");
							System.out.println("----------------------------------------------");

							for (String nameOfStudent : studentFeesWithCurrency.keySet()) {
								Map<String, Double> lowerMap = studentFeesWithCurrency.get(nameOfStudent);
								System.out.println("Name of Student: " + nameOfStudent);
								for (String currenyKey : lowerMap.keySet()) {
									System.out.println(
											" Currency: " + currenyKey + " Amount: " + lowerMap.get(currenyKey));
								}
								System.out.println("----------------------------------------------");

							}
							break;
						case "5":
							// Set<String> duplicates = new HashSet<>();
							System.out.println("----------------------------------------------");
							System.out.println("--------------DUPLICATE EMAIL--------------");
							System.out.println("----------------------------------------------");
							for (String name : EmailArray) {
								if (setEmaildata.add(name) == false) {
									System.out.println(" duplicate email  : " + name);
									System.out.println("----------------------------------------------");

								} else {
									System.out.println(" NO DUPLICATE EMAIL ");
									System.out.println("----------------------------------------------");

								}

							}

							break;

						case "6":
							do {
								System.out.println("----------------------------------------------");
								System.out.println("--------------Welcome to sub menu-----");
								System.out.println("----------------------------------------------");
								subMenuProgram.put(1, "Fectorial \n");
								subMenuProgram.put(2, "FIBONACCI \n");
								subMenuProgram.put(3, "Exit from Program \n");

								System.out.println(subMenuProgram);
								System.out.println("Please Enter your option:\n");
								int opp2 = sc.nextInt();
								switch (opp2) {
								case 1:
									System.out.println("----------------------------------------------");
									System.out.println("----------------- fACTORIAL-------------------");
									System.out.println("----------------------------------------------");
									System.out.println("plaz enter number to cal factorial");
									int facNumber = sc.nextInt();

									System.out.println("Factorial of :   " + facNumber + "  is  "
											+ man.extraLongFactorials(facNumber));
									break;
								case 2:
									System.out.println("----------------------------------------------");
									System.out.println("---------------------FIBONACI-----------------");
									System.out.println("----------------------------------------------");

									System.out.println("plz enter Count Number");
									int count = sc.nextInt();
									int n1 = 0;
									int n2 = 1;
									int n3, i;
									System.out.print(n1 + " " + n2);// printing 0 and 1

									for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
									{

										n3 = n1 + n2;
										if (n3 <= 100) {
											System.out.print(" " + n3);
											n1 = n2;
											n2 = n3;
										}
									}
									break;
								case 3:

									isRun = false;

									break;
								}

							} while (isRun);
							break;

						case "7":
							System.out.println("----------------------------------------------");
							System.out.println("----------Serilization from student Class-----");
							System.out.println("----------------------------------------------");
							Student student1 = new Student("amaal", "26j1230@gmail");
							Student student2 = new Student("ahaid", "ahaidj1230@gmail");
							Student student3 = new Student("ali", "alij1230@gmail");

							try {
								fileName = new FileOutputStream("C:\\Users\\Amaal\\OneDrive\\Desktop\\txt\\school0");
								fileWrite = new ObjectOutputStream(fileName);
								fileRead = new ObjectInputStream(
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

							break;
						case "8":
							System.out.println("----------------------------------------------");
							System.out.println("--------------THANK YOU Exit From Program-----");
							System.out.println("----------------------------------------------");
							System.exit(0);
							break;

						}
					} while (true);
				} else {
					System.out.println("=============Login Not Succefully==================");

				}

			} else

			{
				System.out.println("=============Login Not Succefully==================");

			}

		}

	}
}
