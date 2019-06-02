package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.graphics.Texture;

public class Item {
	protected String nome;
	protected Sprite sprite;
	protected float bonusAtaque;
	protected float bonusDefesa;

	public Item(String nome, float bonusAtaque, float bonusDefesa, Texture textura) {
		this.nome = nome;
		this.bonusAtaque = bonusAtaque;
		this.bonusDefesa = bonusDefesa;
		this.sprite = new Sprite(textura);
	}

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
		return this.bonusAtaque;
	}

	public float bonusDefesa() {
		return this.bonusDefesa;
	}
}
