package Chess;

public class PiecePosition {

	/**
	 * Esta función comprueba si la posicion a la que quieres mover está dentro del tablero
	 */
	public static boolean isAvailable(int column, int row) {
		return column >= 0 && column < 8 && row >= 0 && row < 8;
	}

	/**
	 * Esta función comprueba que a la posicion que quieres moverte es valida
	 */
	static boolean isAvailable(PiecePosition position, int columnIncrement, int rowIncrement) {
		if (position == null)
			return false;
		
		int newColumn = position.getColumn() + columnIncrement;
		int newRow = position.getRow() + rowIncrement;
		return isAvailable(newColumn, newRow);
	}

	/**
	 * Esta función comprueba si la posición es null y si no lo es se la pasa a la función que comprueba si esta dentro del tablero
	 */
	static boolean isAvailable(PiecePosition position) {
		if (position == null)
			return false;
		return isAvailable(position.getColumn(), position.getRow());
	}

	private int column, row;

	/**
	 * Asigna la fila y la columna
	 */
	public PiecePosition(int column, int row) {
		this.column = column;
		this.row = row;
	}
	
	/**
	 * Devuelve la columna
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * Devuelve la fila
	 */
	public int getRow() {
		return row;
	}
	
        /**
	 * Devuelve verdadero si la nueva posicion es valida y la actualiza
	 */
	public boolean setValues(int column, int row) {
		if (isAvailable(column, row)) {
			this.column = column;
			this.row = row;			
			return true;
		}
		return false;
	}
	
	/**
	 * Devuelve la nueva posicion de la pieza una vez desplazada
	 */
	public PiecePosition getDisplacedPiece(int columnCount, int rowCount) {		
		if (!isAvailable(this, columnCount, rowCount))
			return null;
		int newColumn = getColumn() + columnCount;
		int newRow = getRow() + rowCount;
		return new PiecePosition(newColumn, newRow);
	}
	
	/**
	 * Hace un copia de la pieza
	 */
	public PiecePosition clone() {
		return new PiecePosition(column, row);
	}
	
	/**
	 * Comprueba si la posicion actual y la posicion que se le pasa por parametros son iguales
	 */
	public boolean equals(PiecePosition aPosition) {
		return aPosition.getColumn() == getColumn() && aPosition.getRow() == getRow();
	}
}
