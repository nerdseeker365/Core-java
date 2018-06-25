//Student.java
public class Student{
public static void main(String[] args) {
	School s1=new School();
	School s2 =new School();
	//student1 
	s1.stNo=158;
	s1.stName="sankar";
	s1.stAddress="razole";
	s1.stFee=3600;
	//student2
	s2.stNo=159;
	s2.stName="sankar";
	s2.stAddress="eluru";
	s2.stFee=3600;
	//marks of s1
	s1.telugu=90;
	 s1.english=60;
	 s1.social=80;
     s1.hindi=45;
	 s1.ns=75;
	 s1.maths=91;
	//marks of s1
		s2.telugu=60;
		 s2.english=90;
		 s2.social=80;
	     s2.hindi=75;
		 s2.ns=65;
		 s2.maths=91;
	 //students details
		 System.out.println("\n student1 details");
	 s1.display();
	 System.out.println("\n student2 details");
	 s2.display();
	 //marks details
	System.out.print("\n total marks of student1= ");
	s1.marks();
	System.out.print("\n total marks of student2= ");
	s2.marks();
	}
}
	


