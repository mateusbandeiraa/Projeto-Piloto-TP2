package br.uniriotec.bsi;

import com.badlogic.gdx.graphics.Texture;

public enum TexturasItens {
	ATAQUE("itemAtaque.png"), DEFESA("itemDefesa.png");
	
	private TexturasItens(String caminho) {
		textura = new Texture(caminho);
	}	
	public final Texture textura;
}
