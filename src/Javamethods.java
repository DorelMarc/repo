public class Javamethods {
    public static void main(String[] args) {
//       afiseazaCeva();
//       afiseazaCeva();
//hellonume("Mihail");
//hellonume("Dorel");
//hellonumber(2);
//hellonumber(45);
//numeVarsta("Dorel", 32);
//numeVarsta("Ana", 23);
//diferenta(3,4);
//diferenta(65,34);
//produs(2,5);
//produs(-4, 5);
avs(23);

    }



//    private static void  afiseazaCeva(){
//        System.out.println("Helllo world");
//    }
//    private static void hellonume(String nume)
//    {
//        System.out.println("hello "+nume);
//    }
//
//    private static void hellonumber(int number)
//    {
//        System.out.println("hello "+number);
//    }
//    private static void numeVarsta(String nume, int numar)
//    {
//        System.out.println("Ma numesc "+nume +" si am "+numar);
//    }
//    private static void diferenta(int n, int m)
//    {
//        System.out.println(n-m);
//    }
//    private static void produs(int n, int m)
//    {
//        System.out.println(n*m);
//    }

    private static void learningcode(String limbajProgramare) {
        System.out.println("it's easy to learn "+ limbajProgramare);
    }

//    private static void primu (String cuvant) {
//        if (cuvant.charAt(0)=='a' || cuvant.charAt(0)=='e' || cuvant.charAt(0)=='i' || cuvant.charAt(0)=='o' || cuvant.charAt(0)=='u') {
//            System.out.println("Cuvantul incepe cu o vocala");}
//        else System.out.println("Cuvantul incepe cu o consoana");
//
//        }
//    }


    private static void avs(int varsta){
        if(varsta<18)
            System.out.println("too young");
        else if (varsta>=18 &&varsta<60)
            System.out.println("just fine");
            else System.out.println("too old");

    }
}





