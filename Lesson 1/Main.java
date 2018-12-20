public class Main {

	public static void main(String[] args) {

	// TODO: проссумировать числа в диапазоне от 1 до 5

			
			int sum = 1 + 2;

			boolean isEvenNumber = sum % 2 == 0;
			if(isEvenNumber == true) {
				System.out.println("Число " + sum + " является чётным");	
			}
			else if(isEvenNumber == false) {
				System.out.println("Число " + sum + " является нечётным");
			}


			int sum1 = sum + 3;

						boolean isEvenNumber1 = sum1 % 2 == 0;
			if(isEvenNumber1 == true) {
				System.out.println("Число " + sum1 + " является чётным");	
			}
			else if(isEvenNumber1 == false) {
				System.out.println("Число " + sum1 + " является нечётным");
			}

			int sum2 = sum1 + 4;
						boolean isEvenNumber2 = sum2 % 2 == 0;
			if(isEvenNumber2 == true) {
				System.out.println("Число " + sum2 + " является чётным");	
			}
			else if(isEvenNumber2 == false) {
				System.out.println("Число " + sum2 + " является нечётным");
			}

			int result = sum2 + 5;

						boolean isEvenNumber3 = result % 2 == 0;
			if(isEvenNumber3 == true) {
				System.out.println("Число " + result + " является чётным");	
			}
			else if(isEvenNumber3 == false) {
				System.out.println("Число " + result + " является нечётным");
			}

			System.out.println("Итого: 1 + 2 + 3 + 4 + 5 = " + result);
	}
}