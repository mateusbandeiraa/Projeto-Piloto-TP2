package br.uniriotec.bsi;

import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.tiled.TiledMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class ProjetoPilotoTP2 extends BasicGame {
	public static final String GAME_IDENTIFIER = "br.uniriotec.bsi.PPTP2";

	private TiledMap mapa;
	private Personagem jogador;

	@Override
	public void initialise() {
		mapa = new TiledMap(Gdx.files.internal("mapa.tmx"));
		TiledMap.STRICT_LAYER_VISIBILITY = true;
		
		jogador = new Personagem(new Texture("tankDesert.png"), 128f, 0, 32f, 32f);
	}

	@Override
	public void update(float delta) {

	}

	@Override
	public void interpolate(float alpha) {

	}

	@Override
	public void render(Graphics g) {
		g.drawString("Olá mundo!", 16f, 16f);
		mapa.draw(g, 0, 0);
		jogador.render(g);
	}
}
