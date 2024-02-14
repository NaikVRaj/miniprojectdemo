package com.example.spe_task;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeTaskApplicationTests {

		@Test
		public void testPerformAddition() {
			double result = calculator.performAddition(3, 4);
			assertEquals(7, result, 0.0001, "Testing addition of two numbers");
		}

		@Test
		public void testPerformSubtraction() {
			double result = calculator.performSubtraction(8, 5);
			assertEquals(3, result, 0.0001, "Testing subtraction of two numbers");
		}

		@Test
		public void testPerformMultiplication() {
			double result = calculator.performMultiplication(2, 6);
			assertEquals(12, result, 0.0001, "Testing multiplication of two numbers");
		}

		@Test
		public void testPerformDivision() {
			double result = calculator.performDivision(9, 3);
			assertEquals(3, result, 0.0001, "Testing division of two numbers");
		}

		@Test
		public void testPerformDivisionByZero() {
			assertThrows(ArithmeticException.class, () -> calculator.performDivision(9, 0), "Testing divide by zero exception");
		}

		@Test
		public void testPerformSine() {
			double result = calculator.performSine(Math.PI / 2);
			assertEquals(1, result, 0.0001, "Testing sine function");
		}

		@Test
		public void testPerformCosine() {
			double result = calculator.performCosine(0);
			assertEquals(1, result, 0.0001, "Testing cosine function");
		}

		@Test
		public void testPerformTangent() {
			double result = calculator.performTangent(0);
			assertEquals(0, result, 0.0001, "Testing tangent function");
		}

		@Test
		public void testPerformPower() {
			double result = calculator.performPower(2, 3);
			assertEquals(8, result, 0.0001, "Testing power function");
		}



		@Test
		public void testPerformSquareRoot() {
			double result = calculator.performSquareRoot(25);
			assertEquals(5, result, 0.0001, "Testing square root function");
		}

		@Test
		public void testPerformFactorial() {
			double result = calculator.performFactorial(5);
			assertEquals(120, result, "Testing factorial function");
		}

		@Test
		public void testPerformFactorialZero() {
			double result = calculator.performFactorial(0);
			assertEquals(1, result, "Testing factorial of 0");
		}

		@Test
		public void testPerformFactorialOne() {
			double result = calculator.performFactorial(1);
			assertEquals(1, result, "Testing factorial of 1");
		}
	}

