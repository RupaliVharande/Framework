package framework.automationframework;

public class Student 
{
	Student()
	{
		System.out.println("I am in default constuctor");
	}
	
	Student(int rollno)
	{
      System.out.println(rollno);
    }
	Student(int rollno,String name)
	{
		System.out.println(rollno+name);
	}
	Student(String name,int rollno)
    {
		System.out.println(name+rollno);
    }
	
		void calmarks()
		{
			System.out.println("I am in student class");
		}
}

