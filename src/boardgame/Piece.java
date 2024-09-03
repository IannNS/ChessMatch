package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//Não é necessário, ele já inicia vazio. Coloquei pra eu não esquecer depois
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
}
