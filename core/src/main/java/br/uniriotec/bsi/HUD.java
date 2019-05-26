package br.uniriotec.bsi;

import java.util.ArrayList;

import org.mini2Dx.core.graphics.Graphics;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Align;

public class HUD {
	private ArrayList<String> dialogo;
	private int falaAtual = -1;
	private boolean mostrandoDialogo = false;
	private float xDialogo, yDialogo, larguraDialogo, alturaDialogo;

	private boolean mostrandoInventario = false;
	private ArrayList<Item> itensInventario;
	private float xInventario, yInventario, larguraInventario, alturaInventario;

	public HUD() {
		dialogo = new ArrayList<String>();
		dialogo.add("Olá, jogador!");
		dialogo.add("Você não é baixo demais para ser um stormtrooper?");
	}

	public void iniciarDialogo() {
		encerrarInventario();
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

	public void mostrarInventario(ArrayList<Item> itens) {
		encerrarDialogo();
		mostrandoInventario = true;
		this.itensInventario = itens;
	}

	public void encerrarInventario() {
		mostrandoInventario = false;
	}

	private void calcularDimensoesCaixaDialogo(Graphics g) {
		float vh = g.getViewportHeight();
		float vw = g.getViewportWidth();

		larguraDialogo = vw / 2.5f;
		alturaDialogo = 100f;

		xDialogo = (vw - larguraDialogo) / 2f;
		yDialogo = vh - alturaDialogo - 50f;
	}

	private void calcularDimensoesCaixaInventario(Graphics g) {
		float vh = g.getViewportHeight();
		float vw = g.getViewportWidth();

		larguraInventario = vw / 1.2f;
		alturaInventario = vh / 1.2f;

		xInventario = (vw - larguraInventario) / 2f;
		yInventario = (vh - alturaInventario) / 2f;
	}

	public void update(float delta) {

	}

	public void render(Graphics g) {
		if (mostrandoDialogo) {
			calcularDimensoesCaixaDialogo(g);
			g.setColor(Color.GRAY);
			g.fillRect(xDialogo, yDialogo, larguraDialogo, alturaDialogo);

			g.setColor(Color.WHITE);
			g.drawRect(xDialogo, yDialogo, larguraDialogo, alturaDialogo);

			g.drawString(dialogo.get(falaAtual), xDialogo + 10f, yDialogo + 10, larguraDialogo - 20f);
			g.drawString("pressione A para continuar", xDialogo, yDialogo + alturaDialogo + 5f);
		} else if (mostrandoInventario) {
			calcularDimensoesCaixaInventario(g);
			g.setColor(Color.GRAY);
			g.fillRect(xInventario, yInventario, larguraInventario, alturaInventario);

			g.setColor(Color.WHITE);
			g.drawRect(xInventario, yInventario, larguraInventario, alturaInventario);

			for (int i = 0; i < itensInventario.size(); i++) {
				Item item = itensInventario.get(i);
				float tam = item.getSprite().getWidth();
				float posX = xInventario + 16f + (tam + 4f) * i;
				float posY = yInventario + 8f;

				g.drawSprite(item.getSprite(), posX, posY);
				g.setColor(Color.WHITE);
				g.drawString(item.getNome(), posX, posY + tam - 16f, tam, Align.center);
				g.setColor(Color.BLACK);
				g.drawRect(posX, posY, tam, tam);
			}
		}
	}

	public boolean estaMostrandoDialogo() {
		return mostrandoDialogo;
	}

	public boolean estaMostrandoInventario() {
		return mostrandoInventario;
	}
}
