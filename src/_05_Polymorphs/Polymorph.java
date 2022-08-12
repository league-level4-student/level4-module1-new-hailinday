package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int polyWidth;
    int polyHeight;
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
    public void getX() {
    	
    }
}
