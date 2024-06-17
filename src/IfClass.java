public class IfClass {
    public static void main(String[] args) {

//        int time= 21;
//        if (time>18)
//            System.out.println("good evening!");
//        else System.out.println("Good day");
//
//        int dayNumber=9;
//        switch(dayNumber){
//        case 1: System.out.println("Luni"); break;
//            case 2:
//                System.out.println("Marti"); break;
//            case 3:
//                System.out.println("Miercuri"); break;
//            case 4:
//                System.out.println("Joi"); break;
//            case 5:
//                System.out.println("Vineri"); break;
//            case 6:
//                System.out.println("Sambata"); break;
//            case 7:
//                System.out.println("Duminica"); break;
//            default:
//                System.out.println("Ziua nu este valida");
//    }
//
//
    for (int i=0; i<8; i++){
        if(i==4) continue;
       else System.out.println("i= " +i);
    }
    int d=0;
while (d<5) {
    System.out.println(d);
    d++;
}
        System.out.println(d);
do {
    System.out.println(d);
    d++;
}
while (d<8);

        System.out.println(d);



    }
}
