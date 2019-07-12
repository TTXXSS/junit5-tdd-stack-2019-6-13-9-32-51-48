package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberTest {
    @Test
    public void sholud_return_Fizz_when_call_number_with_3(){
        Number number = new Number();
        String actual = number.number(3);
        assertThat(actual, is("Fizz"));

    }
    @Test
    public void sholud_return_Buzz_when_call_number_with_5(){
        Number number = new Number();
        String actual = number.number(5);
        assertThat(actual, is("Buzz"));

    }
    @Test
    public void sholud_return_FizzBuzz_when_call_number_with_15(){
        Number number = new Number();
        String actual = number.number(15);
        assertThat(actual, is("FizzBuzz"));

    }
    @Test
    public void sholud_return_FizzBuzzWhizz_when_call_number_with_105(){
        Number number = new Number();
        String actual = number.number(105);
        assertThat(actual, is("FizzBuzzWhizz"));

    }

    @Test
    public void sholud_return_1_when_call_number_with_1(){
        Number number = new Number();
        String actual = number.number(1);
        assertThat(actual, is("1"));

    }


}
