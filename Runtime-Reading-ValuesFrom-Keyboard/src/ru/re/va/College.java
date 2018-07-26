package ru.re.va;
//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class College {
	public static void main(String[] args)throws IOException 
	{
		Student s1=new Student();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter student details\n");

		System.out.println("Enter student no: ");
		s1.no=Integer.parseInt(br.readLine());
		System.out.println("Enter student name: ");
		s1.name=(br.readLine());
		System.out.println("Enter student course: ");
		s1.course=(br.readLine());
		System.out.println("Enter student fee: ");
		s1.fee=Double.parseDouble(br.readLine());
		System.out.println("Enter student Email: ");
		s1.email=br.readLine();
		System.out.println("Enter student Mobile number: ");
		s1.mobile=Long.parseLong(br.readLine());
		System.out.println("Enter student Gendel: ");
		s1.gendel=br.readLine().charAt(0);
		System.out.println("Enter student study: ");
		s1.study=Boolean.parseBoolean(br.readLine());
		System.out.println("Confrom the values to be Entered");
		System.out.println("no : "+s1.no);
		System.out.println("name : "+s1.name);
		System.out.println("course : "+s1.course);
		System.out.println("fee : "+s1.fee);
		System.out.println("email : "+s1.email);
		System.out.println("mobile : "+s1.mobile);
		System.out.println("gendel : "+s1.gendel);
		System.out.println("studey : "+s1.study);
	
	}//main method 
}//class
