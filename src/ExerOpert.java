public class ExerOpert {
    public static void main(String[] args) {

       /* Exercitiul 1 - in clasa Operators:
        Declarati patru variabile de tip int: var1, var2, var 3, var4 si initializati-le cu valori la alegere.
        Afisati suma lor.
        Afisati produsul lor.
        Afisati restul impartirii dintre var4 si var2 */
        int var1=1;
        int var2=20;
        int var3=200;
        int var4=900;

        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4%var2);



       /* Exercitiul 2 – in Operators:
        Incrementati var1 cu o unitate de 3 ori.
        Afisati var1 dupa cea de-a treia incrementare.*/

        for(int i=0; i<3; i++)
            var1=var1+1;
        System.out.println(var1);




       /* Exercitiul 3 – in Operators:
        Decrementati var2 cu doua unitati de 2 ori.
        Afisati var2 dupa cea de-a doua decrementare.*/


        for (int i=0; i<2; i++)
            var2=var2-2;
        System.out.println(var2);



        /* Exercitiul 4 – in Operators:
        Declarati doua variabile de tip boolean cond1 si cond2
        cond1 este adevarata daca suma celor 4 variabile de la Exercitiul 1 este mai mare decat 100.
        cond2 este adevarata daca produsul celor 4 variabile de la Exercitiul 1 este mai mare decat
        1000.
        Afisati cond1 si cond2 */

        boolean cond1=false;
        boolean cond2=false;
        if (var1+var2+var3+var4>100)
            cond1=true;
        if (var1+var2+var3+var4>1000)
            cond2=true;
        System.out.println(cond1);
        System.out.println(cond2);

        /*
        Exercitiul 5 – in Operators
        Evaluati si afisati daca ce putin una din conditiile cond1 si cond2 este adevarata.
        Evaluati si afisati daca ambele condtiii cond1 si cond2 sunt adevarate.
        Dupa completarea exercitiilor, selectati din Idea -> Git -> Commit (pentru salvarea
        schimbarilor) si apoi Git -> Push (pentru a actualiza commit-ul pe Github).*/

        if (cond1 || cond2)
            System.out.println("cel putin una este adevarata");
        if (cond1 && cond2)
            System.out.println("ambele sunt adevarate");


        /*
        1. Inmulţiţi 10 cu 6. Afişati rezultatul cu funcţia println. */

        System.out.println(10*6);

         /* 2. Impărţiţi 10 la 5. Afisati rezultatul. */

        System.out.println(10/5);


        /* 3. Folosiţi operatorul corect in loc de “…” pentru a incrementa valoarea lui x cu 1.
        Afișaţi rezultatul. int x = 10;  … x; */

        int x=10;
        ++x;
        System.out.println(x);





        /*4. Adaugaţi operatorul de atribuire in loc de “…” pentru a adăuga valoarea 5 variabilei x. Afişaţi rezultatul.
            int x = 10;
             x … 5;
         */

        x+=5;
        System.out.println(x);




        /*
        5. Declaraţi doua variabile de tip int si atribuiţi-le câte o valoare.
Declaraţi o variabila în care să stocaţi suma lor.
Dacă suma lor e mai mai mare sau egală cu 10, afişaţi “suma este mai mare decât 10”, altfel afişaţi
“suma este mai mică decât 10”.

         */
        int y=2;
        int z=8;
        int s=y+z;
        if (s>=10)
            System.out.println("suma e mai mare decat 10");
        else System.out.println("suma e mai mica decat 10");



        /*
        6. Pentru aceleaşi două numere, dacă suma e nr. par, afişaţi “suma este număr par”, altfel
        nu afişaţi nimic.

         */
        if (s%2==0)
            System.out.println("suma este numar par");
    }
}
