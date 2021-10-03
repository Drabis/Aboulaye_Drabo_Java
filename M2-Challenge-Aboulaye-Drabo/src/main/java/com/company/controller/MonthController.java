package com.company.controller;

import com.company.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class MonthController {

    private static Month[] months = {
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December"),
    };

    @GetMapping(value = "/month/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthByMonthNumber(@PathVariable int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12 ) {
            throw new IllegalArgumentException("Month Number must be between 1 and 12");
        }
        return months[monthNumber-1];
    }

    @GetMapping(value = "/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {
        Random random = new Random();
        return months[random.nextInt(12)];
    }
}
