package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Arvore {
	protected Sprite sprite;

	public Arvore(float x, float y, float width, float height) {
		this.sprite = new Sprite(new Texture(Gdx.files.internal("arvore.png")));
		sprite.setPosition(x, y);
		sprite.setSize(width, height);
	}

	public void render(Graphics g) {
		g.drawSprite(sprite);
	}

	public void update(float delta) {
		
	}
	
	public void morrer() {
		this.sprite.setTexture(new Texture(Gdx.files.internal("arvore_morta.png")));
	}
}
