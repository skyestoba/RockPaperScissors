package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RockPaperScissors();

    }

    private static void RockPaperScissors() {
        System.out.println("Welcome to Rock, Paper, Scissors! \n Rock = 0, Paper = 1, Scissors = 2");
        System.out.println("Rock, paper, scissors, shoot!");
        int roboNum = (int)(Math.random()*2);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPlaying = true;


        while(isPlaying){
            while(roboNum==0){
                if(num==0){
                    System.out.println("Rock vs Rock! \nIt's a tie!");
                    isPlaying=false;
                    break;
                }

                if(num==1){
                    System.out.println("Rock vs Paper! \nYou win!");
                    isPlaying=false;
                    break;
                }

                if(num==2){
                    System.out.println("Rock vs Scissors! \nYou loose!");
                    isPlaying=false;
                    break;
                }
            }

            while(roboNum==1){
                if(num==0){
                    System.out.println("Paper vs Rock! \nYou loose!");
                    isPlaying=false;
                    break;
                }

                if(num==1){
                    System.out.println("Paper vs Paper! \nIt's a tie!");
                    isPlaying=false;
                    break;
                }

                if(num==2){
                    System.out.println("Paper vs Scissors! \nYou win!");
                    isPlaying=false;
                    break;
                }
            }
            while(roboNum==2){
                if(num==0){
                    System.out.println("Scissors vs Rock! \nYou win!");
                    isPlaying=false;
                    break;
                }

                if(num==1){
                    System.out.println("Scissors vs Paper! \nYou loose!");
                    isPlaying=false;
                    break;
                }

                if(num==2){
                    System.out.println("Scissors vs Scissors! \nIt's a tie!");
                    isPlaying=false;
                    break;
                }
            }
        }


        System.out.println("Would you like to play again?");
        Scanner scanner2 = new Scanner(System.in);
        String ans = scanner2.nextLine();
        if (Objects.equals(ans, "yes")) {
            RockPaperScissors();

        }

        if (Objects.equals(ans, "no")){
            System.out.println("Good game! See you next time!");

        }
    }

}

