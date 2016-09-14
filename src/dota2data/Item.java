package dota2data;

public class Item {
	private String name, ability, affects;
	private double costrange, duration;
	public double getCostrange() {
		return costrange;
	}
	public void setCostrange(double costrange) {
		this.costrange = costrange;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Item(String name){
		this.name = name;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public String getAffects() {
		return affects;
	}
	public void setAffects(String affects) {
		this.affects = affects;
	}
	public String getName() {
		return name;
	}
	
}
