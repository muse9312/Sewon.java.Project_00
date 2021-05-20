package student.test;

import student.entity.Student;

public class StudentTest {
	public static void main(String[] args) {

		Student ST = new Student();

//		System.out.println("학번 id " + ST.id);
//		System.out.println("학번 name " + ST.name);
//		System.out.println("학번 name " + ST.grade);
//		System.out.println("학번 gender " + ST.gender);

//		String id = args[0];
//		int ID = Integer.parseInt(id);
//		String name = args[1];
//		String grade = args[2];
//		String gender = args[3];
		
		
//		System.out.printf("ID = %d%n Name = %d%n , Grade = %d%n, Gender = %d%n" + 2012761034 , 오세원 , 1234 , 남자  );

		
		System.out.printf("ID = %d%n", ST.id);
		System.out.printf("NAME = %s%nGRADE = %s%n", ST.name, ST.grade);
		System.out.printf("GENDER = %s%n", ST.gender);
		
		
		Student ST2 = new Student();
		System.out.println(ST != ST2);
		//Name = %d%nGrade = %d%nGender = %d" ST.name, ST.grade, ST.gender
		/*
		 * ID = 12345 
		 
		 *     Name = 오세원 
		 * Grade = grade
		 * Gender = 남자
		 * 
		 * 
		 */
	}

}
