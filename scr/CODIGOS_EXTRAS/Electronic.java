package scr.CODIGOS_EXTRAS;

public class Electronic implements Device
{ 
	public void doIt() { }
}

abstract class Phone1 extends Electronic { }

abstract class Phone2 extends Electronic
{
	public abstract void doIt(int x);
}

class Phone3 extends Electronic implements Device
{ 
	public void doStuff() {
	}
	public void doIt(){}
}

interface Device { 
	abstract void doIt();
 }