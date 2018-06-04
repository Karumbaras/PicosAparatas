package lt.vcs.andrius.collections;

import lt.vcs.andrius.PicosAparatoInterfaces.Pica;
import lt.vcs.andrius.picosaparatas.AndriausPica;
import lt.vcs.andrius.picosaparatas.SurioPica;

import java.util.*;

public class MapExample {



    public static void main(String argv[]) {
        Map<String, Pica> stringMap = new HashMap();

        stringMap.put("pirmas", new AndriausPica());
        stringMap.put("aaaaaaaa", new SurioPica());


        //System.out.println(stringMap);


        System.out.println(stringMap.get("peperoni"));



    }
}



