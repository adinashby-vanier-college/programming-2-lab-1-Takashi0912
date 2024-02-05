package com.prog2.labs;
import java.util.*;
/**
 * @author adinashby
 *
 */
public class LabOne {

    /**
     * Write your test code below in the main.
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public String concatStringToEnd(String firstString, String secondString) {
        String result = firstString + " " + secondString;
        return result;
    }

    public boolean doesEndWithSecondString(String firstString, String secondString) {

        int startIndex = firstString.length() - secondString.length();
        String firstStringEnd = firstString.substring(startIndex);

        if (firstStringEnd.toLowerCase().equals(secondString.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public int randomIntegerGenerator(int startingNumber, int endingNumber) {
        Random rand = new Random();
      int num = rand.nextInt(endingNumber-startingNumber)+startingNumber;
        return num;
    }

    public boolean isPasswordValid(String password) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean result;
	 
        if (password.length()<8)
		return false;
	
	else
           
	for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isUpperCase(c))
            upper = true;
        else if (Character.isLowerCase(c))
            lower = true;
        else if (Character.isDigit(c))
            digit = true;
	 }        
    
    result=upper&&lower&&digit;
    	
        return result;
    }

}
