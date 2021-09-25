package Homework7;

public class Webinar7PdfFileWhile {
    public static void main(String[] args) {

        //1.a

        int i = 1;
        while (i<=100) {
            System.out.println(i);
            i++;
        }

        //1.b
        int j = 1000;
        while (j<=1020) {
            System.out.printf("%d, ", j);
            j++;
        }

      //1.c
        // niestety nie działa i nie wiem dlaczego
        int k = -30;
     //czy ta linia nie mówi: jeśli k jest mniejsze lub równe 1000 i podzielne przez 5, to wydrukuj?

        while (k<=1000 && k % 5 == 0) {
            System.out.println(k);
            k++;
        }

        //1.d - i to samo jak wyżej tylko nawet 1 nie wydrukowało
        int l = 1;

        while (l<=100 && l % 3 == 0) {
            System.out.println(l);
            l++;
        }
    }
}

