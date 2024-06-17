public class MyString {
    public static void main(String[] args) {
        String text="hello ";
        String nume="Dorel";
        String numeMare= nume.toUpperCase();
        String numeMic= nume.toLowerCase();
        String prop= "Ana are mere";
        double nr= prop.length();
        char primlet=prop.charAt(3);

        String filmulpref ="Filmul preferat \neste \"ascdsd\"";



        System.out.println(filmulpref);
        System.out.println(primlet);
        System.out.println(nr);
        System.out.println(numeMare);
        System.out.println(numeMic);
        System.out.println(text + nume);
    }
}
