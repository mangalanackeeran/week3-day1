package org.student;


import org.department.Department;

public class Student extends Department {

	public void StudentName()
	{
		System.out.println("StudentName");
	}
	public void studentDept()
	{
		System.out.println("studentDept");
	}
	public void studentId()
	{
		System.out.println("studentId");
	}

	public static void main(String[] args)
	{
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		
		s.deptName();
		
		s.StudentName();
		s.studentDept();
		s.studentId();
		
	}
}
