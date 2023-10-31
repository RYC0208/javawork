package abs02;

public abstract class Phone {
private String owner;
private String Message;
private String search;


Phone(String owner){
	this.owner =owner;
}

public abstract void turnon();
public abstract void turnoff() ;


public abstract void infor();
	
}

