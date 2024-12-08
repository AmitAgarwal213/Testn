package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionmethod {
@Test
public void testcase1() {
	//Assert.assertEquals(false,true);
	//Assert.assertEquals("Google","Google");
	Assert.assertEquals("Amazon","Google","Sorry but the test cases is failed ");
	Assert.assertEquals(true,true,"Sorry but the test cases is failed");
	//Assert.assertTrue(false);
	
}
//@Test
//public void testcase2() {
//	Assert.assertTrue(true);
//}
}
