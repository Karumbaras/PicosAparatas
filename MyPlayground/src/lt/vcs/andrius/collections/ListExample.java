package lt.vcs.andrius.collections;

import lt.vcs.andrius.picosaparatas.AndriausPica;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExample {



    public static void main(String argv[]) {
        List<Skaicius> list = new ArrayList();

        list.add(new Skaicius(9));
        list.add(new Skaicius(11));
        list.add(new Skaicius(5));

        list.remove(new Skaicius(9));

        for(Skaicius sksk : list){
            System.out.println(sksk);
        }



       /* List<String> list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(">" + list.get(i));
        }

        list.remove(new String("A"));
        //list.remove(0);

        for (Object o : list) {
            String str = (String) o;
            System.out.println(">" + str.trim());
        }
        //System.out.println(list);*/
    }
}

class Skaicius{
    public int sk;
    public Skaicius(int sk){
        this.sk = sk;
    }

    @Override
    public String toString() {
        return "Skaicius{" +
                "sk=" + sk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skaicius skaicius = (Skaicius) o;
        return sk == skaicius.sk;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sk);
    }
}
