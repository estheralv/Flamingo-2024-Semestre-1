package exemplos;

public class JavaMultiplasClasses_e_Objetos {
	
	int x = 5;
	
	public static void main(String[] args) {
		JavaMultiplasClasses_e_Objetos objeto1 = new JavaMultiplasClasses_e_Objetos();
		JavaMultiplasClasses_e_Objetos objeto2 = new JavaMultiplasClasses_e_Objetos();
		System.out.println(objeto1.x);
		System.out.println(objeto2.x);
	}

}
