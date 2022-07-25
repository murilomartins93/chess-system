package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Por padr�o j� � nulo
	}

	protected Board getBoard() {
		return board;
	}
	
}