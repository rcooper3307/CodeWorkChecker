package com.company;

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String symbol;
    public CodeWordChecker(int min, int max, String symbol)
    {
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }
    public CodeWordChecker(String symbol)
    {
        this.symbol = symbol;
        this.min = 6;
        this.max = 20;
    }
    public boolean isValid(String str)
    {
        if ((str.contains(symbol)) || (str.length() < min) || (str.length() > max))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

