public class Variable {
	public static void main (String [] args){
		// TODO: прописать конфигурацию ПК через примитивные типы данных

	byte core = 4;
	double coreSpeed = 3.8;
	byte ram = 8;
	short storage = 1000;
	boolean bits = false;


	System.out.println("PC info: ");
    System.out.println("_________");
	System.out.println("Ядер: " + core);
	System.out.println("Частота: " + coreSpeed + "GHz");
	System.out.println("ОЗУ: " + ram + "Gb");
	System.out.println("HDD: " + storage + "Gb");
	if(bits == true) {
		System.out.println("system x32");	
			}
	else if(bits == false) {
		System.out.println("system x64");
			}
	}
}