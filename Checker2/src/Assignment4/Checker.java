package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Checker {

	public static boolean end;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		Board.printInitialBoard();

		Loop: while (end == false) {

			AbstractPiece.checkTurn();

			int x = 0;
			int y = 0;
			int newX = 0;
			int newY = 0;

			boolean success1 = false;
			boolean success2 = false;

			while (!success1) {
				try {
					System.out.print("Enter X: ");
					x = reader.nextInt();
					System.out.print("Enter Y: ");
					y = reader.nextInt();
					success1 = true;
				} catch (InputMismatchException e1) {
					System.out.println("Wrong input type! Please enter 0-7.");
					reader.next();
					success1 = false;
				}

				// End game
				if ((x == 9) || (y == 9)) {
					System.out.println("The game is ended. Thank you for playing!");
					end = true;
					System.exit(0);
				}

				Position currentPosition = new Position(x, y);

				if (AbstractPiece.checkPieceOwner(currentPosition) == false) {
					continue Loop;
				}

				System.out.println("Coordinate of new position");

				while (!success2) {
					try {
						System.out.print("Enter X: ");
						newX = reader.nextInt();
						System.out.print("Enter Y: ");
						newY = reader.nextInt();
						success2 = true;
					} catch (InputMismatchException e1) {
						System.out.println("Wrong input type! Please enter 0-7.");
						reader.next();
						success2 = false;
					}

					Position newPosition = new Position(newX, newY);

					if (AbstractPiece.move(newPosition, currentPosition) == false) {
						continue Loop;
					}
					Board.printboard();
					Player.turn = Player.turn + 1;

				}
			}

		}

	}
}
