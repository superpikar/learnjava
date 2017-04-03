package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * taken from here https://zeroturnaround.com/rebellabs/why-your-next-cloud-app-will-probably-suck-without-unit-testing/
 */
public class BasketWeightCalculatorTest {

	@Test
	public void whenAddOneItem() {
		BasketWeightCalculator bwc = new BasketWeightCalculator();
		bwc.addItem(10);
		assertEquals("expected 10", 10, bwc.getTotalWeight());
	}
	
	@Test
	public void whenAddTwoItem() {
		BasketWeightCalculator bwc = new BasketWeightCalculator();
		bwc.addItem(10);
		bwc.addItem(5);
		assertEquals("expected 15", 15, bwc.getTotalWeight());
	} 
	
	@Test
	public void whenAddNegativeNumberThenBasketTotalWeightSetToZero() {
		BasketWeightCalculator bwc = new BasketWeightCalculator();
		bwc.addItem(-12);
		assertEquals("expected 0", 0, bwc.getTotalWeight());
	}
	
	@Test
	public void whenAddNegativeNumberThenBasketTotalWeightSetToZero2() {
		BasketWeightCalculator bwc = new BasketWeightCalculator();
		bwc.addItem2(-12);
		assertEquals("expected 0", 0, bwc.getTotalWeight());
	}
}
