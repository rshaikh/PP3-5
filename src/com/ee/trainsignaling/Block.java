package com.ee.trainsignaling;

public class Block {

	private String signal;

	public Block(String signal) {
		this.signal = signal;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignalStatusOfCurrentBlockAsTrainIsMoving() {
		this.signal = "red";
	}

	public boolean canMove() {
		return !"red".equals(signal);
	}

	public void setSignalStatusOfPreviousBlock() {
		this.signal = "yellow";
	}

}
