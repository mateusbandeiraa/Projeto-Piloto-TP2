package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class ItemAtaque extends Item {
	protected float bonusAtaque = 1.2f;

	public ItemAtaque() {
		this.nome = "Orbe Ataque";
		this.sprite = new Sprite(new Texture(Gdx.files.internal("itemAtaque.png")));
	}
	
	public float bonusAtaque() {
		return bonusAtaque;
	}
}
