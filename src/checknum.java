import static org.junit.Assert.*;

import org.junit.Test;

public class checknum {

	@Test
	public void test() {
		//fail("Not yet implemented");
		mainclass h= new mainclass();
		int result=h.addnumbers(9, 10);
		assertEquals(19,result);
	}

}