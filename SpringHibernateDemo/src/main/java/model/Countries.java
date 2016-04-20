package model;
// Generated Apr 12, 2016 9:20:51 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Countries generated by hbm2java
 */
public class Countries implements java.io.Serializable {

	private String countryId;
	private Regions regions;
	private String countryName;
	private Set<Locations> locationses = new HashSet<Locations>(0);

	public Countries() {
	}

	public Countries(String countryId) {
		this.countryId = countryId;
	}

	public Countries(String countryId, Regions regions, String countryName, Set<Locations> locationses) {
		this.countryId = countryId;
		this.regions = regions;
		this.countryName = countryName;
		this.locationses = locationses;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Regions getRegions() {
		return this.regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<Locations> getLocationses() {
		return this.locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

}
