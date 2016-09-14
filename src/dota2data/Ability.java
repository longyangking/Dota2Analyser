package dota2data;

public class Ability {
	public static enum DamageType {Physical, Magical};
	private String name;
	private String Affects;
	private DamageType damagetype;
	private double castanimation, castrange, fissurelength, fissurestunradius;
	private double damage, stunduration, fissureduration;
	private double cooldown, mana;
	public Ability(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return String.format("Ability %s", this.name);
	}
	public String getAffects() {
		return Affects;
	}
	public void setAffects(String affects) {
		Affects = affects;
	}
	public DamageType getDamagetype() {
		return damagetype;
	}
	public void setDamagetype(DamageType damagetype) {
		this.damagetype = damagetype;
	}
	public double getCastanimation() {
		return castanimation;
	}
	public void setCastanimation(double castanimation) {
		this.castanimation = castanimation;
	}
	public double getCastrange() {
		return castrange;
	}
	public void setCastrange(double castrange) {
		this.castrange = castrange;
	}
	public double getFissurelength() {
		return fissurelength;
	}
	public void setFissurelength(double fissurelength) {
		this.fissurelength = fissurelength;
	}
	public double getFissurestunradius() {
		return fissurestunradius;
	}
	public void setFissurestunradius(double fissurestunradius) {
		this.fissurestunradius = fissurestunradius;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public double getStunduration() {
		return stunduration;
	}
	public void setStunduration(double stunduration) {
		this.stunduration = stunduration;
	}
	public double getFissureduration() {
		return fissureduration;
	}
	public void setFissureduration(double fissureduration) {
		this.fissureduration = fissureduration;
	}
	public double getCooldown() {
		return cooldown;
	}
	public void setCooldown(double cooldown) {
		this.cooldown = cooldown;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public String getName() {
		return name;
	}
	
}
