package practice;

public class Practice1 {
	
	public static void main(String[] args) {
		p1();
	}
	
	static void p1()
	{
		for (int i = 0;i <=20;i++)
		{
			if(i < 5)
			{
				System.out.print(i + " ,");
				continue;
			}
			if(i == 10)
			{
				System.out.println("Hello");
				break;
			}
			System.out.println("b3ds");
		}
	}
}

class Animal
{
	private void getName(String name)
	{
		System.out.println(name);
	}
}