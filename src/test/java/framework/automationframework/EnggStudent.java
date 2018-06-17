package framework.automationframework;

public class EnggStudent extends Student
{
	void calmarks()
       {
			System.out.println("I am in engg student class");
       }
	


public static void main(String args[])
       {
	     
	    EnggStudent e1=new EnggStudent();
	    
	    
	e1.calmarks();

       }
}

