package prime.test;

import org.junit.Test;

import com.services.PrimeService;
import org.junit.Assert;

public class TddPrimeTest {

	@Test
	public void primeTest() {
		Assert.assertTrue(PrimeService.isPrime(11));
	}
	
	@Test
	public void failedPrimeTest() {
		Assert.assertFalse(PrimeService.isPrime(4));
	}
}
