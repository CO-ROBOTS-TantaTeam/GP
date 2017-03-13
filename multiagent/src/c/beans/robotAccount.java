package c.beans;

public class robotAccount {
	
	private int rID;
	private boolean robotAvailability;
	private float xLocation;
	private float yLocation;
	private float maxLoad;
	
	
	public int getrID() {
		return rID;
	}
	public void setrID(int rID) {
		this.rID = rID;
	}
	
	public boolean getRoborAvilability(){
		return robotAvailability;
	}
	public void setRoborAvilability(boolean robotAvailability){
		this.robotAvailability = robotAvailability;
	}
	
	
	public float getXLocation(){
		return xLocation;
	}
	public void setXLocation(float xLocation){
		this.xLocation =xLocation;
	}
	
	
	public float getYLocation(){
		return yLocation;
	}
	public void setYLocation(float yLocation){
		this.yLocation  = yLocation;
	}
	
	
	public float getMaxLoad(){
		return maxLoad;
	}
	public void setMaxLoad(float maxLoad){
		this.maxLoad =maxLoad;
	}

}
