package br.uniriotec.bsi;

import java.util.ArrayList;

import org.mini2Dx.core.graphics.Graphics;

import com.badlogic.gdx.graphics.Color;

public class HUD {
	private ArrayList<String> dialogo;
	private int falaAtual = -1;
	private boolean mostrandoDialogo = false;
	private float x, y, largura, altura;

	public HUD() {
		dialogo = new ArrayList<String>();
		dialogo.add("Olá, jogador!");
		dialogo.add("Você não é baixo demais para ser um stormtrooper?");
	}

	public void iniciarDialogo() {
		mostrandoDialogo = true;
		falaAtual = 0;
	}

	public boolean proximaFala() {
		if (dialogo.size() > falaAtual + 1) {
			falaAtual++;
			return true;
		} else {
			encerrarDialogo();
			return false;
		}
	}

	public void encerrarDialogo() {
		mostrandoDialogo = false;
		falaAtual = -1;
	}

	private void calcularDimensoesCaixaDialogo(Graphics g) {
		float vh = g.getViewportHeight();
		float vw = g.getViewportWidth();

		largura = vw / 2.5f;
		altura = 100f;

		x = (vw - largura) / 2f;
		y = vh - altura - 50f;
	}
	
	public void update(float delta) {

	}

	public void render(Graphics g) {
		if (mostrandoDialogo) {
			calcularDimensoesCaixaDialogo(g);
			g.setColor(Color.GRAY);
			g.fillRect(x, y, largura, altura);

			g.setColor(Color.WHITE);
			g.drawRect(x, y, largura, altura);

			g.drawString(dialogo.get(falaAtual), x + 10f, y + 10 , largura - 20f);
			g.drawString("pressione A para continuar", x, y + altura + 5f);
		}
	}

	public boolean estaMostrandoDialogo() {
		return mostrandoDialogo;
	}
}
