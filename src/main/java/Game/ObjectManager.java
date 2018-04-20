package Game;


import Game.tiles.*;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<GameObject> objects;
	public boolean cb = false;
	public boolean cbp = false;
	
	Random ra = new Random();
	int r1;
	int r2;
	int r3;
	int r4;
	int r5;
	int r6;
	int r7;
	int r8;
	int r;


	public ObjectManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}
		
		purgeObjects();	
	}
 
	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}



	public void checkCollision(Player p, int tw) {
		for (int i = 0; i < objects.size(); i++) {
			for (int j = i + 1; j < objects.size(); j++) {
				
				GameObject o1 = objects.get(i);
				GameObject o2 = objects.get(j);
				
				
				if(o1 instanceof SolidTile && o2 instanceof Rook)
				{
					//tile 2
					if(o2.getX() == o1.getX() && o2.getY() - tw == o1.getY())
					{
						o2.setSolidColliding2(true);
					}
					//tile 4
					if(o2.getX() + tw == o1.getX() && o2.getY() == o1.getY())
					{
						o2.setSolidColliding4(true);
					}
					//tile 6
					if(o2.getX() == o1.getX() && o2.getY() + tw == o1.getY())
					{
						o2.setSolidColliding6(true);
					}
					//tile 8
					if(o2.getX() - tw == o1.getX() && o2.getY() == o1.getY())
					{
						o2.setSolidColliding8(true);
					}
				}
				if(o2 instanceof Pawn && (o1 instanceof SolidTile || o1 instanceof Pawn))
				{
					//tile 1
					if(o2.getX() - tw == o1.getX() && o2.getY() - tw == o1.getY())
					{
						o2.setSolidColliding1(true);
					}
					//tile 2
					if(o2.getX() == o1.getX() && o2.getY() - tw == o1.getY())
					{
						o2.setSolidColliding2(true);
					}
					//tile 3
					if(o2.getX() + tw == o1.getX() && o2.getY() - tw == o1.getY())
					{
						o2.setSolidColliding3(true);
					}
					//tile 4
					if(o2.getX() + tw == o1.getX() && o2.getY() == o1.getY())
					{
						o2.setSolidColliding4(true);
					}
					//tile 5
					if(o2.getX() + tw == o1.getX() && o2.getY() + tw == o1.getY())
					{
						o2.setSolidColliding5(true);
					}
					//tile 6
					if(o2.getX() == o1.getX() && o2.getY() + tw == o1.getY())
					{
						o2.setSolidColliding6(true);
					}
					
					//tile 7
					if(o2.getX() - tw == o1.getX() && o2.getY() + tw == o1.getY())
					{
						o2.setSolidColliding7(true);
					}
					
					//tile 8
					if(o2.getX() - tw == o1.getX() && o2.getY() == o1.getY())
					{
						o2.setSolidColliding8(true);
					}
					
				}
				
				if(o1.colBox.intersects(o2.colBox)){
					
					o1.setColliding(true);
					o1.setCollisionObject(o2);
					
					o2.setColliding(true);
					o2.setCollisionObject(o1);
					
					
					if(o1 instanceof Pawn && o2 instanceof Pawn)
					{
						r = ra.nextInt(7);
						if(r == 0)
						{
							if(o2.isSolidColliding1)
							{
								if(o2.isSolidColliding2 && !o2.isSolidColliding8)
								{
									o2.setX(o2.getX() - tw);
								}
								else if(o2.isSolidColliding8 && !o2.isSolidColliding2)
								{
									o2.setY(o2.getY() - tw);
								}
								else if(o2.isSolidColliding8 && o2.isSolidColliding2)
								{
									
								}
								else
								{
									r1 = ra.nextInt(1);
									if(r1 == 0) {
                                        o2.setX(o2.getX() - tw);}
									if(r1 == 1) {
                                        o2.setY(o2.getY() - tw);}
								}
							}
							else
							{
							o2.setX(o2.getX() - tw);
							o2.setY(o2.getY() - tw);
							}
						}
						
						//tile 2
						else if(r == 1)
						{
							if(o2.isSolidColliding2 == true)
							{
								if(o2.isSolidColliding1 == true && o2.isSolidColliding3 == false)
								{
									o2.setX(o2.getX() + tw);
									o2.setY(o2.getY() - tw);
								}
								else if(o2.isSolidColliding3 == true && o2.isSolidColliding1 == false)
								{
									o2.setX(o2.getX() - tw);
									o2.setY(o2.getY() - tw);
								}
								else if(o2.isSolidColliding3 == true && o2.isSolidColliding1 == true)
								{
									
								}
								else
								{
									r2 = ra.nextInt(1);
									if(r2 == 0)
									{
									o2.setX(o2.getX() + tw);
									o2.setY(o2.getY() - tw);
									}
									if(r2 == 1)
									{
										o2.setX(o2.getX() - tw);
										o2.setY(o2.getY() - tw);
									}
								}
							}
							else
							{
							o2.setY(o2.getY() - tw);
							}
						}
						
						//tile 3
						else if(r == 2)
						{
							if(o2.isSolidColliding3 == true)
							{
								if(o2.isSolidColliding2 == true && o2.isSolidColliding4 == false)
								{
									o2.setX(o2.getX() + tw);
								}
								else if (o2.isSolidColliding4 == true && o2.isSolidColliding2 == false)
								{
									o2.setY(o2.getY() - tw);
								}
								else if (o2.isSolidColliding2 == true && o2.isSolidColliding4 == true)
								{
									
								}
								else
								{
									r3 = ra.nextInt(1);
									if(r3 == 0)
									{
										o2.setX(o2.getX() + tw);
									}
									if(r3 == 1)
									{
										o2.setY(o2.getY() - tw);
									}
								}
							}
							else
							{
							o2.setX(o2.getX() + tw);
							o2.setY(o2.getY() - tw);
							}
							
						}
						
						//tile 4
						else if(r == 3)
						{
							if(o2.isSolidColliding4 == true)
							{
								if(o2.isSolidColliding3 == true && o2.isSolidColliding5 == false)
								{
								o2.setX(o2.getX() + tw);
								o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding5 == true && o2.isSolidColliding3 == false)
								{
								o2.setX(o2.getX() + tw);
								o2.setY(o2.getY() - tw);
								}
								else if (o2.isSolidColliding3 == true && o2.isSolidColliding5 == true)
								{
									
								}
								else
								{
									r4 = ra.nextInt(1);
									if(r4 == 0)
									{
										o2.setX(o2.getX() + tw);
										o2.setY(o2.getY() + tw);
									}
									if(r4 == 1)
									{
										o2.setX(o2.getX() + tw);
										o2.setY(o2.getY() - tw);
									}
								}
								
								
							}
							else
							{	
								o2.setX(o2.getX() + tw);
							}
							
						}
						
						//tile 5
						else if(r == 4)
						{
							if(o2.isSolidColliding5 == true)
							{
								if(o2.isSolidColliding4 == true && o2.isSolidColliding6 == false)
								{
									o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding6 == true && o2.isSolidColliding4 == false)
								{
									o2.setX(o2.getX() + tw);
								}
								else if (o2.isSolidColliding4 == true && o2.isSolidColliding4 == true)
								{
									
								}
								else
								{
									r5 = ra.nextInt(1);
									if(r5 == 0)
									{
										o2.setX(o2.getX() + tw);
									}
									if(r5 == 1)
									{
										o2.setY(o2.getY() + tw);
									}
								}
							}
							else
							{
							o2.setX(o2.getX() + tw);
							o2.setY(o2.getY() + tw);
							}
						}
						
						//tile 6
						else if(r == 5)
						{
							if(o2.isSolidColliding6 == true)
							{
								if(o2.isSolidColliding5 == true && o2.isSolidColliding7 == false)
								{
									o2.setX(o2.getX() - tw);
									o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding7 == true && o2.isSolidColliding5 == false)
								{
									o2.setX(o2.getX() + tw);
									o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding7 == true && o2.isSolidColliding5 == true)
								{
									
								}
								else
								{
									r6 = ra.nextInt(1);
									if(r6 == 0)
									{
										o2.setX(o2.getX() - tw);
										o2.setY(o2.getY() + tw);
									}
									if(r6 == 1)
									{
										o2.setX(o2.getX() + tw);
										o2.setY(o2.getY() + tw);
									}
								}
							}
							else
							{
							o2.setY(o2.getY() + tw);
							}
						}
						
						//tile 7
						else if(r == 6)
						{
							if(o2.isSolidColliding7 == true)
							{
								if(o2.isSolidColliding6 == true && o2.isSolidColliding8 == false)
								{
									o2.setX(o2.getX() - tw);
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding6 == false)
								{
									o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding6 == true)
								{
									
								}
								else
								{
									r7 = ra.nextInt(1);
									if(r7 == 0)
									{
										o2.setX(o2.getX() - tw);
									}
									if(r7 == 1)
									{
										o2.setY(o2.getY() + tw);
									}
								}
							}
							else
							{
							o2.setX(o2.getX() - tw);
							o2.setY(o2.getY() + tw);
							}
						}
						
						//tile 8
						else if(r == 7)
						{
							if(o2.isSolidColliding8 == true)
							{
								if(o2.isSolidColliding7 == true && o2.isSolidColliding1 == false)
								{
									o2.setX(o2.getX() - tw);
									o2.setY(o2.getY() - tw);
								}
								else if(o2.isSolidColliding1 == true && o2.isSolidColliding7 == false)
								{
									o2.setX(o2.getX() - tw);
									o2.setY(o2.getY() + tw);
								}
								else if(o2.isSolidColliding1 == true && o2.isSolidColliding7 == true)
								{
									
								}
								else
								{
									r8 = ra.nextInt(1);
									if(r8 == 0)
									{
										o2.setX(o2.getX() - tw);
										o2.setY(o2.getY() - tw);
									}
									if(r8 == 1)
									{
										o2.setX(o2.getX() - tw);
										o2.setY(o2.getY() + tw);
									}
								}
							}
							else
							{
							o2.setX(o2.getX() - tw);
							}
						}
					}
					
					if((o1 instanceof RedTile || o1 instanceof RMTile || o1 instanceof RMTile2 || (o1 instanceof RedElectricTile && o1.RState == 1) ||(o1 instanceof ElectricTile && o1.state == 1) || o1 instanceof Pawn || (o1 instanceof ECL && o1.state == 1) || (o1 instanceof ECR && o1.state == 1) || (o1 instanceof DECL && o1.state == 1) || (o1 instanceof RECL && o1.state == 1) || (o1 instanceof RECR && o1.state == 1) || (o1 instanceof DRECL && o1.state == 1) || (o1 instanceof DECR && o1.state == 1) || (o1 instanceof DRECR && o1.state == 1)) && o2 instanceof Player)
					{
						p.isAlive = false;
						Sound.death.play();
						KeyHandler.numDeaths += 1;
					}
					
					
					if((o2 instanceof RMTile2 && o1 instanceof SolidTile)) {
						if(o2.direction == -1)
						{
							o2.setX(o2.getX() + 2*tw);
						}
						if(o2.direction == 1)
						{
							o2.setX(o2.getX() - 2*tw);
						}
						
						o2.direction = -o2.direction;
					}
					if(o1 instanceof RMTile2 && o2 instanceof SolidTile) {
						
						if(o1.direction == -1)
						{
							o1.setX(o1.getX() + 2*tw);
						}
						if(o1.direction == 1)
						{
							o1.setX(o1.getX() - 2*tw);
						}
					
					o1.direction = -o1.direction;
				}
					
					
					
					if((o2 instanceof RMTile)&& o1 instanceof SolidTile) {
						if(o2.direction == -1)
						{
							o2.setY(o2.getY() - 2*tw);
						}
						if(o2.direction == 1)
						{
							o2.setY(o2.getY() + 2*tw);
						}
						
						o2.direction = -o2.direction;
					}
					if((o1 instanceof RMTile && o2 instanceof SolidTile && o1.direction == 1)) {
						
						if(o1.direction == -1)
						{
							o1.setX(o1.getX() + 2*tw);
						}
						if(o1.direction == 1)
						{
							o1.setX(o1.getX() - 2*tw);
						}
					
					o1.direction = -o1.direction;
				}
					
				
					
					if((o1 instanceof SolidTile || o1 instanceof Pawn) && o2 instanceof GridPlayer)
					{
						if (p.getY() < o2.getY() && p.getX() == o2.getX())
						{
							o2.setY(o2.getY() - tw);
						}
						if (p.getY() > o2.getY() && p.getX() == o2.getX())
						{
							o2.setY(o2.getY() + tw);
						}
						if (p.getY() == o2.getY() && p.getX() < o2.getX())
						{
							o2.setX(o2.getX() - tw);
						}
						if (p.getY() == o2.getY() && p.getX() > o2.getX())
						{
							o2.setX(o2.getX() + tw);
						}
					}
				}
			}
		}
	}
	
	public void switchState()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof ElectricTile || o instanceof DECR || o instanceof DECL || o instanceof ECR || o instanceof ECL)
			{
				o.state = -o.state;
				
			}
			
		}
	}
	
	public void resetElectric()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof ElectricTile || o instanceof DECR || o instanceof DECL || o instanceof ECR || o instanceof ECL)
			{
				o.state = -o.state;
			}
		}
	}
	
	public void moveRook(int tw, int width, int height, Player p)
	{
		for (int i = 0; i < objects.size(); i++) { 
			for (int j = i + 1; j < objects.size(); j++) {
			
			GameObject o = objects.get(i);
			GameObject o2 = objects.get(j);
			
			
			if(o instanceof Rook)
			{
				
				if(p.getX() == o.getX() && p.getY() < o.getY())
				{
					for(int i1 = 1; i1 <= (o.getY() - p.getY())/tw; i1++)
					{
						if(!o.isSolidColliding2)
						{
							o.setY(o.getY() + ((p.getY() - o.getY())/tw)*tw);
						}
						if(o.isSolidColliding2)
						{
							//do nothing
						}
						
					}

				}
				
				else if(p.getX() > o.getX() && p.getY() == o.getY())
				{
					for(int i2 = 1; i2 <= (p.getX() - o.getX())/tw; i2++)
					{
						
						if(!o.isSolidColliding4)
						{
							o.setX(o.getX() + ((p.getX() - o.getX())/tw)*tw);
						}
						if(o.isSolidColliding4)
						{
							//do nothing
						}
						
					}
				}
				
				
				else if(p.getX() == o.getX() && p.getY() > o.getY())
				{
					for(int i3 = 1; i3 <= (p.getY() - o.getY())/tw; i3++)
					{
						if(!o.isSolidColliding6 )
						{
							o.setY(o.getY() + ((p.getY() - o.getY())/tw)*tw);
						}
						if(o.isSolidColliding6)
						{
							//do nothing
						}
						
					}
				}
				
				else if(p.getX() < o.getX() && p.getY() == o.getY())
				{
					for(int i4 = 1; i4 <= (o.getX() - p.getX())/tw; i4++)
					{
						
						if(!o.isSolidColliding8)
						{
							o.setX(o.getX() - ((o.getX() - p.getX())/tw)*tw);
						}
						if(o.isSolidColliding8)
						{
							//do nothing
						}
						
					}
				}
			}
		}
		}
	}
	
	public void movePawn(int tw, int width, int height, Player p)
	{
		for (int i = 0; i < objects.size(); i++) {
			
				GameObject obj = objects.get(i);
				
				if(obj instanceof Pawn)
				{
					
				//tile 1
				if(p.getX() < obj.getX() && p.getY() < obj.getY())
				{
					if(obj.isSolidColliding1 == true)
					{
						if(obj.isSolidColliding2 == true && obj.isSolidColliding8 == false)
						{
							obj.setX(obj.getX() - tw);
						}
						else if(obj.isSolidColliding8 == true && obj.isSolidColliding2 == false)
						{
							obj.setY(obj.getY() - tw);
						}
						else if(obj.isSolidColliding8 == true && obj.isSolidColliding2 == true)
						{
							
						}
						else
						{
							r1 = ra.nextInt(1);
							if(r1 == 0) {
                                obj.setX(obj.getX() - tw);}
							if(r1 == 1) {
                                obj.setY(obj.getY() - tw);}
						}
					}
					else
					{
					obj.setX(obj.getX() - tw);
					obj.setY(obj.getY() - tw);
					}
				}
				
				//tile 2
				else if(p.getX() == obj.getX() && p.getY() < obj.getY())
				{
					if(obj.isSolidColliding2 == true)
					{
						if(obj.isSolidColliding1 == true && obj.isSolidColliding3 == false)
						{
							obj.setX(obj.getX() + tw);
							obj.setY(obj.getY() - tw);
						}
						else if(obj.isSolidColliding3 == true && obj.isSolidColliding1 == false)
						{
							obj.setX(obj.getX() - tw);
							obj.setY(obj.getY() - tw);
						}
						else if(obj.isSolidColliding3 == true && obj.isSolidColliding1 == true)
						{
							
						}
						else
						{
							r2 = ra.nextInt(1);
							if(r2 == 0)
							{
							obj.setX(obj.getX() + tw);
							obj.setY(obj.getY() - tw);
							}
							if(r2 == 1)
							{
								obj.setX(obj.getX() - tw);
								obj.setY(obj.getY() - tw);
							}
						}
					}
					else
					{
					obj.setY(obj.getY() - tw);
					}
				}
				
				//tile 3
				else if(p.getX() > obj.getX() && p.getY() < obj.getY())
				{
					if(obj.isSolidColliding3 == true)
					{
						if(obj.isSolidColliding2 == true && obj.isSolidColliding4 == false)
						{
							obj.setX(obj.getX() + tw);
						}
						else if (obj.isSolidColliding4 == true && obj.isSolidColliding2 == false)
						{
							obj.setY(obj.getY() - tw);
						}
						else if (obj.isSolidColliding2 == true && obj.isSolidColliding4 == true)
						{
							
						}
						else
						{
							r3 = ra.nextInt(1);
							if(r3 == 0)
							{
								obj.setX(obj.getX() + tw);
							}
							if(r3 == 1)
							{
								obj.setY(obj.getY() - tw);
							}
						}
					}
					else
					{
					obj.setX(obj.getX() + tw);
					obj.setY(obj.getY() - tw);
					}
					
				}
				
				//tile 4
				else if(p.getX() > obj.getX() && p.getY() == obj.getY())
				{
					if(obj.isSolidColliding4 == true)
					{
						if(obj.isSolidColliding3 == true && obj.isSolidColliding5 == false)
						{
						obj.setX(obj.getX() + tw);
						obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding5 == true && obj.isSolidColliding3 == false)
						{
						obj.setX(obj.getX() + tw);
						obj.setY(obj.getY() - tw);
						}
						else if (obj.isSolidColliding3 == true && obj.isSolidColliding5 == true)
						{
							
						}
						else
						{
							r4 = ra.nextInt(1);
							if(r4 == 0)
							{
								obj.setX(obj.getX() + tw);
								obj.setY(obj.getY() + tw);
							}
							if(r4 == 1)
							{
								obj.setX(obj.getX() + tw);
								obj.setY(obj.getY() - tw);
							}
						}
						
						
					}
					else
					{	
						obj.setX(obj.getX() + tw);
					}
					
				}
				
				//tile 5
				else if(p.getX() > obj.getX() && p.getY() > obj.getY())
				{
					if(obj.isSolidColliding5 == true)
					{
						if(obj.isSolidColliding4 == true && obj.isSolidColliding6 == false)
						{
							obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding6 == true && obj.isSolidColliding4 == false)
						{
							obj.setX(obj.getX() + tw);
						}
						else if (obj.isSolidColliding4 == true && obj.isSolidColliding4 == true)
						{
							
						}
						else
						{
							r5 = ra.nextInt(1);
							if(r5 == 0)
							{
								obj.setX(obj.getX() + tw);
							}
							if(r5 == 1)
							{
								obj.setY(obj.getY() + tw);
							}
						}
					}
					else
					{
					obj.setX(obj.getX() + tw);
					obj.setY(obj.getY() + tw);
					}
				}
				
				//tile 6
				else if(p.getX() == obj.getX() && p.getY() > obj.getY())
				{
					if(obj.isSolidColliding6 == true)
					{
						if(obj.isSolidColliding5 == true && obj.isSolidColliding7 == false)
						{
							obj.setX(obj.getX() - tw);
							obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding7 == true && obj.isSolidColliding5 == false)
						{
							obj.setX(obj.getX() + tw);
							obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding7 == true && obj.isSolidColliding5 == true)
						{
							
						}
						else
						{
							r6 = ra.nextInt(1);
							if(r6 == 0)
							{
								obj.setX(obj.getX() - tw);
								obj.setY(obj.getY() + tw);
							}
							if(r6 == 1)
							{
								obj.setX(obj.getX() + tw);
								obj.setY(obj.getY() + tw);
							}
						}
					}
					else
					{
					obj.setY(obj.getY() + tw);
					}
				}
				
				//tile 7
				else if(p.getX() < obj.getX() && p.getY() > obj.getY())
				{
					if(obj.isSolidColliding7 == true)
					{
						if(obj.isSolidColliding6 == true && obj.isSolidColliding8 == false)
						{
							obj.setX(obj.getX() - tw);
						}
						else if(obj.isSolidColliding8 == true && obj.isSolidColliding6 == false)
						{
							obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding8 == true && obj.isSolidColliding6 == true)
						{
							
						}
						else
						{
							r7 = ra.nextInt(1);
							if(r7 == 0)
							{
								obj.setX(obj.getX() - tw);
							}
							if(r7 == 1)
							{
								obj.setY(obj.getY() + tw);
							}
						}
					}
					else
					{
					obj.setX(obj.getX() - tw);
					obj.setY(obj.getY() + tw);
					}
				}
				
				//tile 8
				else if(p.getX() < obj.getX() && p.getY() == obj.getY())
				{
					if(obj.isSolidColliding8 == true)
					{
						if(obj.isSolidColliding7 == true && obj.isSolidColliding1 == false)
						{
							obj.setX(obj.getX() - tw);
							obj.setY(obj.getY() - tw);
						}
						else if(obj.isSolidColliding1 == true && obj.isSolidColliding7 == false)
						{
							obj.setX(obj.getX() - tw);
							obj.setY(obj.getY() + tw);
						}
						else if(obj.isSolidColliding1 == true && obj.isSolidColliding7 == true)
						{
							
						}
						else
						{
							r8 = ra.nextInt(1);
							if(r8 == 0)
							{
								obj.setX(obj.getX() - tw);
								obj.setY(obj.getY() - tw);
							}
							if(r8 == 1)
							{
								obj.setX(obj.getX() - tw);
								obj.setY(obj.getY() + tw);
							}
						}
					}
					else
					{
					obj.setX(obj.getX() - tw);
					}
				}
				
				obj.setSolidColliding1(false);
				obj.setSolidColliding2(false);
				obj.setSolidColliding3(false);
				obj.setSolidColliding4(false);
				obj.setSolidColliding5(false);
				obj.setSolidColliding6(false);
				obj.setSolidColliding7(false);
				obj.setSolidColliding8(false);
				
				}
				
			}
		}
	
	public void moveTile(int tw, int width, int height) {
		for (int i = 0; i < objects.size(); i++) {
				GameObject o = objects.get(i);
				if(o instanceof RMTile)
				{
					
					if(o.direction == -1 && o.getY() >= height - o.getHeight())
					{
						o.direction = 1;
					}
					
					if(o.direction == 1 && (o.getY() <= 0))
					{
						o.direction = -1;
					}
					if(o.direction == 1)
					{
						o.setY(o.getY() - tw);
					}
					if(o.direction == -1)
					{
						o.setY(o.getY() + tw);
					}
				}
				
				
				if(o instanceof RMTile2)
				{
				if(o.direction == -1 && (o.getX() <= 0))
					{
						o.direction = 1;
					}
					
				if(o.direction == 1 && (o.getX() >= width - o.getWidth()))
					{
						
						o.direction = -1;

					}
				 if(o.direction == 1)
					{
						o.setX(o.getX() + tw);
					}
				 if(o.direction == -1)
					{
						o.setX(o.getX() - tw);
					}
				}
		}
	}
	
	public void checkRedState(Player p)
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof RedElectricTile || o instanceof RECR || o instanceof RECL || o instanceof DRECR || o instanceof DRECL)
			{
				if(KeyHandler.enterPressed == true && o.direction == 22)
				{
					o.RState = 1;
					o.direction = 0;
				}
				else if(p.getX() == o.getX() && p.getY() == o.getY() && KeyHandler.enterPressed == true)
				{
					o.direction = 22;
				}
			}
			}
	}
	
	public void redTileReset()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof RedElectricTile || o instanceof RECR || o instanceof RECL || o instanceof DRECR || o instanceof DRECL)
			{
				o.RState = -1;
			}
		}
	}
	
	public void rightConveyerBelt(Player p, GridPlayer gp, int tw)
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(cb == false)
			{
			if((o instanceof RightConveyerBelt || o instanceof ECR || o instanceof RECR)&& o.getX() == p.getX() && o.getY() == p.getY())
			{
				p.setX(p.getX() + tw);
				gp.setX(gp.getX() + tw);
				cb = true;
			}
			if((o instanceof LeftConveyerBelt || o instanceof ECL || o instanceof RECL) && o.getX() == p.getX() && o.getY() == p.getY())
			{
				p.setX(p.getX() - tw);
				gp.setX(gp.getX() - tw);
				cb = true;
			}
			if((o instanceof DoubleRCB || o instanceof DECR || o instanceof DRECR) && o.getX() == p.getX() && o.getY() == p.getY())
			{
				p.setX(p.getX() + 2*tw);
				gp.setX(gp.getX() + 2*tw);
				cb = true;
			}
			if((o instanceof DoubleLCB || o instanceof DECL || o instanceof DRECL) && o.getX() == p.getX() && o.getY() == p.getY())
			{
				p.setX(p.getX() - 2*tw);
				gp.setX(gp.getX() - 2*tw);
				cb = true;
			}
			}
		}
		}
	
	public void reset(){
		objects.clear();
	}
}

