class JavaMethods2 {
    public static void main(String[] args) {



        System.out.println(sum(5,10));
        System.out.println(concatenareStrings("Dorel", "Marc"));
        System.out.println(adouaLitera("Daniel"));









    }


    private static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    private static String concatenareStrings(String a, String b){
        String concat=a+b;
        return concat;
    }
    private static char adouaLitera(String cuvant){
        return cuvant.charAt(1);
    }

}