package com.pluralsight;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //What features does the app need to have
        //Creating accounts
        //Viewing accounts
        //Viewing videos
        //Liking Videos
        //Commenting on videos
        //System.out.println("");

        //Declaring an assigning variables
        //Create 4 variables for user information
        //username, password, email, followaccount

        int userID = 123456789;
        String userName = "CharlesM";
        String passWord = "SomethingIsMyPassword";
        String email = "Charlesmateo18@gmail.com";
        int followersCount = 10;
        int followingCount = 100;
        boolean isVerified = true;
        boolean isBanned = false;
        boolean isActive = true;
        int videoLikes = 100000;
        boolean isLoggedIn;
        String correctUsername = "CharlesM";
        String correctPassword = "SomethingIsMyPassword";

        // show the text.. Welcome to TikTok would you like to login?
        System.out.println("Welcome to Tiktok");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Username: ");
        userName = scanner.nextLine();

        System.out.println("Enter your Password: ");
        passWord = scanner.nextLine();

        if(passWord.equals(correctPassword) && userName.equals(correctUsername))
        {
            System.out.println("Logged in Succesfully");
            isLoggedIn = true;
            System.out.println("Hello " + userName + " Welcome back!");
        }
        else
        {
            System.out.println("Password/Username is incorrect");
            isLoggedIn = false;
        }




    }
}