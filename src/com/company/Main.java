package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Type verbatim: P Sherman 42 Wallaby Way Sydney");

        Scanner scan = new Scanner(System.in);
        String firstInitial = scan.next();
        String lastName = scan.next();
        String houseNumber = scan.next();
        String streetName = scan.next();
        String streetType = scan.next();
        String city = scan.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}

/*

Complete the following program. Use the Scanner class to read
the following string into variables. Input String: "P Sherman 42 Wallaby Way Sydney"
Variables: firstInitial,lastName, houseNumber,streetName,streetType,city

Your output should be handled with this code:

System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
System.out.println(streetName + " " + streetType + " " + city);
 */