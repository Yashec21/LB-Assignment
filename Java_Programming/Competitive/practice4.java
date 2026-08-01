import java.util.*;

class DisplayX
{

    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Marvellous...");
        }
}
}

class practice4
{
    public static void main(String A []) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter Number:");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.Display(iValue);
    }
}

