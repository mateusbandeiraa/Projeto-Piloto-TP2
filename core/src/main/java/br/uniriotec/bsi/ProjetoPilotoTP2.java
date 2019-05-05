package br.uniriotec.bsi;

import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;

import com.badlogic.gdx.graphics.Texture;

public class ProjetoPilotoTP2 extends BasicGame {
	public static final String GAME_IDENTIFIER = "br.uniriotec.bsi.PPTP2";

	private Texture texture;
	
	@Override
    public void initialise() {
    	texture = new Texture("bsi.png");
    }
    
    @Override
    public void update(float delta) {
    
    }
    
    @Override
    public void interpolate(float alpha) {
    
    }
    
    @Override
    public void render(Graphics g) {
		g.drawTexture(texture, 16f, 16f);
		g.drawString("Olá mundo!", 16f, 245f);
    }
}
