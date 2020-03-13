import org.junit.Assert;
import org.junit.Test;
public class EstimationTest {

	@Test
	public void test() {
		Assert.assertEquals(12000.000000,EstimationCalculation.estimator("standard",10.0,false),0);
		Assert.assertEquals(45000.000000,EstimationCalculation.estimator("above standard",30.0,false),0);
		Assert.assertEquals(72000.000000,EstimationCalculation.estimator("high standard",40.0,false),0);
		Assert.assertEquals(50000.000000,EstimationCalculation.estimator("high standard",20.0,true),0);

		}

}