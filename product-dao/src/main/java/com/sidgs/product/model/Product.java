package com.sidgs.product.model;

import javax.persistence.*;

/**
 * Created by ayeluri on 1/15/2017.
 */
@Entity
@Table (name="PRODUCT")
public class Product {

	@Column (name = "PRODUCT_NAME")
    String name ;

	@Column (name = "DESCRIPTION")
    String description ;

	@Column(name = "PRODUCT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id ;

	@Column (name = "PRODUCT_STYLE")
	String style;

	@Column (name = "PRODUCT_BRAND")
	String brand;

	@Column (name = "PRODUCT_IMAGE")
	String image;
    
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", id=" + id + ", style=" + style + ", brand="
				+ brand + ", image=" + image + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		return true;
	}
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
