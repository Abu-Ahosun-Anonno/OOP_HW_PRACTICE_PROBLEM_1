import java.util.Scanner;

public class Practice_problem_j {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int number=input.nextInt();
        if(number>=0 && number<40){
            System.out.println("F");
        }
      else  if(number>=40 && number<=59){
            System.out.println("C+");
        }
       else if(number>=60 && number<70){
            System.out.println("B");
        }
      else  if(number>=70 && number<80){
            System.out.println("A-");
        }
     else   if(number>=80 && number<90){
            System.out.println("A");
        }
       else if(number>=90){
            System.out.println("A+");
        }



    }
}
