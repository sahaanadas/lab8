import static org.junit.Assert.*;

import org.junit.Test;

public class checkstring {

	@Test
	public void test() {
		//fail("Not yet implemented");
		mainclass h= new mainclass();
		String result=h.addstrings("hello","world");
		assertEquals("helloworld",result);
	}

}