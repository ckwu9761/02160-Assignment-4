package Assignment4;

abstract class AbstractPiece extends Board {

	public static int checkTurn() {

		int turn = 0;

		if (Player.turn % 2 == 1) {
			turn = 1;
			System.out.println("Turn of player no. " + turn);
			System.out.println("Coordinate of piece to move");
		}
		if (Player.turn % 2 == 0) {
			turn = 2;
			System.out.println("Turn of player no. " + turn);
			System.out.println("Coordinate of piece to move");
		}
		return turn;
	}

	public static boolean checkPieceOwner(Position currentPosition) {

		int x = currentPosition.x();
		int y = currentPosition.y();

		if (x < 0 || x > 7 || y < 0 || y > 7) {
			System.out.println("Input out of range! Please enter 0-7.");
			return false;

		}
		if (Player.turn % 2 == 1) {
			if (board[y][2 * x + 3] == 1) {
				return true;
			} else {
				System.out.println("Move your own piece!");
			}

		}

		if (Player.turn % 2 == 0) {
			if (board[y][2 * x + 3] == 2) {
				return true;
			} else {
				System.out.println("Move your own piece!");
			}

		}
		return false;// will not return false
	}

	public static boolean isValidPosition(Position newPosition, Position currentPosition) {
		int x = currentPosition.x();
		int y = currentPosition.y();
		int newX = newPosition.x();
		int newY = newPosition.y();

		if (newX < 0 || newY > 7 || newY < 0 || newY > 7) {
			System.out.println("Input out of range! Please enter 0-7.");
			return false;
		}
		if (Player.turn % 2 == 1) {
			if (newPosition.isOnBoard()) {

				if (Board.board[newY][2 * newX + 3] == 0 && (newY == y + 1 && (newX == x + 1 || newX == x - 1))) {
					return true;
				} else { // wrong position
					System.out.println("Something goes wrong!! Please try again.");
					return false;
				}
			}

		}

		if (Player.turn % 2 == 0) {
			if (newPosition.isOnBoard()) {

				if (Board.board[newY][2 * newX + 3] == 0 && (newY == y - 1 && (newX == x + 1 || newX == x - 1))) {
					return true;
				} else { // wrong position
					System.out.println("Something goes wrong!! Please try again.");
					return false;
				}
			}
		}
		return false;

	}

	public static boolean move(Position newPosition, Position currentPosition) {
		int x = currentPosition.x();
		int y = currentPosition.y();
		int newX = newPosition.x();
		int newY = newPosition.y();

		if (isValidPosition(newPosition, currentPosition)) {
			if (Player.turn % 2 == 1) {
				board[y][2 * x + 3] = 0;
				board[newY][2 * newX + 3] = 1;
			}
			if (Player.turn % 2 == 0) {
				board[y][2 * x + 3] = 0;
				board[newY][2 * newX + 3] = 2;
			}
			System.out.println("Piece moved!");
			return true;

		} else {
			return false;
		}
	}
}
