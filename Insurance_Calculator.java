//CSE-19-17
//Question 3
import java.util.Scanner;

public class Insurance_Calculator {
    public static void main(String[] args) {
        char health;
        char gender,place;
        int age;
        System.out.println("Specify your health (e for excellent and p for poor)");
        Scanner sc=new Scanner(System.in);
        health=sc.next().charAt(0);
        System.out.println("Specify whether you live in a city or village (c for city and v for village) ");
        place=sc.next().charAt(0);
        System.out.println("Specify your gender (m for male and f for female)" );
        gender=sc.next().charAt(0);
        System.out.println("Specify your age");
        age=sc.nextInt();
        if (health=='e' && (age>=25 && age<=35) && place=='c' && gender=='m'){
            System.out.println(" Insured: Yes\n Premium rate: Rs 4 per thousand \n Maximum Amount : 2 lac");
        } else if (health=='e' && (age>=25 && age<=35) && place=='c' && gender=='f') {
            System.out.println("Insured: Yes \n Premium rate: Rs 3 per thousand\n Maximum Amount : 1 lac");
        } else if (health=='p' && (age>=25 && age<=35) && place=='v' && gender=='m') {
            System.out.println("Insured: Yes\n Premium rate: Rs 6 per thousand \n Maximum Amount : 10 thousand");
        }else {
            System.out.println("Insured : No");
        }
    }
}
