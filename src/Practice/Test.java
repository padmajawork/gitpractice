package Practice;

 class A
{
static A a1=null;
static A a2=null;
private A()
{
	System.out.println("private constructor");
}
public static A demo1()
{
	if(a1==null)
	{
		a1=new A();
		return a1;
	}
	else 
	{
		return a1;
	}
}
public static A demo2()
{
	if(a2==null)
	{
		a2=new A();
		return a2;
	}
	else
	{
		return a2;
	}
}

public void tester()
{
	System.out.println("tester called");
}

	}

public class Test
{
	public static void main(String[] args) {
		System.out.println("a1 object");
	A rv1=A.demo1();
	rv1.tester();
	A rv2=A.demo1();
	rv2.tester();
	System.out.println("a2 object");
	A rv3=A.demo2();
	rv3.tester();
	A rv4=A.demo2();
	rv4.tester();
	
	}
	
}
