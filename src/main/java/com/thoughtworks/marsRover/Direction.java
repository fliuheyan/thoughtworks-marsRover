package com.thoughtworks.marsRover;

public enum Direction {
	S(0, -1), E(1, 0), N(0, 1), W(-1, 0);
	private int x;
	private int y;

	Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Direction next() {
		Direction[] directions = Direction.values();
		int length = directions.length;
		int currentIndex = this.ordinal();
		return directions[(currentIndex + 1) % length];
	}

	public Direction prev() {
		Direction[] directions = Direction.values();
		int length = directions.length;
		int currentIndex = this.ordinal();
		return currentIndex == 0 ? directions[length - 1]
				: directions[currentIndex - 1];
	}
}
