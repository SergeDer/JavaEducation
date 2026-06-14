import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {        
        //Константы
        final int NUMBER_OF_MONTHS_IN_YEAR = 12; //Количество месяцев в году
        //Вход
        double yearRate; //Процентная годовая ставка
        double amount; //Сумма кредита
        int yearTerm; //Срок кредита в годах
        //Выход
        double monthlyPayment; // Ежемесячный платёж
        double loanCost; //Стоимость кредита
        //Промежуточные переменные
        double monthlyRate; //Ежемесячная процентная ставка (в долях)
        int monthlyTerm; //Срок кредита в месяцах
        double discont; //Дисконтирующий к

        System.out.println("Введите:\n1. Годовую процентную ставку\n" +
        "2. Сумму кредита\n3. Срок кредита в годах\n");

        Scanner input = new Scanner(System.in);
        yearRate = input.nextDouble();
        amount = input.nextDouble();
        yearTerm = input.nextInt();

        monthlyRate = yearRate / (NUMBER_OF_MONTHS_IN_YEAR * 100);
        monthlyTerm = yearTerm * NUMBER_OF_MONTHS_IN_YEAR;
        
        discont = 1 / pow((1 + monthlyRate), monthlyTerm);

        monthlyPayment = (amount * monthlyRate) / (1 - discont);
        loanCost = monthlyPayment * monthlyTerm;

        System.out.printf("Ежемесячный платёж: %.2f\nСтоимость кредита: %.2f", monthlyPayment, loanCost);

        input.close();
    }
}
