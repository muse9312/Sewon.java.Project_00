package student.test;

import student.entity.Student;

public class StudentTest {
	public static void main(String[] args) {

		Student ST = new Student();

//		System.out.println("�й� id " + ST.id);
//		System.out.println("�й� name " + ST.name);
//		System.out.println("�й� name " + ST.grade);
//		System.out.println("�й� gender " + ST.gender);

//		String id = args[0];
//		int ID = Integer.parseInt(id);
//		String name = args[1];
//		String grade = args[2];
//		String gender = args[3];
		
		
//		System.out.printf("ID = %d%n Name = %d%n , Grade = %d%n, Gender = %d%n" + 2012761034 , ������ , 1234 , ����  );

		
		System.out.printf("ID = %d%n", ST.id);
		System.out.printf("NAME = %s%nGRADE = %s%n", ST.name, ST.grade);
		System.out.printf("GENDER = %s%n", ST.gender);
		
		
		Student ST2 = new Student();
		System.out.println(ST != ST2);
		//Name = %d%nGrade = %d%nGender = %d" ST.name, ST.grade, ST.gender
		/*
		 * ID = 12345 
		 
		 *     Name = ������ 
		 * Grade = grade
		 * Gender = ����
		 * 
		 * 
		 */
	}

}
