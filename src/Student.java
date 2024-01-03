public class Student {
	
	private int rollNo;
	private String name;
	private static int count;
	
	public Student() {}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}

	public static int getCount()
	{
		return count;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	static 
	{
		System.out.println("Static BLock");
		count = 50;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Student s1 = new Student(1,"Rahul");
		Student s2 = new Student(2,"Priyanka");
		Student s3 = new Student(3,"Prateek");
		System.out.println("Student Count = "+Student.getCount());
		//System.out.println(s1.getCount());
	}	
}
