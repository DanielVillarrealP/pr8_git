
public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		System.out.println("Hola mundo otra vez, de Daniel");

		methodRuben();
		
		methodRamaDaniel();
	}

	public static void methodRuben() {
    System.out.println("Hola mundo, cambiado por Rubén Vega");
    System.out.println("Cambio añadido a la Rama Rubén");
	  System.out.println("He creado mi fork, y realizo un cambio solicitando pull request al proyecto original");
	}
	
	public static void methodRamaDaniel() {
		System.out.println("Hola, cambio desde usando la rama de Daniel");
		System.out.println("Hola, cambio para causar conflicto al fork de Rubén");
	}

}
