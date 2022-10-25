import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {

	public int extraLongFactorials(int facNumber) {
		if(facNumber==0) {
			return 1;
		}
		else
		{
		return (facNumber* extraLongFactorials(facNumber-1));
		}
	}

	static ArrayList<School> SchoolList = new ArrayList<>();

	void setArrayListSchool(ArrayList<School> SchoolList) {
		this.SchoolList = SchoolList;

	}

	public ArrayList<School> getArrayList() {
		return SchoolList;
	}

	public static void main(String[] args) {
		ArrayList<Course> courseList1 = new ArrayList<>();
		ArrayList<Marks> marksList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();
		Stack<String> stack = new Stack<String>();
		Set<String> setEmaildata = new HashSet<String>();
		ArrayList<String> EmailArray = new ArrayList<String>();
		HashMap<String, Double> studentFees = new HashMap<String, Double>();
		HashMap<String, HashMap<String, Double>> studentFeesWithCurrency = new HashMap<String, HashMap<String, Double>>();
		Main man = new Main();
		double amountcal = 0;
		String nameCurrency = "";
		double amount = 0;
		String Dollar = "";
		String Pound = "";
		String Euro = "";
		boolean isRun = true;
		boolean isTeacherRun = true;
		int code;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+         WELOCOME  TO My System Teacher                         +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		while (isTeacherRun) {
			System.out.println("\n" + "Please Enter your User Name");
			String teacherName1 = sc1.next();

			System.out.println("please Enter your Password");
			int teacherID = sc1.nextInt();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			String teacherName2 = "Amaal";
			boolean check = teacherName1.equals(teacherName2);
			if (check == true) {
				if (teacherID == 1234) {
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
						menuProgram.put(7, "Exit from Program");

						System.out.println(menuProgram);
						System.out.println("Please Enter your option:\n");
						int sel = sc.nextInt();
						switch (sel) {
						case 1:

							System.out.println("===================");
							// TODO Auto-generated method stub

							boolean isExit = true;
							boolean isHasExit = true;
							Main ourSchool = new Main();
							boolean isExitSchool = true;
							boolean isHasExitAmount = true;
							while (isExitSchool) {
								School schoolDetails = new School();
								System.out.println("plz enter your school Name");
								String inputschoolName = sc.next();
								stack.push(inputschoolName);
								schoolDetails.setSchoolName(inputschoolName);
								// SchoolList.add(schoolDetails);
								// this code to enter name to list
								isExitSchool = Boolean.TRUE;
								while (isExit) {
									// Scanner sc=new Scanner(System.in);
									Student studentDetails = new Student();
									System.out.println("plz enter your Name");
									String inputStudentName = sc.next();
									stack.push(inputStudentName);
									studentDetails.setStudentName(inputStudentName);
									isHasExit = Boolean.TRUE;

									System.out.println("plz enter your Email");
									String inputStudentEmail = sc.next();
									studentDetails.setStudentEmail(inputStudentEmail);
									EmailArray.add(inputStudentEmail);
									while (isHasExit) {

										// this code to enter course and marks to list
										System.out.println("Enter Course Name \n");
										Course CourseDetails = new Course();
										String inputStudentCourse = sc.next();
										stack.push(inputStudentCourse);

										CourseDetails.setCourseName(inputStudentCourse);
										courseList1.add(CourseDetails);
										studentDetails.courseList1.add(CourseDetails);

										System.out.println("Enter marks \n");
										Marks MarksDetails = new Marks();
										int inputMarksCourse = sc.nextInt();
										String inputMarksCourseConvert = String.valueOf(inputMarksCourse);
										stack.push(inputMarksCourseConvert);
										MarksDetails.setCourseMarks(inputMarksCourse);
										CourseDetails.courseMarkss.add(MarksDetails);

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
								System.out.println("Do You want To Add school press 1 if not press 0 ");
								//int schoolOutput = sc.nextInt();
								//if (schoolOutput == 1) {
									//isExit = true;
									//isHasExit = true;
									//isExitSchool = true;
								//} else {
								//	isExit = false;
									//isHasExit = false;
								//	isExitSchool = false;
								//}

							//}

		//					break;

						//case 2:
							//System.out.println("----------------------------------------------");
							//System.out.println("--------------REPORTS FOR ALL STUDENT--------------");
							System.out.println("----------------------------------------------");
						//	for (School ssc : SchoolList) {
							//	for (Student s : studentList) {
								//	for (Course c : s.courseList1) {
										for (Marks m : c.getCourseMarksList()) {

											System.out.println("SchoolName:    " + ssc.getSchoolName());
											System.out.println("student name:  " + s.getStudentName()+ "Student Email :"+s.getStudentEmail());
											System.out.println("course Name:   " + c.getCourseName() + " " + "marks"
													+ m.getCourseMarks());

										}
									}
								}
							}
							break;
						case 3:
							System.out.println("----------------------------------------------");
							System.out.println("--------------HISTORY OF PROGRAMM--------------");
							System.out.println("----------------------------------------------");
							while (stack.empty() == false) {
								String y = (String) stack.pop();
								System.out.println(y);
							}
							System.out.println(stack.size());

							System.out.println("----------------------------------------------");

							break;
						case 4:
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
						case 5:
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

						case 6:
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
									int count=sc.nextInt();
									int n1 = 0;
									int n2 = 1;
									int n3, i;
									System.out.print(n1 + " " + n2);// printing 0 and 1

									for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
									{
										
										n3 = n1 + n2;
										if(n3<=100) {
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
						case 7:
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
