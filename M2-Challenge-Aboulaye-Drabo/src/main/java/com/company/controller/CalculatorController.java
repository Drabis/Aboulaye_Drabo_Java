package com.company.controller;

import com.company.models.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.Objects;


@RestController
public class CalculatorController {


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Calculator addNumbers(@RequestBody Calculator mathEquation) {
        if(Objects.isNull(mathEquation.getOperand1()) || Objects.isNull(mathEquation.getOperand2())) {
            throw new IllegalArgumentException("Operands are incorrect");
        }
        mathEquation.setOperation("add");
        mathEquation.setAnswer(mathEquation.getOperand1() + mathEquation.getOperand2());
        return mathEquation;
    }

    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public Calculator subtractNumbers(@RequestBody Calculator mathEquation) {
        if(Objects.isNull(mathEquation.getOperand1()) || Objects.isNull(mathEquation.getOperand2())) {
            throw new IllegalArgumentException("Operands are incorrect");
        }
        mathEquation.setOperation("subtract");
        mathEquation.setAnswer(mathEquation.getOperand1() - mathEquation.getOperand2());
        return mathEquation;
    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public Calculator multiplyNumbers(@RequestBody Calculator mathEquation) {
        if(Objects.isNull(mathEquation.getOperand1()) || Objects.isNull(mathEquation.getOperand2())) {
            throw new IllegalArgumentException("Operands must be valid number");
        }
        mathEquation.setOperation("multiply");
        mathEquation.setAnswer(mathEquation.getOperand1() * mathEquation.getOperand2());
        return mathEquation;
    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public Calculator divideNumbers(@RequestBody Calculator mathEquation) {

        if(Objects.isNull(mathEquation.getOperand1()) || Objects.isNull(mathEquation.getOperand2()) || mathEquation.getOperand2() == 0 ) {
            throw new IllegalArgumentException("Operands are incorrect");
        }
        mathEquation.setOperation("divide");
        mathEquation.setAnswer(mathEquation.getOperand1() / mathEquation.getOperand2());
        return mathEquation;
    }
}
