package lt.vcs.andrius.picosaparatas;

import lt.vcs.andrius.PicosAparatoInterfaces.IPicosAparatas;
import lt.vcs.andrius.PicosAparatoInterfaces.Pica;
import lt.vcs.andrius.PicosAparatoInterfaces.Produktai;
import lt.vcs.andrius.PicosAparatoInterfaces.Receptas;

public class Main {



    public static void main(String argv[]){

        IPicosAparatas picosAparatas = new PicosAparatas(new Produktai(99,99,99,99,99));

        System.out.println(picosAparatas.gaminkPica("andriaus", 5));
        System.out.println(picosAparatas.gaminkPica("surio", 5));
        System.out.println(picosAparatas.gaminkPica("desros", 5));
        System.out.println(picosAparatas.gaminkPica("!!!!", 5));




    }
}
