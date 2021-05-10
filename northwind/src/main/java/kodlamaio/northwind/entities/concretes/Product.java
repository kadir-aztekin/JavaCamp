package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity //ENTİTY OLDUGUNU BELIRTTIK IMZALADIK
@Table(name="products")
@Data
public class Product {
	
	@Id //BU SINIFIN ID SI OLDUGUNU GOSTERDIK
	@GeneratedValue //SUREKLI ARTAN DEMEK IDENTITY MANTIGI
	@Column(name="product_id") //TABLE DAKI VERILERLE BIRBIRLERINI ESLESTIRDIK DBSET MANTIGI
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice; 
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	

}
