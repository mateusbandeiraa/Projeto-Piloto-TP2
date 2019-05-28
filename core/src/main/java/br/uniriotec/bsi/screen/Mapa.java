package br.uniriotec.bsi.screen;

public enum Mapa {
	CASA_INDOOR("Casa indoor", "mapa.tmx");
	
	private Mapa(String nome, String arquivo) {
		this.nome = nome;
		this.arquivo = arquivo;
	}
	public final String nome;
	public final String arquivo;
}
