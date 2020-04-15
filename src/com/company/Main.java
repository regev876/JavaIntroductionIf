package com.company;
import javax.swing.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        if (N % 2 != 0) {
            System.out.print("Weird");
        }
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.print("Not Weird");
            }
            else if (N>= 6 && N<=20) {
                System.out.print("Weird");
            }
            else if (N > 20) {
                System.out.print("Not Weird");
            }
        }
    }
}