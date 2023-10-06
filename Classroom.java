public class Classroom {

    public static void main(String[] args) {

        Wilder kev = new Wilder("kev", true);
        Wilder kev2 = new Wilder("kev2", false);
        Wilder kev3 = new Wilder("kev3", true);

        System.out.println(kev.whoAmI(kev));
        System.out.println(kev2.whoAmI(kev2));
        System.out.println(kev3.whoAmI(kev3));
    }
}
