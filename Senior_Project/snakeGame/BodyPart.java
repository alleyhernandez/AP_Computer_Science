  
// THESE ARE THE LIBRARIES THAT THIS CLASS USES

// THIS ALLOWS OUR PROGRAM TO USE COLOR
import java.awt.Color;
// THIS ALLOWS OUR PROGRAM TO USE GRAPHICS
import java.awt.Graphics;
// THIS CLASS MAKES OUR SNAKE'S BODY
public class BodyPart 
{
	private int xCoordinate, yCoordinate, width, height;
	
	public BodyPart(int xCoordinate, int yCoordinate,int tileSize)
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		width = tileSize;
		height = tileSize;
	}
	// THIS IS THE GETTER FOR OUR xCoordinate
	public int getxCoordinate() 
	{
		return xCoordinate;
	}
	//THIS IS THE SETTER THE xCoordinate
	public void setxCoordinate(int xCoordinate) 
	{
		this.xCoordinate = xCoordinate;
	}
	//THIS IS THE GETTER FOR OUR yCOordinate
	public int getyCoordinate() 
	{
		return yCoordinate;
	}
	// THIS IS THE SETTER FOR OUR Y COORDINATE
	public void setyCoordinate(int yCoordinate) 
	{
		this.yCoordinate = yCoordinate;
	}
	// THIS IS THE TIMER FOR OUR SNAKE. THIS ALLOWS IT TO CHANGE SIZES EVERY FEW SECONDS
	public void tick()
	{
		
	}
	// THIS SETS THE BODY COLOR OF THE SNAKE AND ALLOWS THE SNAKE TO USE GRAPHICS
	public void draw(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillRect(xCoordinate * width, yCoordinate * height, width, height);
	}
}
