package entregable;

import java.io.Serializable;

public class Vehiculo implements Serializable{

	private String modelo;
	private String matricula;
	private transient int deposito;
	private String marca;
	
	public Vehiculo(String modelo, String matricula, String marca, int deposito){
		this.modelo=modelo;
		this.matricula=matricula;
		this.marca=marca;
		this.deposito=deposito;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
