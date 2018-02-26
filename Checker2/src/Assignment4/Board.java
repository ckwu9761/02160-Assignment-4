package Assignment4;

class Board {
	public static int length = 8;// vertical
	public static int width = 20;// horizontal
	public static char[][] board = new char[length][width]; // 12x20, 2D-array

	public static void printInitialBoard() {

		System.out.println("***Enter '9' to end the game anytime");
		System.out.println("   0 1 2 3 4 5 6 7   <-X axis");
		System.out.println("  +----------------+");

		// Loop 2D- array
		for (int row = 0; row < length; row++) {
			System.out.print(row + " |");
			for (int col = 3; col < width - 1; col++) {
				board[row][col] = 0;
				// Player 1
				if (row == 0 && col % 4 == 1) {
					board[row][col] = 1;
				}
				if (row == 1 && (2 + col) % 4 == 1) {
					board[row][col] = 1;
				}
				if (row == 2 && col % 4 == 1) {
					board[row][col] = 1;
				}
				// Player 2
				if (row == 5 && (2 + col) % 4 == 1) {
					board[row][col] = 2;
				}
				if (row == 6 && col % 4 == 1) {
					board[row][col] = 2;
				}
				if (row == 7 && (2 + col) % 4 == 1) {
					board[row][col] = 2;
				}
				// Printing 1 & 2
				if (board[row][col] == 0) {
					System.out.print(" ");
				}
				if (board[row][col] == 1) {
					System.out.print("1");
				}
				if (board[row][col] == 2) {
					System.out.print("2");
				}
			}
			System.out.println("|  ");
		}
		// Tail
		System.out.println("  +----------------+");
		System.out.println("   0 1 2 3 4 5 6 7  ");
	}

	public static void printboard() {

		System.out.println("***Enter '9' to end the game anytime");
		System.out.println("   0 1 2 3 4 5 6 7   <-X axis");
		System.out.println("  +----------------+");

		// Loop 2D- array
		for (int row = 0; row < length; row++) {
			System.out.print(row + " |");
			for (int col = 3; col < width - 1; col++) {
				// Printing
				if (board[row][col] == 0) {
					System.out.print(" ");
				}
				if (board[row][col] == 1) {
					System.out.print("1");
				}
				if (board[row][col] == 2) {
					System.out.print("2");
				}
			}
			System.out.println("|  ");
		}
		// Tail
		System.out.println("  +----------------+");
		System.out.println("   0 1 2 3 4 5 6 7  ");
	}
}