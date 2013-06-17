package com.ee.trainsignaling;


public class Train {

	private Block currentBlock;
	private Block previousBlock;

	public Train(Block block) {
		currentBlock = block;
	}

	public void move(Block block) {
		if(block.canMove()){
			currentBlock.setSignalStatusOfCurrentBlockAsTrainIsMoving();
			if(previousBlock != null){
				previousBlock.setSignalStatusOfPreviousBlock();
			}
			previousBlock = currentBlock; 
			currentBlock = block;
		}
	}

	public Block getCurrentBlock() {
		return currentBlock;
	}
}