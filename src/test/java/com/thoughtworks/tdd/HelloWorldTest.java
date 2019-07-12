package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }


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

}
