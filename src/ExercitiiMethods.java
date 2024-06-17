import java.util.Arrays;

public class ExercitiiMethods {
    public static void main(String[] args) {

        text();
        System.out.println(par(6));
        System.out.println(anotimp("iaNUARIE"));
        System.out.println(max(43,44));
        System.out.println(maxime(2,8,8,8));
        System.out.println(paritate("acasat"));
        System.out.println(mijloc("Acasa"));
        System.out.println(sumCif(-23));



    }

//    Exercitiul 1:
//    Scrieti o metoda care nu primeste nimic si afiseaza textul “In sfarsit e vreme buna!”.
//    Apelati metoda in main().

    private static void text(){
        System.out.println("In sfarsit o vreme buna");
    }


//    Exercitiul 2:
//    Scrieti o metoda care primeste un numar si returneaza un rezultat de tip boolean. Daca
//    numarul e par returneaza true, altfel returneaza false.
//    Afisati rezultatul returnat de metoda in iinteriorul lui main().
    private static boolean par(int a) {
       boolean pare;
        if (a%2==0)
            pare=true;
        else pare=false;
        return pare;

    }



//    Exercitiul 3:
//    Scrieti o metoda care primeste o luna calendaristica si returneaza anotimpul din care face
//    parte.
//    Pentru martie, aprilie, mai -> primavara
//    Pentru iunie, iulie, august -> vara
//    Pentru septembrie, octombrie, noiembie -> toamna
//    Pentru decembrie, ianuarie, februarie -> iarna
//    Pentru orice altceva inafara de luna calendaristica -> unknown
//    Testati metoda in main cu date de test din toate clasele de echivalenta (ECP )

    private static String anotimp(String luna) {
        String [] primavara={"martie", "aprilie", "mai"};
        String [] vara={"iunie", "iulie", "august"};
        String [] toamna={"septembrie", "octombrie", "noiembrie"};
        String [] iarna={"decembrie", "ianuarie", "februarie"};
        String answer= "unknow";
        for (String a:primavara)
            if (luna.compareToIgnoreCase(a)==0)
            {answer = "primavara"; break;}
        for (String a:vara)
            if (luna.compareToIgnoreCase(a)==0)
            { answer ="vara"; break;}
        for (String a:toamna)
            if (luna.compareToIgnoreCase(a)==0)
            { answer="toamna"; break;}
        for (String a:iarna)
            if (luna.compareToIgnoreCase(a)==0)
            { answer="iarna"; break;}
                return answer;
    }

//    Exercitiul 4:
//    Scrieti o metoda care primeste doua numere si il returneaza pe cel mai mare din ele. In cazul
//    in care sunt egale, returnati oricare din ele.
//    Testati metoda.

private static int max(int a, int b){
       int maxim=a;
        if (a>b)
            maxim=a;
        else maxim=b;
        return maxim;

        }


//    Exercitiul 5:
//    Scrieti o metoda care primeste 4 numere si il returneaza pe cel mai mare din ele. In cazul in
//    care doua sau mai multe sunt eglale, returnati oricare din ele.
//    Testati metoda.

private static int maxime(int a, int b, int c, int d){
        int maxi=a;
        if (a>=b && a>=c && a>=d)
            maxi=a;
        if (b>=a && b>=c && b>=d)
            maxi=b;
        if (c>=a && c>=b && c>=d)
            maxi=c;
        if (d>=a && d>=b &&d>=c)
            maxi=d;
        return maxi;
}

//    Exercitiul 6:
//    Scrieti o metoda care primeste un String si returneaza true daca numarul de caractere din
//    Stringul respectiv este par.
//    Testati metoda.

    private static boolean paritate(String cuvant) {
        boolean pare= false;
        if(cuvant.length()%2==0)
            pare= true;
        return pare;
    }

//    Exercitiul 7:
//    Scrieti o metoda care primeste un cuvant si returneaza caracterul/caracterele din mijloc.
//    Daca are numar impar de litere, returnati litera din mijloc (casca -> s).
//    Daca are numar par de litere, returnati cele doua litere din mijloc (castel -> st).
//    Testati metoda.

private static String mijloc(String cuvant){
        if (cuvant.length()%2==0){
            int c=cuvant.length()/2;
            char [] d={cuvant.charAt(c-1) , cuvant.charAt(c)};
            String a= String.valueOf(d);
            return a;
        }
        else {
            char a = cuvant.charAt(cuvant.length() / 2);

            return String.valueOf(a);
        }
}

//    Exercitiul 8:
//    Scrieti o metoda care primeste un numar si returneaza suma cifrelor lui. Testati metoda.
    private static int sumCif(int b){
       int c=0;
        while (b>10 || b<-10){
           c=c+b%10;
           b=b/10;
       }
        if (b<10 && b>=0) c=c+b;
        return c;
    }






}
