package Assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	public int x, y, newX, newY, turn;
	public boolean end;
	
	@Test
	public void turnOfPlayer() {
		turn = 0;
		Player.turn = turn;
		assertEquals(0, Player.turn);
		// assertFalse("//", Player.turnOfPlayer());

		turn = 1;
		Player.turn = turn;
		assertEquals(1, Player.turn);
		turn = 2;
		Player.turn = turn;
		assertEquals(2, Player.turn);
		turn = 3;
		Player.turn = turn;
		assertEquals(3, Player.turnOfPlayer());
		turn = 4;
		Player.turn = turn;
		assertEquals(4, Player.turnOfPlayer());

		// turn = (Integer) null;
		// Player.turn = turn;
		// assertFalse("It is true", Player.turnOfPlayer());
	}


}
