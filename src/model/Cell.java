package model;

public class Cell {
	private String shotDirection;
	
	private Cell up;
	private Cell left;
	private Cell right;
	private Cell down;
	
	public Cell(Cell up, Cell left, Cell right, Cell down) {
		this.up = up;
		this.left = left;
		this.right = right;
		this.down = down;
	}
}