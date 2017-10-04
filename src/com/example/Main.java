package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a month");

        for (Month month: Month.values()
             ) {
                System.out.println(month.getEnglishName());
        }
        String usersChoice = scanner.nextLine();

        ArrayList<String> allMonths = new ArrayList<>();

        switch (usersChoice){
            case "January":  allMonths.add("January");
            case "February": allMonths.add("February");
            case "March":    allMonths.add("March");
            case "April":    allMonths.add("April");
            case "May":      allMonths.add("May");
            case "June":     allMonths.add("June");
            case "July":     allMonths.add("July");
            case "August":   allMonths.add("August");
            case "September":allMonths.add("September");
            case "October":  allMonths.add("October");
            case "November": allMonths.add("November");
            case "December": allMonths.add("December");
            break;
            
        }
        System.out.println(allMonths);
    }
}
