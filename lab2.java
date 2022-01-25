package com.company;
import java.util.Scanner;

class Lab2{

    public static void main(String [] args){
        //Running multiple functions in main
        question1();
        question2();
        question3();
        question4();

    }

    public static void question1(){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        float radius = input.nextFloat();

        double area = radius*radius*PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

    public static void question2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float firstNum = input.nextFloat();
        float secondNum = input.nextFloat();
        float thirdNum = input.nextFloat();
        input.nextLine();
        // This is used to consume the \n character as nextFloat() will only take in the float value but not the 'enter' key
        float average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average of " + firstNum + " " + secondNum + " " + thirdNum + " " + "is " + average);
        System.out.print("Enter three numbers: ");
        String listofNums = input.nextLine();
        String[] nums = listofNums.split(" ");
        Float[] str_new = new Float[3];

        for (int i = 0; i < nums.length; i++){
            String str = nums[i];
            str_new[i] = Float.parseFloat(nums[i]);
        }
        firstNum = str_new[0];
        secondNum = str_new[1];
        thirdNum = str_new[2];
        average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average of " + firstNum + " " + secondNum + " " + thirdNum + " " + "is " + average);
    }

    public static void question3(){
        long time = System.currentTimeMillis();
        //Note that the milliseconds returned is in UTC time
        long totalSeconds = time / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

    public static void question4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;

        }
    }
}