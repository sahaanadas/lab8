import java.util.Scanner;

class mainclass
{
	public static void main(String[] arg)
	{
		int a,b;
		mainclass g= new mainclass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		int n=g.addnumbers(a,b);
		System.out.println(n);
		System.out.println();
		sc.nextLine();
		System.out.println("Enter first string:");
		String c=sc.nextLine();
		System.out.println("Enter second string:");
		String d=sc.nextLine();
		System.out.println();
		String m=g.addstrings(c,d);
		System.out.println(m);
        sc.close();
	}
	public int addnumbers(int x,int y)
	{
		return(x+y);
	}
	public String addstrings(String x, String y)
	{
		String z;
		z=x.concat(y);
		return(z);
	}
}