package com.sidgs.product.model;

public class StyleMaster {

	int styleId;
	String styleName;
	String styleSize;
	String styleColor;
	String styleBrand;
	String styleDescription;
	
	
	public int getStyleId() {
		return styleId;
	}
	public void setStyleId(int styleId) {
		this.styleId = styleId;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getStyleSize() {
		return styleSize;
	}
	public void setStyleSize(String styleSize) {
		this.styleSize = styleSize;
	}
	public String getStyleColor() {
		return styleColor;
	}
	public void setStyleColor(String styleColor) {
		this.styleColor = styleColor;
	}
	public String getStyleBrand() {
		return styleBrand;
	}
	public void setStyleBrand(String styleBrand) {
		this.styleBrand = styleBrand;
	}
	public String getStyleDescription() {
		return styleDescription;
	}
	public void setStyleDescription(String styleDescription) {
		this.styleDescription = styleDescription;
	}


	@Override
	public String toString() {
		return "StyleMaster{" +
				"styleId=" + styleId +
				", styleName='" + styleName + '\'' +
				", styleSize='" + styleSize + '\'' +
				", styleColor='" + styleColor + '\'' +
				", styleBrand='" + styleBrand + '\'' +
				", styleDescription='" + styleDescription + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		StyleMaster that = (StyleMaster) o;

		if (styleId != that.styleId) return false;
		if (styleName != null ? !styleName.equals(that.styleName) : that.styleName != null) return false;
		if (styleSize != null ? !styleSize.equals(that.styleSize) : that.styleSize != null) return false;
		if (styleColor != null ? !styleColor.equals(that.styleColor) : that.styleColor != null) return false;
		if (styleBrand != null ? !styleBrand.equals(that.styleBrand) : that.styleBrand != null) return false;
		return !(styleDescription != null ? !styleDescription.equals(that.styleDescription) : that.styleDescription != null);

	}

	@Override
	public int hashCode() {
		int result = styleId;
		result = 31 * result + (styleName != null ? styleName.hashCode() : 0);
		result = 31 * result + (styleSize != null ? styleSize.hashCode() : 0);
		result = 31 * result + (styleColor != null ? styleColor.hashCode() : 0);
		result = 31 * result + (styleBrand != null ? styleBrand.hashCode() : 0);
		result = 31 * result + (styleDescription != null ? styleDescription.hashCode() : 0);
		return result;
	}
}
