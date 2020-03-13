import org.junit.Assert;
import org.junit.Test;

public class InterestCalculationTest {

	@Test
	public void test() {
		Assert.assertEquals(3600.000000000000, InterestCalculation.simpleIntrest(20000, 2, 9.0),0);
		Assert.assertEquals(56702.400462486534, InterestCalculation.compoundInterest(20000, 8, .17, 12),0);
		

	}

}