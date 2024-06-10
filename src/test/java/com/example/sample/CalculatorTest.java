package com.example.sample;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void 뺄셈_연산을_할_수_있다() {
        // given
        long num1 = 5;
        String operator = "-";
        long num2 = 3;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 니늣셈_연산을_할_수_있다() {
        // given
        long num1 = 10;
        String operator = "/";
        long num2 = 5;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 2;
        String operator = "@";
        long num2 = 3;
        Calculator calculator = new Calculator();
        // when
        // then
        assertThrows(InvalidOperatorException.class, ()-> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
