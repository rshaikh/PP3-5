package com.ee.trainsignaling;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ee.trainsignaling.Train;

public class TrainSpecs {

	@Test
	public void itShouldMoveTrain() {
		Block blockOne = new Block("green");
		Block blockTwo = new Block("green");
		Train train = new Train(blockOne);
		train.move(blockTwo);
		assertEquals(blockTwo, train.getCurrentBlock());
	}
	
	@Test
	public void itShouldTurnLightToRedWhenTrainMoves() {
		Block blockOne = new Block("green");
		Block blockTwo = new Block("green");
		Train train = new Train(blockOne);
		train.move(blockTwo);
		assertEquals("red", blockOne.getSignal());
	}
	
	@Test
	public void trainShouldNotMoveWhenSignalIsRed() {
		Block blockOne = new Block("green");
		Block blockTwo = new Block("red");
		Train train = new Train(blockOne);
		train.move(blockTwo);
		assertEquals(blockOne, train.getCurrentBlock());
	}
	
	@Test
	public void trainShouldTurnSignalRedToYellowOfPreviousBlock() {
		Block blockOne = new Block("green");
		Block blockTwo = new Block("green");
		Block blockThree = new Block("green");
		Train train = new Train(blockOne);
		train.move(blockTwo);
		train.move(blockThree);
		assertEquals("yellow", blockOne.getSignal());
		assertEquals("red", blockTwo.getSignal());
	}

}
