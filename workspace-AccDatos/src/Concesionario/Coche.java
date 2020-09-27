package Concesionario;

public class Coche {

	private int id;
	private String marca;
	private String modelo;
	private String cilindrada;

	public Coche(){};
	public Coche(int id, String marca, String modelo, String cilindrada){
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String string) {
		this.cilindrada = string;
	}
	public int getId() {
		return id;
	}

}
