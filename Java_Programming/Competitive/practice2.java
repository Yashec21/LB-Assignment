import java.util.*;

class practice2
{
    public static void main(String A []) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1, iValue2;
     
        System.out.println("Enter first number :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iValue2 = sobj.nextInt();

        int iAdd = 0;

        iAdd = iValue1 + iValue2;

        System.out.println("Addition is :"+iAdd);


    }
}
