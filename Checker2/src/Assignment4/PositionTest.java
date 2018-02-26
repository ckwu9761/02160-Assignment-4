package Assignment4;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PositionTest {

	public int x, y, newX, newY, turn;
	public boolean end;
	
	// isOnBoard
	@Test
	public void isOnBoard1() {
		x = 1;
		y = 2;
		// newX = 1;
		// newY = 1;
		Position currentPosition = new Position(x, y);
		// Position newPosition = new Position(newX,newY);
		assertTrue("It is not on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard2() {
		x = -1;
		y = 1;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard3() {
		x = 1;
		y = -1;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard4() {
		x = 1;
		y = 99;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard5() {
		x = 99;
		y = 1;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard6() {
		x = 99;
		y = 99;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard7() {
		x = -1;
		y = -1;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}

	@Test
	public void isOnBoard8() {
		x = -1;
		y = 99;
		Position currentPosition = new Position(x, y);
		assertFalse("It is on board.", currentPosition.isOnBoard());
	}
	

	@Test
	public void returnxy() {
		x = 1;
		y = 2;
		Position currentPosition = new Position(x, y);
		assertEquals(1, currentPosition.x());
		assertEquals(2, currentPosition.y());

	}
}
