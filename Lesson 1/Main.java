public class Main {

	public static void main(String[] args) {

	// TODO: �������������� ����� � ��������� �� 1 �� 5

			
			int sum = 1 + 2;

			boolean isEvenNumber = sum % 2 == 0;
			if(isEvenNumber == true) {
				System.out.println("����� " + sum + " �������� ������");	
			}
			else if(isEvenNumber == false) {
				System.out.println("����� " + sum + " �������� ��������");
			}


			int sum1 = sum + 3;

						boolean isEvenNumber1 = sum1 % 2 == 0;
			if(isEvenNumber1 == true) {
				System.out.println("����� " + sum1 + " �������� ������");	
			}
			else if(isEvenNumber1 == false) {
				System.out.println("����� " + sum1 + " �������� ��������");
			}

			int sum2 = sum1 + 4;
						boolean isEvenNumber2 = sum2 % 2 == 0;
			if(isEvenNumber2 == true) {
				System.out.println("����� " + sum2 + " �������� ������");	
			}
			else if(isEvenNumber2 == false) {
				System.out.println("����� " + sum2 + " �������� ��������");
			}

			int result = sum2 + 5;

						boolean isEvenNumber3 = result % 2 == 0;
			if(isEvenNumber3 == true) {
				System.out.println("����� " + result + " �������� ������");	
			}
			else if(isEvenNumber3 == false) {
				System.out.println("����� " + result + " �������� ��������");
			}

			System.out.println("�����: 1 + 2 + 3 + 4 + 5 = " + result);
	}
}