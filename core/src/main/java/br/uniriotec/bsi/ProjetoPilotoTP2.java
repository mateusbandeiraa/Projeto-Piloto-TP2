package br.uniriotec.bsi;

import org.mini2Dx.core.game.ScreenBasedGame;

import br.uniriotec.bsi.screen.IndoorScreen;

public class ProjetoPilotoTP2 extends ScreenBasedGame {
	public static final String GAME_IDENTIFIER = "br.uniriotec.bsi.PPTP2";

	@Override
	public void initialise() {
		this.addScreen(new IndoorScreen());
	}

	@Override
	public int getInitialScreenId() {
		return 1;
	}

}
