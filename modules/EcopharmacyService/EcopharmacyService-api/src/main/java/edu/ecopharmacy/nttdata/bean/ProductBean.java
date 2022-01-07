package edu.ecopharmacy.nttdata.bean;

public class ProductBean {

	private long id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private String image;
	private String nameCategoria;

	public ProductBean() {
		super();
	}

	public ProductBean(long l, String nombre, String descripcion, Double precio, String image, String nameCategoria) {
		super();
		this.id = l;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.image = image;
		this.nameCategoria = nameCategoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNameCategoria() {
		return nameCategoria;
	}

	public void setNameCategoria(String nameCategoria) {
		this.nameCategoria = nameCategoria;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", image=" + image + ", nameCategoria=" + nameCategoria + "]";
	}

}
