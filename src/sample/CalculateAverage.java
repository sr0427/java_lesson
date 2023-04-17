package sample;

import java.util.Scanner;



public class CalculateAverage {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Input score of Japanese!");
        int Japanese = sc.nextInt();

        System.out.println("Input score of mathmatic!");
        int mathmatic = sc.nextInt();

        System.out.println("Input score of Science!");
        int Science = sc.nextInt();

        System.out.println("Input score of Society!");
        int Society = sc.nextInt();


        float average = (Japanese + mathmatic + Science + Society) / 4.0f;
        String message = "Score average is" + average;
        System.err.println(message);







    }


}
