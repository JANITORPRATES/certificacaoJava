package scr.CODIGOS_EXTRAS.heranca;

import java.util.Arrays;

interface Office {
	  default String getHeight() { return null; } // m2
	}

interface Building {
	 default String getHeight(int x) { return "1.0"; } // m1
	}

abstract class Tower implements Building, Office {}

public class Teste extends Tower {}