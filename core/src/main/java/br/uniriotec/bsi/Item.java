package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

public abstract class Item {
	protected String nome;
	protected Sprite sprite;

	public void render(Graphics g) {
		g.drawSprite(sprite);
	}

	public Sprite getSprite() {
		return sprite;
	}

	public String getNome() {
		return nome;
	}
	
	public float bonusAtaque() {
		return 0f;
	}
	
	public float bonusDefesa() {
		return 0f;
	}
}
