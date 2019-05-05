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
		
		/*
		 * @formatter:off
		 * TODO:
		 * 	### Alterar a direção do personagem para apontar em direção ao movimento ###
		 * 		
		 * 		Para espelhar a imagem de um sprite, utilize o método:
		 * 
		 * 		sprite.flip(boolean x, boolean y);
		 * 
		 * 		Se o primeiro argumento for true, o sprite será espelhado horizontalmente.
		 * 		Se o segundo argumento for true, o sprite será espelhado verticalmente.
		 * 		Se os dois argumentos fore true, o sprite será espelhado nos dois eixos.
		 * 
		 * 		Pode ser útil checar se um sprite já está espelhado antes de fazer a modificação.
		 * 		Para isso, utilize os métodos:
		 * 
		 * 		sprite.isFlipX(); (retorna true se o sprite já está espelhado horizontalmente).
		 * 		sprite.isFlipY(); (retorna true se o sprite já está espelhado verticalmente).
		 * 
		 * @formatter:on
		 */
	}
}
