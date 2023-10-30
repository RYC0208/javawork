package inEX02;

public class Tv {
	private String model;
	private int inc;
	private boolean power;
	private int vol;
	private int cha;
void power(){
	power = !power;
	if(power)
	System.out.println("Tv on");
	else
		System.out.println("Tv off");
}void setcha(int cha){
	this.cha = cha;
}public int getcha() {
	return cha;
}void setvol(int vol){
	this.vol= vol;
}public int getvol(){
	return vol;
}void setinc(int inc){
	this.inc = inc;
}public int inc() {
	return inc;
}
}