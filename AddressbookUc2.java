import java.io.*;
import java.util.*;

public class AddressbookUc1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Entities want to enter");
		int n=sc.nextInt();
		String arr[] = new String[n];
		String firstName,lastName,address,city,state,zip,phoneNumber,email;
		sc.nextLine();
		for(int i=0;i<n;i++){
			String str = "";
			System.out.println("Enter first name");
			firstName=sc.nextLine();
			str+=firstName+" ";
			System.out.println("Enter last name");
			lastName=sc.nextLine();
			str+=lastName+" ";
			System.out.println("Enter Address");	
			address=sc.nextLine();
			str+=address+" ";
			System.out.println("Enter city name");	
			city=sc.nextLine();
			str+=city+" ";
			System.out.println("Enter state");	
			state=sc.nextLine();
			str+=state+" ";
			System.out.println("Enter zip");
			zip=sc.nextLine();
			str+=zip+" ";
			System.out.println("Enter phone number");	
			phoneNumber=sc.nextLine();
			str+=phoneNumber+" ";
			System.out.println("Enter email");
			email=sc.nextLine();
			str+=email+" ";
			arr[i]=str;
			}
		System.out.println("Total entries");
		for(String i : arr)
			System.out.println(i+"\n");
		}
}