/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
	public static void main(String[] args) 
	{
		int index = 100;
		int numAtIndex = fibonacci(index);
		System.out.println("The " + index + "th Fibonacci number is " + numAtIndex);
		
	}
	
	public static int fibonacci(int num)
	{
	    if(num == 0)
	    {
	        return 0;
	    }
	    else if(num == 1)
	    {
	        return 1;
	    }
	    else
	    {
	        return fibonacci(num - 1) + fibonacci(num - 2);
	    }
	}
}
