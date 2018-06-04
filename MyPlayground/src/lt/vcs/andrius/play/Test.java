package lt.vcs.andrius.play;

public class Test {

    public static void main(String argv[]) {

        long sk3 = Long.MAX_VALUE;
        long sk4 = sk3 - 6854775807L;
        // floag 6-7 skaičiai
        // double 12?

        System.out.println(sk3);
        System.out.println(sk4);

        float sk5 = (float) sk3;
        float sk6 = (float) sk4;

        System.out.println(sk5);
        System.out.println(sk6);




        System.out.println((long) sk5);
        System.out.println((long) sk6);





    }
}
