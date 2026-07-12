import java.util.Scanner;

public class practice_problem_2_a {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year= input.nextInt();
        if(year % 400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leap year");
        }
else{
    System.out.println("Not Leap Year");
        }



    }
}
