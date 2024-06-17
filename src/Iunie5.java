public class Iunie5 {
    public static void main(String[] args) {


//        Declarați un șir de numere întregi (ex. 1, -25, 34, -2, 67, 5)
        int number[]={1, -25, 34, -2, 67, 5};




//        Scrieți un program care să afișeze doar vecinii numerelor din șir (ex. în loc de 1 afișați 0 și 2; în loc de -25 afișați -26 și -24; etc)
//        for (int n :number) {
//            System.out.println((n-1)+" "+(n+1));
//
//        }




//        Scrieți un program care să afișeze numerele negative din șir

//        for (int n:number)
//        {
//            if (n < 0) System.out.println(n);
//        }








//        Declarați un șir de țări cu 8 elemente (ex. Anglia, România, Albania, Franța, Elveția, China, SUA, Australia)

String[] tari={"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};





//        Scrieți un program care să afișeze inițiala fiecărei țări

//        char init;
//    for (String n:tari) {
//        String cuv = n;
//        init = cuv.charAt(0);
//        System.out.println(init);
//    }




//        Scrieți un program care să afișeze numai țările care încep cu litera “A”

//        for (String t:tari)
//            if (t.charAt(0)=='A')
//                System.out.println(t);




//        Scrieți un program care să afișeze numărul de litere pentru fiecare țara

//for (String t:tari)
//    System.out.println(t.length());



//        Scrieți un program care să afișeze țara cu cel mai lung nume

//int max=number[0];
//for (int n:number)
//    if (n>max)
//        max=n;
int max=tari[0].length();
String taralung= tari[0];
        for (String t:tari) {
            if (max<t.length()){
                max=t.length();
            taralung=t;}
        }
            System.out.println(taralung);




//        Scrieți un program care să afișeze țara cu cel mai scurt nume

        int min=tari[0].length();
        String tarascurt= tari[0];
        for (String t:tari) {
            if (min>t.length()){
                min=t.length();
                tarascurt=t;}
        }
        System.out.println(tarascurt);





    }
}
