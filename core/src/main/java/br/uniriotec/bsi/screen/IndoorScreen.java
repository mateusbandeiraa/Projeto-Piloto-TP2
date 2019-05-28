package br.uniriotec.bsi.screen;

import java.util.ArrayList;

import org.mini2Dx.core.game.GameContainer;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.screen.BasicGameScreen;
import org.mini2Dx.core.screen.ScreenManager;
import org.mini2Dx.tiled.TiledMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import br.uniriotec.bsi.Arvore;
import br.uniriotec.bsi.Personagem;

public class IndoorScreen extends BasicGameScreen {
	public static int ID = 1;

	private TiledMap mapa;
	private Personagem jogador;
	private ArrayList<Arvore> arvores;

	public void initialise(GameContainer gc) {
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

	public void update(GameContainer gc, ScreenManager screenManager, float delta) {
		jogador.update(delta);
		for (Arvore a : arvores) {
			if (a.estaColidindo(jogador)) {
				a.morrer();
			}
		}
	}

	public void interpolate(GameContainer gc, float alpha) {
	}

	public void render(GameContainer gc, Graphics g) {
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

	public int getId() {
		return ID;
	}
}