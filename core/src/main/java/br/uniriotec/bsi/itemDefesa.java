package br.uniriotec.bsi;

import org.mini2Dx.core.graphics.Sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class itemDefesa extends Item {
	protected float bonusDefesa = 1.4f;

	public itemDefesa() {
		this.nome = "Orbe Defesa";
		this.sprite = new Sprite(new Texture(Gdx.files.internal("itemDefesa.png")));
	}

	public float bonusDefesa() {
		return bonusDefesa;
	}
}
