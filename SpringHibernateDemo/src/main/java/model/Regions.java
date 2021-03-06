package model;
// Generated Apr 12, 2016 9:20:51 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Regions generated by hbm2java
 */
public class Regions implements java.io.Serializable {

	private BigDecimal regionId;
	private String regionName;
	private Set<Countries> countrieses = new HashSet<Countries>(0);

	public Regions() {
	}

	public Regions(BigDecimal regionId) {
		this.regionId = regionId;
	}

	public Regions(BigDecimal regionId, String regionName, Set<Countries> countrieses) {
		this.regionId = regionId;
		this.regionName = regionName;
		this.countrieses = countrieses;
	}

	public BigDecimal getRegionId() {
		return this.regionId;
	}

	public void setRegionId(BigDecimal regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Set<Countries> getCountrieses() {
		return this.countrieses;
	}

	public void setCountrieses(Set<Countries> countrieses) {
		this.countrieses = countrieses;
	}

}
