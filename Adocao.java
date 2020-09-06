package atividade02_09;

import java.sql.Date;

public class Adocao {

	private int id;
	private Animal animal;
	private Adotante adotante;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Adotante getAdotante() {
		return adotante;
	}
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
	public Date getDataAdocao() {
		return dataAdocao;
	}
	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	private Date dataAdocao;
	private Usuario usuario;
	
}
