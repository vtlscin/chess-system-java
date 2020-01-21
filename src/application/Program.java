package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		//git remote add origin
		//git pull origin master

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
