import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double KZTS_PER_RUBLE = 7.40; //Тенге за рубль
        int amountKzt;
        double amountRub;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму в тенге: ");
        amountKzt = input.nextInt();
        amountRub = amountKzt / KZTS_PER_RUBLE;

        int amountRubRubs = (int) amountRub;
        int amountRubCops = (int) ((amountRub - ((double) amountRubRubs)) * 100);

        System.out.printf("%d тенге = %d рублей %d копеек", amountKzt, amountRubRubs, amountRubCops);

        input.close();
    }
}
