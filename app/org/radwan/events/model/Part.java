package org.radwan.events.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="part")
public class Part {

	@Id
	@Column(name="product_id")
	private BigDecimal id;
	@Column(name="product_name")
	private String name;
	@Column(name="product_description")
	private String description;
	
	@ManyToMany(
            targetEntity=Product.class,
            cascade={CascadeType.PERSIST, CascadeType.MERGE}
        )
        @JoinTable(
            name="product_part",
            joinColumns=@JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id")
        )
	private Set<Product> products;

	@ManyToMany(
            targetEntity=Supplier.class,
            cascade={CascadeType.PERSIST, CascadeType.MERGE}
        )
        @JoinTable(
            name="supplier_part",
            joinColumns=@JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="supplier_id")
        )
	private Set<Supplier> suppliers;

	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Set<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
}
