import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final double CENTIMETERS_IN_METER = 100;
		//Вход
		int lengthMeters; //рост, часть в метрах
		int lengthCentimeters; //рост, часть в сантиметрах
		double weight; //вес
		//Промедуточные переменные
		double length; //рост в метрах
		//Выход
		double imt; //ИМТ
		String conclusion; //заключение
		
		Scanner input = new Scanner(System.in);
		lengthMeters = input.nextInt();
		lengthCentimeters = input.nextInt();
		weight = input.nextDouble();
		
		length = lengthMeters + lengthCentimeters / CENTIMETERS_IN_METER;
		
		imt = weight/ (length * length);
		
		if (imt < 18.5)
		    conclusion = "Недостаточный вес";
		else if (imt < 25.0)
		    conclusion = "Норма";
		else if (imt < 30.0)
		    conclusion = "Избыточный вес";
		else
		    conclusion = "Ожирение";
	
		System.out.printf("ИМТ: %.2f, Заключение: %s", imt, conclusion);
		input.close();
	}
