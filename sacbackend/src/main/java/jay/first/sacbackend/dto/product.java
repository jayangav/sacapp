package jay.first.sacbackend.dto;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String product_name;
	
	private double product_price;
	
	private String image_url;
	
	//@Column(name = "is_active")
	@JsonIgnore
	private boolean is_active = true;
	@JsonIgnore
	private String description;
	
	
	
	//to string method
	
	
	@Override
	public String toString() {
		return "product [id=" + id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", image_url=" + image_url + ", is_active=" + is_active + ", description=" + description + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public double getProduct_price() {
		return product_price;
	}



	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}



	public String getImage_url() {
		return image_url;
	}



	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}



	public boolean isIs_active() {
		return is_active;
	}



	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	
	
	
	
	
	
	
	
	
	
	
	
}
