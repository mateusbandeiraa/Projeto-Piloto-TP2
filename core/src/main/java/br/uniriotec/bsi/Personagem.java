package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
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

	public void update(float delta) {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			sprite.setX(sprite.getX() - 4f);
		} else if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			sprite.setX(sprite.getX() + 4f);
		}

		if (Gdx.input.isKeyPressed(Keys.UP)) {
			sprite.setY(sprite.getY() - 4f);
		} else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			sprite.setY(sprite.getY() + 4f);
		}
	}
}
