package com.company;

public class CodeWordRunner {
    public static void main(String[] args) {
        // write your code here
        StringChecker sc1 = new CodeWordChecker(5,6,"$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("code"));
        System.out.println(sc1.isValid("happyCode"));

        System.out.println(sc2.isValid("myPass"));
        System.out.println(sc2.isValid("mypassPort"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
