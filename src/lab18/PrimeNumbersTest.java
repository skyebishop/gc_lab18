package lab18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

	@Test
	void test1() {
		int result = PrimeNumbers.findPrime(3);
		assertEquals(5,result);
	}
	@Test
	void test2() {
		int result = PrimeNumbers.findPrime(8);
		assertEquals(19,result);
	}
	@Test
	void test3() {
		int result = PrimeNumbers.findPrime(15);
		assertEquals(47,result);
	}
	@Test
	void test4() {
		int result = PrimeNumbers.findPrime(21);
		assertEquals(73,result);
	}
	@Test
	void test5() {
		int result = PrimeNumbers.findPrime(25);
		assertEquals(97,result);
	}
}
