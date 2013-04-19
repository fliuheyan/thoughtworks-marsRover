package com.thoughtworks.marsRoverTest;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.marsRover.Direction;
import com.thoughtworks.marsRover.MarsRover;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MarsRoverTest {
	private MarsRover marsRover;
	private MarsRover marsRover2;

	@Before
	public void init() {
		marsRover = new MarsRover("1 2 N", " ");
		marsRover2 = new MarsRover("3 3 E", " ");
	}

	@Test
	public void test1_2_N() {
		marsRover.print();
	}

	@Test
	public void testDirection() {
		Direction dire = Direction.N;
		dire = dire.prev().prev().prev();
		System.out.println(dire);
	}

	@Test
	public void test1_2_N_LMLMLMLMM() {
		marsRover.turnLeft();
		marsRover.move();
		marsRover.turnLeft();
		marsRover.move();
		marsRover.turnLeft();
		marsRover.move();
		marsRover.turnLeft();
		marsRover.move();
		marsRover.move();
		assertThat(marsRover.getFormatString(), is("1 3 N"));
	}

	@Test
	public void test3_3_E_MMRMMRMRRM() {
		marsRover2.move();
		marsRover2.move();
		marsRover2.turnRight();
		assertThat(marsRover2.getFormatString(),is("5 3 S"));
		marsRover2.move();
		marsRover2.move();
		marsRover2.turnRight();
		assertThat(marsRover2.getFormatString(),is("5 1 W"));
		marsRover2.move();
		marsRover2.turnRight();
		marsRover2.turnRight();
		marsRover2.move();
		assertThat(marsRover2.getFormatString(),is("5 1 E"));
	}
}
