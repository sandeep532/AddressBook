import java.io.*;
import java.util.*;

public class AddressBookUc3
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the number of entries you want to insert");
    int n = sc.nextInt ();
//creating array for storing
    String arr[] = new String[n];
      ArrayList < String > arrli = new ArrayList <> ();
      ArrayList < String > edit = new ArrayList <> ();
    String firstName, lastName, address, city, state, zip, phoneNumber, email;
      sc.nextLine ();
//running the loop for entries
    for (int i = 0; i < n; i++)
      {
//taking empty string
	String str = "";

	  System.out.println ("Enter first name");
//taking input
	  firstName = sc.nextLine ();
	  str += firstName + " ";
	  System.out.println ("Enter last name");
//taking input
	  lastName = sc.nextLine ();
	  str += lastName + " ";
	  System.out.println ("Enter Address");
//taking input
	  address = sc.nextLine ();
	  str += address + " ";
	  System.out.println ("Enter city name");
//taking input
	  city = sc.nextLine ();
	  str += city + " ";
	  System.out.println ("Enter state");
//taking input
	  state = sc.nextLine ();
	  str += state + " ";
	  System.out.println ("Enter zip");
//taking input
	  zip = sc.nextLine ();
	  str += zip + " ";
	  System.out.println ("Enter phone number");
//taking input
	  phoneNumber = sc.nextLine ();
	  str += phoneNumber + " ";
	  System.out.println ("Enter email");
//taking input
	  email = sc.nextLine ();
	  str += email + " ";
//storing in the array
	  arr[i] = str;
	  arrli.add (str);
      }
    System.out.println ("do you want to edit y/n");
    char ch = sc.next ().charAt (0);
    if (ch == 'y')
      {
	System.out.println ("enter person firstname to edit");
	String str2 = sc.nextLine ();
	sc.nextLine ();
	System.out.println ("enter the value of what you want to edit");
	String str3 = sc.nextLine ();
	System.out.println ("enter the value of replacement");
	String str4 = sc.nextLine ();
	for (int i = 0; i < n; i++)
	  {
	    String dummy = arrli.get (i);
	    if (dummy.contains (str3))
	      {

		dummy = dummy.replace (str3, str4);
//System.out.println("after updating value\n");
//System.out.println(i);
		arrli.set (i, dummy);
	      }
	  }

      }


//printing the entries
    System.out.println ("Total entries before updating");
  for (String i:arrli)
      System.out.println (i + "\n");

  }
}
