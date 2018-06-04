package lt.vcs.andrius.play;


public class Test2 {

    public static void main(String argv[]) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("abc" == "abc");
        System.out.println(new String("abc") == "abc");
        System.out.println(new String("abc") == new String("abc"));


    }
}
