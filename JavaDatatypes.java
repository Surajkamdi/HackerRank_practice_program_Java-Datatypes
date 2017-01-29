//Given an input integer, you must determine which primitive data types are capable of properly storing that input.
import java.util.*;
import java.io.*;



class JavaDatatypes{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
                //Complete the code
                //solution by Er. Suraj Kamdi
                if(x>= -32768 && x<=32767) { // for checking whether number is short type
                    System.out.println("* short");
                }
                if(x>=-2147483648 && x<=2147483647){ // for checking whether number is integer type
                    System.out.println("* int");
                }
                if(x>=Math.pow(-2, 63) && x<=(Math.pow(2,63)-1)){  // for checking whether number is long type
                     System.out.println("* long");
                }
                    
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
