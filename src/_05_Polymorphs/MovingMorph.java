package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int polyWidth, int polyHeight) {
		super(x, y);
		this.polyWidth = polyWidth;
		this.polyHeight = polyHeight;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x+=1;
		y+=1;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, polyWidth, polyHeight);
	}

}
