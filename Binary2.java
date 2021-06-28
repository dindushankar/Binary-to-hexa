import java.util.Scanner;
import java.lang.*;
public class Binary2{
    public static void toBinary(int num){   
     int decimal = num;
     int binary[] = new int[50];    
     int index = 0;    
     while(decimal > 0){    
       binary[index] = decimal%2;    
       decimal = decimal/2;   
       index=index+1;
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
    System.out.println();
}    

    public static void toHexa(int num){   
     int rem;
     String str2=""; 
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("Decimal to hexadecimal: "+str2);
}    


     public static void main(String []args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the number : ");
        int num= sc.nextInt();
        
        toBinary(num);
        toHexa(num);
}
}