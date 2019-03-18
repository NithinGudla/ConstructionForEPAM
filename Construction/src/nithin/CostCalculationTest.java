package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostCalculationTest {

	@Test
	void test() {
		Construction construction = new Construction();
		double output = construction.calculateCost(3, 20, true);
		assertEquals(50000, output);
	}

}
