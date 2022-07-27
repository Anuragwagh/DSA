/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many elements you want to add in array?");
		int size = s.nextInt();
		
		int[] a = new int[size];
		
		for(int i = 0;i<size;i++){
        a[i] = s.nextInt();
        }
        
        System.out.println("Enter how many number of comparison you want? ");
        int number_comparison = s.nextInt();
        
        System.out.println("Min Element : " + min(a,number_comparison));
        System.out.println("Man Element : " + max(a,number_comparison));
		
	}
	
	public static int min(int[] a,int n){
	   
	    int m = a[0];
    
        for(int i = 0; i<n;i++){
        
        if(m>a[i]){
            m = a[i];
        }
    }
    
    return m;
	} 
	
	public static int max(int[] a,int n){
	   
	    int m = a[0];
    
        for(int i = 0; i<n;i++){
        
        if(m<a[i]){
            m = a[i];
        }
    }
    
    return m;
	} 
}

/* OUTPUT

How many elements you want to add in array?
5
2
3
7
5
12
Enter how many number of comparison you want? 
4
Min Element : 2
Man Element : 7

*/
