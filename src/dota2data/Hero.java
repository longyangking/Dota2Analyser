package dota2data;

public class Hero {
	private String name;
	private double strength, agility, intelligence;
	private int level;
	private double health, hregen, mana, mregen, damage, armor, spelldmg, attsec;
	private double movespeed, turnrate, visionrange, attackrange; 
	private double projectilespeed, attackanimation, baseattacktime, magicresistance;
	private double collisionsize, legs;
	public Hero(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return String.format("Hero %s",this.name);
	}
	public String getName(){
		return this.name;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	public double getAgility() {
		return agility;
	}
	public void setAgility(double agility) {
		this.agility = agility;
	}
	public double getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getHregen() {
		return hregen;
	}
	public void setHregen(double hregen) {
		this.hregen = hregen;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getMregen() {
		return mregen;
	}
	public void setMregen(double mregen) {
		this.mregen = mregen;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public double getSpelldmg() {
		return spelldmg;
	}
	public void setSpelldmg(double spelldmg) {
		this.spelldmg = spelldmg;
	}
	public double getAttsec() {
		return attsec;
	}
	public void setAttsec(double attsec) {
		this.attsec = attsec;
	}
	public double getMovespeed() {
		return movespeed;
	}
	public void setMovespeed(double movespeed) {
		this.movespeed = movespeed;
	}
	public double getTurnrate() {
		return turnrate;
	}
	public void setTurnrate(double turnrate) {
		this.turnrate = turnrate;
	}
	public double getVisionrange() {
		return visionrange;
	}
	public void setVisionrange(double visionrange) {
		this.visionrange = visionrange;
	}
	public double getAttackrange() {
		return attackrange;
	}
	public void setAttackrange(double attackrange) {
		this.attackrange = attackrange;
	}
	public double getProjectilespeed() {
		return projectilespeed;
	}
	public void setProjectilespeed(double projectilespeed) {
		this.projectilespeed = projectilespeed;
	}
	public double getAttackanimation() {
		return attackanimation;
	}
	public void setAttackanimation(double attackanimation) {
		this.attackanimation = attackanimation;
	}
	public double getBaseattacktime() {
		return baseattacktime;
	}
	public void setBaseattacktime(double baseattacktime) {
		this.baseattacktime = baseattacktime;
	}
	public double getMagicresistance() {
		return magicresistance;
	}
	public void setMagicresistance(double magicresistance) {
		this.magicresistance = magicresistance;
	}
	public double getCollisionsize() {
		return collisionsize;
	}
	public void setCollisionsize(double collisionsize) {
		this.collisionsize = collisionsize;
	}
	public double getLegs() {
		return legs;
	}
	public void setLegs(double legs) {
		this.legs = legs;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
