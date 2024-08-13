//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program1
{
    public static void main(String[] args){
        int z = 3212;
        int w = 334;
        int x = 0;
        int y = 0;
        int total = 0;
        double avg = 0;

        Scanner value = new Scanner(System.in);
        System.out.println(" Enter a number :" );
        z = value.nextInt();
        
        Scanner value2 = new Scanner(System.in);
        System.out.println(" Enter a number :");
        w = value2.nextInt();

        Scanner value4 = new Scanner(System.in);
        System.out.println("Enter a number :");
        x = value4.nextInt();

                Scanner value3 = new Scanner(System.in);
        System.out.println("Enter a number  :");
        y = value3.nextInt();

        total = x+z+w+y;
        System.out.println("The total sum of your values is " + total);
        avg = total/4.0;
        System.out.println("The avegage of the numbers is" + avg);
    }
}


//Paste console output below:
/*
 Enter a number :
475
 Enter a number :
821
Enter a number :
269
Enter a number  :
562
The total sum of your values is 2127
The avegage of the numbers is531.75

 */
