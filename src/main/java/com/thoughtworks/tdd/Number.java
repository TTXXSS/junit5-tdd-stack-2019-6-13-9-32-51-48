package com.thoughtworks.tdd;

public class Number {
    public String number(int i) {
        String result = "";
        if (i % 13 == 0)
            return result += "Fizz";
        if (i % 3 == 0)
            result += "Fizz";
        if (i % 5 == 0)
            result += "Buzz";
        if (i % 7 == 0)
            result += "Whizz";
        if (result.equals(""))
            return i + "";
        else
            return result;
    }
}
