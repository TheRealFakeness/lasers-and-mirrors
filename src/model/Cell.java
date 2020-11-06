package model;

public class Cell {
	private char mirror;
	
	private Cell up;
	private Cell left;
	private Cell right;
	private Cell down;
	
	private final static int UP = 1;
	private final static int RIGHT = 1;
	private final static int DOWN = 1;
	private final static int LEFT = 1;
	
	public Cell(Cell up, Cell left, Cell right, Cell down) {
		this.up = up;
		this.left = left;
		this.right = right;
		this.down = down;
		mirror = " ";
	}
	
	public void redirect(int direction) {
		int nextDirection = 0;
		
		switch(mirror) {
		case ' ':
			switch(direction) {
			case UP:
				nextDirection = UP;
				break;
				
			case RIGHT:
				nextDirection = RIGHT;
				break;
				
			case DOWN:
				nextDirection = DOWN;
				break;
				
			case LEFT:
				nextDirection = LEFT;
				break;
			}
			break;
			
		case '/':
			switch(direction) {
			case UP:
				nextDirection = UP;
				break;
				
			case RIGHT:
				nextDirection = RIGHT;
				break;
				
			case DOWN:
				nextDirection = DOWN;
				break;
				
			case LEFT:
				nextDirection = LEFT;
				break;
			}
			break;
		}
	}
	
	public String toString() {
		return "[" + mirror + "]";
	}
}