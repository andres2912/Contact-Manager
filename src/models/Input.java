package models;

import java.util.Scanner;

public class Input {
    private static final Integer MAX_LENGTH_VALIDATION = 5;

    /**
     * This method prompts the user for input and converts it to uppercase if 
     * it contains any non-digit characters. Otherwise, it returns the string as is.
     * @return The user input, converted to uppercase if necessary.
     */
    public String input() {
        String data;
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        
        for (char c : data.toCharArray()) {
            if (!Character.isDigit(c)) {
                return data.toUpperCase();
            }
        }
        return data;
    }

    /**
     * This method checks if the input string has a length equal to 
     * MAX_LENGTH_VALIDATION and if all characters are digits.
     * 
     * @param data The string to validate.
     * @return true if the string meets the criteria, otherwise false.
     */
    public Boolean validation(String data) {
        if (Integer.valueOf(data.length()).equals(MAX_LENGTH_VALIDATION) &&
                data.chars().allMatch(Character::isDigit)) {
            return true;
        } else {
            return false;
        }
    }
}