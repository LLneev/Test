

public class Subject1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student student=new Student();
		Student studento=new Student();
		student.member("","");
		studento.member("", "");
		Student.SubjectType java=new Student.SubjectType();
		Student.SubjectType SQL=new Student.SubjectType();
		Student.SubjectType J2EE=new Student.SubjectType();
		
		java.setRatio("", 90, 85, 75, 80);
		Student.printstudent();
		java.printlnfo("Java");
		SQL.setRatio("", 80, 90, 82, 75);
		SQL.printlnfo("SQL");
		J2EE.setRatio("", 78, 70, 65, 70);
		J2EE.printlnfo("J2EE");
		System.out.println("*********************************************");
		System.out.println("\n");
		studento.printstudent();
		java.setRatio("", 86, 67, 71, 70);
		
		java.printlnfo("Java");
		SQL.setRatio("", 77, 70, 85, 66);
		SQL.printlnfo("SQL");
		J2EE.setRatio("", 88, 74, 68, 80);
		J2EE.printlnfo("J2EE");				
	}

}
