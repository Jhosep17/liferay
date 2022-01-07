package edu.ecopharmacy.nttdata.bean;

public class InventoryBean {
	
	private long id;
	private ProductBean product;
	private SedeBean sede;
	private int stock;

	public InventoryBean() {
		super();
	}
	public InventoryBean(long id, ProductBean product, SedeBean sede, int stock) {
		super();
		this.id = id;
		this.product = product;
		this.sede = sede;
		this.stock = stock;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ProductBean getProduct() {
		return product;
	}
	public void setProduct(ProductBean product) {
		this.product = product;
	}
	public SedeBean getSede() {
		return sede;
	}
	public void setSede(SedeBean sede) {
		this.sede = sede;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "InventoryBean [id=" + id + ", product=" + product.getId() + ", sede=" + sede.getId() + ", stock=" + stock + "]";
	}
}
