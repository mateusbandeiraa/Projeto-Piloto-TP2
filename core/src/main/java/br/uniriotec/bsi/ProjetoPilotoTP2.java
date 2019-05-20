package br.uniriotec.bsi;

import java.util.ArrayList;

import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.tiled.TiledMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class ProjetoPilotoTP2 extends BasicGame {
	public static final String GAME_IDENTIFIER = "br.uniriotec.bsi.PPTP2";

	private TiledMap mapa;
	private Personagem jogador;
	private ArrayList<Arvore> arvores;

	@Override
	public void initialise() {
		mapa = new TiledMap(Gdx.files.internal("mapa.tmx"));
		TiledMap.STRICT_LAYER_VISIBILITY = true;

		jogador = new Personagem(new Texture("tankDesert.png"), 128f, 0, 32f, 32f);

		arvores = new ArrayList<Arvore>();
		arvores.add(new Arvore(128f, 64f, 16, 16));
		arvores.add(new Arvore(160f, 56f, 16, 16));
		arvores.add(new Arvore(232f, 100f, 16, 16));
		arvores.add(new Arvore(200f, 30f, 16, 16));
		arvores.add(new Arvore(150f, 90f, 16, 16));
		arvores.add(new Arvore(75f, 20f, 16, 16));
		arvores.add(new Arvore(98f, 55f, 16, 16));
		arvores.add(new Arvore(260f, 78f, 16, 16));
	}

	@Override
	public void update(float delta) {
		jogador.update(delta);
		for (Arvore a : arvores) {
			if ((Math.abs(a.sprite.getX() - jogador.sprite.getX()) < 16)
					&& (Math.abs(a.sprite.getY() - jogador.sprite.getY()) < 16)) {
				a.morrer();
			}
		}
	}

	@Override
	public void interpolate(float alpha) {

	}

	@Override
	public void render(Graphics g) {
		mapa.draw(g, 0, 0);
		/*
		 * @formatter:off
		 * TODO:
		 * 	### Renderizar o mapa no centro da tela ###
		 * 
		 * 		DICA: Para calcular a posição (x, y) que o mapa deverá ser renderizado, as
		 * 		informações necessárias são:
		 * 			1) Largura e Altura da tela;
		 * 			2) Largura e Altura do mapa;
		 * 
		 * 			Para obter as dimensões da tela, os seguintes métodos podem ser usados:
		 * 				g.getWindowWidth();
		 *				g.getWindowHeight();
		 *
		 * 		A posição (x, y) para renderizar o mapa no centro da janela é: 
		 * 			x = (larguraDaJanela - larguraDoMapa) / 2
		 * 			y = (alturaDaJanela - alturaDoMapa) / 2
		 * @formatter:on
		 */
		for (Arvore a : arvores) {
			a.render(g);
		}
		jogador.render(g);
	}
}
