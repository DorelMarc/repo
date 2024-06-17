public class Exerc03ExtraClass {
    public static void main(String[] args) {

//
//        Exercitiul 1
//        Declarati o variabila de tip int, cu numele “temperature” si dati-i o valoare la alegere.
//        Daca valoarea ei este mai mica decat 18, afisati “prea frig”. Daca valoarea este intre 18 si 22,
//                afisati “ok”. Daca valoarea este peste 22, afisati “prea cald”.


        int temperature=34;
        if(temperature<18)
            System.out.println("prea frig");
        else if (temperature>18) { if (temperature<22)
            System.out.println("ok");
            else System.out.println("prea cald");

        }


//        Exercitiul 2
//        Se dau doua variabile:
//        char gender (gen) – initializati cu o valoare la alegere (posibile valori „m‟ sau „f‟)
//        boolean married (casatorit/a) - initializati cu o valoare la alegere
//        Scrieti un program folosind instructiuni conditionale, astfel incat
// pentru gen „m‟, sa afiseze “Domnul”, indiferent daca persoana e casatorita sau nu
// pentru gen „f‟ sa afiseze “Domnisoara”, daca nu e casatorita sau “Doamna”, daca e
//        casatorita

char gen='f';
        String titlu;
        boolean married=false;
        if (gen=='m')
            titlu ="Domnul";
        else if (married==false){
        titlu= "Domnisoara";}
        else titlu= "Doamna";
        System.out.println(titlu);


//        Exercitiul 3
//        Declarati si initializati doua variabile de tip int.
//                Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele doua: “[x] este
//        mai mare decat [y]”, unde x si y sunt valorile variabilelor.
//                Daca cele doua sunt egale, programul trebuie sa afiseze “sunt egale”.

int d=5;
int e=40;
if(d<e)
    System.out.println(e +" mai mare decat "+ d);
else if (d>e)
    System.out.println(d+" mai mare decat "+e);
    else System.out.println("sunt egale");




//        Exercitiul 4
//        Declarati o a treia variabila.
//                Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele 3.

int t=0;

if (d>e && d>t)
    System.out.println(d);
else if (d>e && d<t)
    System.out.println(t);
else System.out.println(e);






//        Exercitiul 5 – IF
//        Declarati o variabila de tip char cu numele letter si dati-i o valoare la alegere.
//        Daca valoarea este consoana, afisati “[letter] este consoana”, daca este vocala, afisati “[letter]
//        este vocala”, unde letter e valoarea variabilei.

//char letter='v';
//if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=="u") {
//    System.out.println("vocala");
//} else System.out.println("consoana");






    }
}
