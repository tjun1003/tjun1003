public class MainProgram

{

	static int value = 1213;

	int value2 = 393;

	public static void showAnswer()

	{

		System.out.println(Answer);

	}

	public void showName()

	{

		System.out.println(Name);

	}

	public static void main(String[] args)

	{

		System.out.println("Hello");

		MainProgram a= new MainProgram();

		a.showName();
	
		showAnswer();

		System.out.println("Static no " +value);

		System.out.println("Non Static no " + a.value2);

	}

}

import java.util.*;
public class homework 
{
    
    public static void main(String[] args) 
    {
        char ch;
        System.out.println("Enter the character");
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);

        ch=Character.toUpperCase(ch);

        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("It is a vowel.");
        }
        else
        {
            System.out.println("It is a consonant.");
        }



    }
}



import java.util.*;
public class homework 
{
    
    public static void main(String[] args) 
    {
        int iValue=0;
        double iDouble;

   
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value: ");

        iValue= sc.nextInt();
         iDouble=iValue;

        System.out.println("Value of integer: "+iValue);
        System.out.println("Value of double: "+iDouble);

    }
}


import java.util.*;
public class homework 
{
    
    public static void main(String[] args) 
    {
        int value=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value: ");

        value= sc.nextInt();
        if(value%2==1)
        {
            System.out.println("It is odd number. ");
        }
        else
        {
            System.out.println("It is even number.");
        }
       

    }
}

