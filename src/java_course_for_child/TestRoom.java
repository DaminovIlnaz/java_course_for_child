package java_course_for_child;

import java.util.Scanner;

public class TestRoom {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("четное");
        }else {
            System.out.println("нечетное");
        }
    }
}
