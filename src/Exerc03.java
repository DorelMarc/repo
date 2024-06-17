public class Exerc03 {
    public static void main(String[] args) {



       // Scrieți un program care afișează numerele întregi de la 0 până la 10 (inclusiv).

        int a=0;
        while (a<=10) {
            System.out.println(a);
            a++;
        }



       //Scrieți un program care afișează numerele întregi de la 20 până la 10 (inclusiv) în ordine descrescătoare.
        int b=20;
        while (b>=10){
            System.out.println(b);
            b--;
        }




       // Scrieți un program care afișează toate numerele pare pozitive până la 100 (inclusiv)
        int c=0;
        while (c<=100){
            System.out.println(c);
            c+=2;
        }




        //Se dă un șir cu următoarele elemente: mere, căpșuni, pere, banane. Scrieți un program
        // care s afișează pentru fiecare fruct: “Îmi place să mananc [numeFruct]”, unde numeFruct
        // reprezintă fiecare fruct din șir.


        String [] elem= {"mere", "capsuni", "pere", "banane"};
        for (String f: elem)
            System.out.println("Imi place sa mananc "+f);





        //Scrieți un program care să afișeze numele lunii în funcție de un număr întreg dat de la 1-12.
        // Ex: 1 -> Ianuarie, 2-> Februarie, 3-> Martie, etc.

        int nbM=1;
        switch (nbM) {
            case 1:
                System.out.println("Ianuarie"); break;
            case 2:
                System.out.println("Februarie"); break;
            case 3:
                System.out.println("Martie"); break;
            case 4:
                System.out.println("Aprilie"); break;
            case 5:
                System.out.println("Mai"); break;
            case 6:
                System.out.println("Iunie"); break;
            case 7:
                System.out.println("Iulie"); break;
            case 8:
                System.out.println("August"); break;
            case 9:
                System.out.println("Septembrie"); break;
            case 10:
                System.out.println("Octombrie"); break;
            case 11:
                System.out.println("Noiembrie"); break;
            case 12:
                System.out.println("Decembrie"); break;
            default:
                System.out.println("nu e numar de luna"); break;

        }

    }
}
