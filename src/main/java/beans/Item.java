/**
 * 
 */
package beans;
/*
*	@Author alxyg
*/
public class Item {
	
	public Item(String item, Double price, Integer unidades) {
		this.item = item;
		this.price = price;
		this.unidades = unidades;
	}
	
	private String item;
	private Double price;
	private int unidades;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	
}
