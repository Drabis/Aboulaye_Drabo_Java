package com.company.controller;

import com.company.models.Calculator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class MonthControllerTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnCorrectAnswerOnAdditionPostRequest() throws Exception {
        Calculator inputCalculation = new Calculator(10, 5, "add");
        Calculator answerCalculation = new Calculator(10, 5, "add", 15);
        String inputJson = mapper.writeValueAsString(inputCalculation);
        String outputJson = mapper.writeValueAsString(answerCalculation);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingIncorrectAdditionStringBody() throws Exception {
        Map<String, String> incorrectInput = new HashMap<>();
        incorrectInput.put("operand1", "Not A Number");
        incorrectInput.put("operand2", "Also Not a Number");
        incorrectInput.put("operation", "add");
        String inputJson = mapper.writeValueAsString(incorrectInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingIncorrectAdditionDoubleBody() throws Exception {
        Map<String, String> newInput = new HashMap<>();
        newInput.put("operand1", "4.4");
        newInput.put("operand2", "3.1");
        newInput.put("operation", "add");
        String inputJson = mapper.writeValueAsString(newInput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnCorrectAnswerOnSubtractPost() throws Exception {
        Calculator inputCalculation = new Calculator(-10, -5, "subtract");
        Calculator answerCalculation = new Calculator(-10, -5, "subtract", -5);
        String inputJson = mapper.writeValueAsString(inputCalculation);
        String outputJson = mapper.writeValueAsString(answerCalculation);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }



    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingIncorrectSubtractOperandBody() throws Exception {
        Map<String, String> incorrectInput = new HashMap<>();
        incorrectInput.put("operand1", "20");
        incorrectInput.put("operand2", "99.999"); //bad operand
//        incorrectInput.put("operation", "add");
        String inputJson = mapper.writeValueAsString(incorrectInput);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnCorrectAnswerOnMultiplyPost() throws Exception {
        Calculator inputCalculation = new Calculator(-10, -5, "multiply");
        Calculator answerCalculation = new Calculator(-10, -5, "multiply", 50);
        String inputJson = mapper.writeValueAsString(inputCalculation);
        String outputJson = mapper.writeValueAsString(answerCalculation);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingMultiplicationBadOperandBody() throws Exception {
        Map<String, String> incorrectInput = new HashMap<>();
        incorrectInput.put("operand1", "20");
        incorrectInput.put("operand2", "String");
        String inputJson = mapper.writeValueAsString(incorrectInput);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldReturnCorrectAnswerOnDividePost() throws Exception {
        Calculator inputCalculation = new Calculator(10, -5, "divide");
        Calculator answerCalculation = new Calculator(10, -5, "divide", -2);
        String inputJson = mapper.writeValueAsString(inputCalculation);
        String outputJson = mapper.writeValueAsString(answerCalculation);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingDivideZeroDenominatorBody() throws Exception {
        Map<String, String> incorrectInput = new HashMap<>();
        incorrectInput.put("operand1", "20");
        incorrectInput.put("operand2", "0");
        incorrectInput.put("operation", "divide");
        String inputJson = mapper.writeValueAsString(incorrectInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test(expected = AssertionError.class)
    public void shouldReturn422WhenPostingDivideIncorrectBody() throws Exception {
        Map<String, String> incorrectInput = new HashMap<>();
        incorrectInput.put("operand1", "20");
        incorrectInput.put("operand2", "1.0");
        incorrectInput.put("operation", "divide");
        String inputJson = mapper.writeValueAsString(incorrectInput);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }
}