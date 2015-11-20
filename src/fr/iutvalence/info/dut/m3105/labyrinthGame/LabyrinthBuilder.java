package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class LabyrinthBuilder
{
	private int width;
	private int height;
	private Position exitPosition;
	private Position forbiddenCellsPosition;

	public int setWidth(int width)
	{
		return width;
	};
	
	public int setHeight(int height)
	{
		return height;
	};
	
	public Position setExitPosition(Position exitPosition)
	{
		return exitPosition;
	};
	
	public Position addForbiddenCellsPosition(Position forbiddenCellsPotition)
	{
		return forbiddenCellsPotition;
	};

	public LabyrinthBuilder(int width, int height, Position exitPosition, Position forbiddenCellsPosition){
		width = this.width;
		height = this.height;
		exitPosition = this.exitPosition;
		forbiddenCellsPosition = this.forbiddenCellsPosition;
	}
	
}
