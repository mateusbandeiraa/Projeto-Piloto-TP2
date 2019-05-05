package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.graphics.Texture;

public class Personagem {
	protected Sprite sprite;

	public Personagem(Texture texture, float x, float y, float width, float height) {
		this.sprite = new Sprite(texture);
		sprite.setPosition(x, y);
		sprite.setSize(width, height);
	}

	public void render(Graphics g) {
		g.drawSprite(sprite);
	}

}
