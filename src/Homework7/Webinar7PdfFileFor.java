package Homework7;

public class Webinar7PdfFileFor {
    public static void main(String[] args) {

        //1.a
        for(int i=1; i<=100; i++) {
            System.out.println(i);
        }


        //1.b

        for(int i=1000; i<=1020; i++) {
            System.out.printf("%d, ", i);
        }

        //1.c
        for(int i=-30; i<=1000; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }

        //1.d

        for(int i=1; i<=100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }



        //1.e

        for(int i=30; i<=300; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }

        //1.f
        for(int i=-300; i<=300; i++) {
            if (i % 2 != 0 )
                System.out.printf("%d; ", i);
        }

        //1.g
        for(int i=-100; i<=100; i++) {
            if (i % 2 == 0 )
                System.out.printf("%d; ", i);

        }

        //1.h / dlaczego a mi zabrało do góry?

        //jak dam   System.out.printf("%d; \n", i); to po każdej cyfrze mi robi enter a nie tylko na końcu

        for(char i='a'; i<='z'; i++) {
            System.out.println(i);
        }

        //1.i
        for(char j='A'; j<='Z'; j++) {
            System.out.println(j);
        }
        //1.j
        for(char j='A'; j<='Z'; j++) {
            if (j % 2 == 0)
                System.out.println(j);
        }

        //1.k. nie wiem :(

        //1.l Jak ten index wydrukowac?
        for(char k=1; k<=10; k++) {
            System.out.println("Hello World");
        }
    }
}

