package test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.mygdx.game.MyGdxGame;

public class MyGdxGameTest {

	
	@Test
	public void test() {
		assertEquals(MyGdxGame.doNothing(), 100);
	}

}
