/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

public class Assignment_1_Exercise_3 {
    public static void main(String[] args) {
    /* Start of concatenation string */

    String part1 = "Who said this quote? Success is not final, failure is not fatal: it is the" +
            " courage to continue that matters. \n";
    String part2 = "Who said it? Winston Churchill. \n";
    String part3 = "Winston Churchill says, \" Success is not final, failure is not fatal: it is the\n"
    +  "courage to continue that matters.\"";

    /* Combine all strings into one output */

    String full = part1 + part2 + part3;
    
    /* Final output where code gets printed out */

    System.out.println(full);

    }
}
