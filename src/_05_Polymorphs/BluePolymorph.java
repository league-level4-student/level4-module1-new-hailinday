package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	public BluePolymorph(int x, int y, int polyWidth, int polyHeight) {
		super(x, y);
		this.polyWidth = polyWidth;
		this.polyHeight = polyHeight;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, polyWidth, polyHeight);
	}

    @Override
    public void update() {
        
    }
	
}
