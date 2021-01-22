import java.util.*;
import java.io.*;
class banker
{
	String bankName= "AAA bank";
	String cusId;
	String ifsc;
	private float balance;
	String uniqueCode;
	static ArrayDeque<String> data = new ArrayDeque<String>();

	String CID()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER IFSC CODE:- ");
		ifsc= scan.nextLine();
		System.out.println("ENTER UNIQUE CODE:- ");
		uniqueCode=scan.nextLine();
		cusId = bankName.substring(0,3)+'-'+ifsc+'-'+uniqueCode;
		System.out.println("ID details saved as "+" : "+cusId);
		return cusId;
	}

	String details()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter costumer name:- ");
		String name = scan.nextLine();
		System.out.println("enter balance:- ");
		balance = scan.nextFloat();
		String bal =Float.toString(balance);
		String cdetails = name+" "+cusId+" "+bal;
		System.out.println("details saved as "+" : "+cdetails);
		return cdetails;
	}
    void saveData(String g)
	{
		String h=g;
		data.push(h);
	}
}
class bank extends banker
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the userId and password");
		String user = scan.nextLine();
		String password = scan.nextLine();
		if(user.equals("USER")&&password.equals("USER"))
		{
		System.out.println("Sucessfuly logged in");
		banker b =new banker();
		System.out.println("press 1 to create details ");
		//Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		if(i==1)
		{
			System.out.println("enter the number of customer:- ");
			int k=scan.nextInt();
			for (i=0;i<=k-1;i++)
			{
			b.CID();
			String s=b.details();
			b.saveData(s);
			}
		}
		System.out.print("saving......");
		try
		{
			Thread.sleep(4000);
		}
		catch (Exception e)
		{

		}
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}
	catch(Exception E)
	{
		System.out.println(E);
	}

		System.out.println(" press 1 to get details or 0 to exit");
		int l = scan.nextInt();
		if(l==1)
		{
			int o = data.size();
			for (int q=0;q<=o-1;q++)
			{
				String n=data.pop();
				System.out.println(n);
			}
			System.out.println("sucesfuly logged out");
		}
		else
		{
			System.out.println("sucesfuly logged out");
		}
		}
		else
			{
			System.out.println("wrong pasword and userId");
			}
	}
}
