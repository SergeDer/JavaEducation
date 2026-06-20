import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final double KZTS_PER_RUBLE = 7.40; //Тенге за рубль
        int amountKzt, amountRubCops;
        int amountRub, amountCops;
        String rubles, cops;
        int rub100, rub10;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму в тенге: ");
        amountKzt = input.nextInt();
        amountRubCops = (int) (amountKzt * 100 / KZTS_PER_RUBLE + 0.5);

        amountRub = amountRubCops / 100;
        amountCops = amountRubCops % 100;
      
        // if (List.of(11, 12, 13, 14).contains(amountRub % 100) || List.of(5, 6, 7, 8, 9, 0).contains(amountRub % 10))
        //     rubles = "рублей";
        // else if (List.of(2, 3, 4).contains(amountRub % 10))
        //     rubles = "рубля";
        // else 
        //     rubles = "рубль";

        if (amountCops % 100 >= 11 && amountCops % 100 <= 14)
            cops = "копеек";
        else if (amountCops % 10 >= 2 && amountCops % 10 <= 4)
            cops = "копейки";
        else if (amountCops % 10 == 1)
            cops = "копейка";
        else
            cops = "копеек";

        if (amountRub % 100 >= 11 && amountRub % 100 <= 14)
            rubles = "рублей";
        else if (amountRub % 10 >= 2 && amountRub % 10 <= 4)
            rubles = "рубля";
        else if (amountRub % 10 == 1)
            rubles = "рубль";
        else
            rubles = "рублей";
        

        System.out.printf("%d тенге = %d %s %d %s", amountKzt, amountRub, rubles, amountCops, cops);

        input.close();
    }
}
