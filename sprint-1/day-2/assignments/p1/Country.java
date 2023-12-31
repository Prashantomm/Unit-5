package com.masai.p1;

public class Country {
	private String countryName;
    private String continentName;
    private double area;

    public Country(String countryName, String continentName, double area) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.area = area;
    }

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", continentName=" + continentName + ", area=" + area + "]";
	}
    

}
