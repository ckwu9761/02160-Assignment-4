package Assignment4;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AbstractPieceTest {
	
	public int x, y, newX, newY, turn;
	public boolean end;


	// Turn of PLayer 1
		@Test
		public void Turn1Piece1() {
			Board.printInitialBoard();
			turn = 1;
			Player.turn = turn;
			x = 3;
			y = 2;
			newX = 2;
			newY = 3;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(1, AbstractPiece.checkTurn());
			assertTrue("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertTrue("It is not a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertTrue("It is not a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

		@Test
		public void Turn1Piece2() {
			Board.printInitialBoard();
			turn = 1;
			Player.turn = turn;
			x = -1;
			y = 1;
			newX = -1;
			newY = 1;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(1, AbstractPiece.checkTurn());
			assertFalse("It is owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();
		}

		@Test
		public void Turn1Piece3() {
			Board.printInitialBoard();
			turn = 1;
			Player.turn = turn;
			x = 99;
			y = 1;
			newX = 99;
			newY = 1;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(1, AbstractPiece.checkTurn());
			assertFalse("It is owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();
		}

		@Test
		public void Turn1Piece4() {
			Board.printInitialBoard();
			turn = 1;
			Player.turn = turn;
			x = -1;
			y = 1;
			newX = 2;
			newY = 3;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(1, AbstractPiece.checkTurn());
			assertFalse("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

		@Test
		public void Turn1Piece5() {
			Board.printInitialBoard();
			turn = 1;
			Player.turn = turn;
			x = 2;
			y = 5;
			newX = 2;
			newY = 3;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(1, AbstractPiece.checkTurn());
			assertFalse("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

		// Turn of PLayer 2
		@Test
		public void Turn2Piece1() {
			Board.printInitialBoard();
			turn = 2;
			Player.turn = turn;
			x = 2;
			y = 5;
			newX = 1;
			newY = 4;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(2, AbstractPiece.checkTurn());
			assertTrue("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertTrue("It is not a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertTrue("It is not a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

		@Test
		public void Turn2Piece2() {
			Board.printInitialBoard();
			turn = 2;
			Player.turn = turn;
			x = -1;
			y = 1;
			newX = -1;
			newY = 1;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(2, AbstractPiece.checkTurn());
			assertFalse("It is owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();
		}

		@Test
		public void Turn2Piece3() {
			Board.printInitialBoard();
			turn = 2;
			Player.turn = turn;
			x = 99;
			y = 1;
			newX = 99;
			newY = 1;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(2, AbstractPiece.checkTurn());
			assertFalse("It is owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();
		}

		@Test
		public void Turn2Piece4() {
			Board.printInitialBoard();
			turn = 2;
			Player.turn = turn;
			x = -1;
			y = 1;
			newX = 1;
			newY = 4;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(2, AbstractPiece.checkTurn());
			assertFalse("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

		@Test
		public void Turn2Piece5() {
			Board.printInitialBoard();
			turn = 2;
			Player.turn = turn;
			x = 3;
			y = 2;
			newX = 1;
			newY = 4;
			Position currentPosition = new Position(x, y);
			Position newPosition = new Position(newX, newY);
			assertEquals(2, AbstractPiece.checkTurn());
			assertFalse("It is not owned by player 1.", AbstractPiece.checkPieceOwner(currentPosition));
			assertFalse("It is a valid positon.", AbstractPiece.isValidPosition(newPosition, currentPosition));
			assertFalse("It is a valid move.", AbstractPiece.move(newPosition, currentPosition));
			Board.printboard();

		}

	}

