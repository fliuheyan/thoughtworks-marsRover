package com.thoughtworks.marsRover;

public class MarsRover {
	private int x;
	private int y;
	private Direction direction;

	public MarsRover() {

	}

	public MarsRover(int x, int y, Direction direction) {
		this.setX(x);
		this.setY(y);
		this.setDirection(direction);
	}

	public MarsRover(String input, String regex) {
		String[] strs = input.split("\\" + regex);
		this.setX(Integer.parseInt(strs[0]));
		this.setY(Integer.parseInt(strs[1]));
		this.setDirection(Direction.valueOf(strs[2]));
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

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void print() {
		System.out.println(String.format("%s %s %s", x, y, direction));
	}

	public String getFormatString() {
		return x + " " + y + " " + direction;
	}

	public void turnLeft() {
		direction = direction.next();		
	}

	public void move() {
		x += direction.getX();
		y += direction.getY();
	}

	public void turnRight() {
		direction = direction.prev();
		// TODO Auto-generated method stub
		
	}
}
