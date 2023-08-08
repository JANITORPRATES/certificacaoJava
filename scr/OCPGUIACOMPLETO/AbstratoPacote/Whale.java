package scr.OCPGUIACOMPLETO.AbstratoPacote;

interface Jump {
	static public int MAX = 3;
}

public abstract class Whale implements Jump {
	public abstract void dive();

	public static void main(String[] args) {
		Whale whale = new Orca();
		//whale.dive(3); The method dive() in the type Whale is not applicable for the arguments (int)
		whale.dive();//Orca diving

	}
}

class Orca extends Whale {
	public void dive() {
		System.out.println("Orca diving");
	}

	public void dive(int... depth) {
		System.out.println("Orca diving deeper" + MAX);
	}
}
