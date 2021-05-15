
import java.util.*;
public class SumofArray {
    
    public static int Calculate(int[] arr) {  
        //Initialize array  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        return sum;  
    
        public static int multiply(int[] arr){
     int Mul =1;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           Mul = Mul * arr[i];     
        
        
    }
    return Mul;
    }
            static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

   public static void main(String[] args)
{
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements : ");
n=sc.nextInt();
int[] array = new int[10];
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
sum=Calculate(array);
System.out.println("Sum of all the elements of an array: " + sum); 
mul=1;
mul=multiply(array);
System.out.println("Multiplication of all the elements of an array :"+mul);
}
        Integer [] arryz={10,20,30,40,50,60};
reverse(arryz);
integer[] array = new integer[10];
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
sum=Calculate(array);
System.out.println("Sum of all the elements of an array: " + sum); 
mul=1;
mul=multiply(array);
System.out.println("Multiplication of all the elements of an array :"+mul);
}
} 
    
