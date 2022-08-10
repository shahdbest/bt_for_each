package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
         return sc.nextLine();
    }

    public void displayResult(boolean result) {
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s) {
        int sum = 0;
        boolean flag = true;
        if(s==null)
        {
            return false;
        }
        StringTokenizer st = new StringTokenizer(s, "-");
        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();
            sum = sum + s1.length();
            for (int i = 0; i < s1.length(); i++) {
                if (!Character.isDigit(s1.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (sum == 10 && flag) {
            return true;
        }
        else {
            return false;
        }
    }
}
