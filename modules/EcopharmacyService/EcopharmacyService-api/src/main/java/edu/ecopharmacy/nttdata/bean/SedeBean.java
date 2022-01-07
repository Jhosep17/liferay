package edu.ecopharmacy.nttdata.bean;

public class SedeBean {
	private long id;
	private String name;
	private String direccion;
	private String numero;

	public SedeBean() {
		super();
	}

	public SedeBean(long id, String name, String direccion, String numero) {
		super();
		this.id = id;
		this.name = name;
		this.direccion = direccion;
		this.numero = numero;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Sede [id=" + id + ", name=" + name + ", direccion=" + direccion + ", numero=" + numero + "]";
	}

}
