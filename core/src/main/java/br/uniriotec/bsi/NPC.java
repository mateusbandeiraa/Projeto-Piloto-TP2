package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class NPC {
	protected Sprite sprite;
	protected float x, y;
	protected float width, height;

	public NPC(float x, float y, float width, float height) {
		this.sprite = new Sprite(new Texture(Gdx.files.internal("tankGreen.png")));
		
		this.x = x;
		this.y = y;
		sprite.setPosition(x, y);
		
		this.width = width;
		this.height = height;
		sprite.setSize(width, height);
	}

	public void render(Graphics g) {
		g.drawSprite(sprite);
	}

	public void update(float delta) {

	}

	public boolean estaColidindo(Personagem p) {
		return (Math.abs(sprite.getX() - p.sprite.getX()) < width) && (Math.abs(sprite.getY() - p.sprite.getY()) < height);
	}
}
