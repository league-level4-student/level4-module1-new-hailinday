package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y, int polyWidth, int polyHeight) {
		super(x, y);
		this.polyWidth = polyWidth;
		this.polyHeight = polyHeight;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x, y, polyWidth, polyHeight);
	}

}
