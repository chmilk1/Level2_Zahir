package Game;

import java.awt.Rectangle;
import java.awt.Graphics;

public class GameObject {
	protected boolean isAlive;
	
	private int x;
	private int y;
	private int width;
	private int height;
	protected int speed;
	protected boolean isColliding;
	public boolean cColl;
	
	protected boolean isSolidColliding1;
	protected boolean isSolidColliding2;
	protected boolean isSolidColliding3;
	protected boolean isSolidColliding4;
	protected boolean isSolidColliding5;
	protected boolean isSolidColliding6;
	protected boolean isSolidColliding7;
	protected boolean isSolidColliding8;
	
	
	
	protected Rectangle colBox;
	
	protected GameObject collisionObject;

	public int state;
	public int RState;
	public int direction;
	public int superstate;

	public GameObject(int x, int y, int w, int h){
		
		isAlive = true;
		isColliding = false;
		isSolidColliding1 = false;
		isSolidColliding2 = false;
		isSolidColliding3 = false;
		isSolidColliding4 = false;
		isSolidColliding5 = false;
		isSolidColliding6 = false;
		isSolidColliding7 = false;
		isSolidColliding8 = false;
		superstate = 1;
		
		this.setX(x);
		this.setY(y);
		this.setWidth(w);
		this.setHeight(h);
		
		speed = 0;

		colBox = new Rectangle(x, y, getWidth(), getHeight());
	}
	
	public GameObject getCollisionObject() {
		return collisionObject;
	}

	public void setCollisionObject(GameObject collisionObject) {
		this.collisionObject = collisionObject;
	}
	
	public boolean isColliding() {
		return isColliding;
	}
	
	
	
	public boolean isSolidColliding1() {
		return isSolidColliding1;
	}
	public boolean isSolidColliding2() {
		return isSolidColliding2;
	}
	public boolean isSolidColliding3() {
		return isSolidColliding3;
	}
	public boolean isSolidColliding4() {
		return isSolidColliding4;
	}
	public boolean isSolidColliding5() {
		return isSolidColliding5;
	}
	public boolean isSolidColliding6() {
		return isSolidColliding6;
	}
	public boolean isSolidColliding7() {
		return isSolidColliding7;
	}
	public boolean isSolidColliding8() {
		return isSolidColliding8;
	}
	
	

	public void setColliding(boolean isColliding) {
		this.isColliding = isColliding;
	}
	
	
	
	
	
	public void setSolidColliding1(boolean isSolidColliding1) {
		this.isSolidColliding1 = isSolidColliding1;
	}
	public void setSolidColliding2(boolean isSolidColliding2) {
		this.isSolidColliding2 = isSolidColliding2;
	}
	public void setSolidColliding3(boolean isSolidColliding3) {
		this.isSolidColliding3 = isSolidColliding3;
	}
	public void setSolidColliding4(boolean isSolidColliding4) {
		this.isSolidColliding4 = isSolidColliding4;
	}
	public void setSolidColliding5(boolean isSolidColliding5) {
		this.isSolidColliding5 = isSolidColliding5;
	}
	public void setSolidColliding6(boolean isSolidColliding6) {
		this.isSolidColliding6 = isSolidColliding6;
	}
	public void setSolidColliding7(boolean isSolidColliding7) {
		this.isSolidColliding7 = isSolidColliding7;
	}
	public void setSolidColliding8(boolean isSolidColliding8) {
		this.isSolidColliding8 = isSolidColliding8;
	}
	
	
	
	

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Rectangle getColBox() {
		return colBox;
	}

	public void setColBox(Rectangle colBox) {
		this.colBox = colBox;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(Graphics g){
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(){
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
}