package com.company;


import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    ConverterApplication sampleA = new ConverterApplication();
    Converter sampleB = new ConverterApplication();

    @Test
    public void convertNumberToMonth(){
        String month = sampleA.convertMonth(5);
        assertEquals("May", month);
    }

    @Test
    public void convertNumberToWeekday(){
        String day = sampleB.convertDay(5);
        assertEquals("Thursday", day);
    }

    @Test
    public void failedToConvertNumberToMonth(){
        String failMessage = sampleB.convertMonth(13);
        System.out.println(sampleB.convertMonth(13));
        assertEquals("Must enter a valid month number", failMessage);
    }

    @Test
    public void failedToConvertNumberToWeekday(){
        String failMessage = sampleA.convertDay(8);
        System.out.println(sampleA.convertDay(8));
        assertEquals("Must enter valid weekday number", failMessage);
    }

}
