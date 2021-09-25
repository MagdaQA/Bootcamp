package Homework6;
import java.util.ArrayList;


//Poprawić zadanie z gwiazdką z webinaru nr 4: zadanie dodatkowe: wyświetl wszystkie indeksy wystąpienia litery 'ę'.
// Wykorzystująć for / if / toCharArray

public class Webinar6Zad1 {
    public static void main(String[] args) {
        String text = "Uczę się Java i chcę automatyzować testy";

        char[] zmianaNaChar = text.toCharArray();

            for (int i = 0; i <= zmianaNaChar.length; i++) // przejście przez tablicę


                if (zmianaNaChar[i] == 'ę')

                    System.out.println(i);

        }


    }