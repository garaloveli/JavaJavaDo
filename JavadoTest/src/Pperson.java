
public class Pperson {
    {
        personCount = 10;
    }
    static {
        personCount = 20;
    }
    private static int personCount = 1000;
    {
        personCount = 30;
    }
    static {
        personCount = 40;
    }
//    public static void main(String[] args) {
//        System.out.println(Pperson.personCount); 
//        Pperson p = new Pperson();
//        System.out.println(Pperson.personCount);
//        Pperson.personCount = 100; 
//        p = new Pperson();
//        System.out.println(Pperson.personCount);
//     }	
}
