package lt.vcs.andrius.interfacepvz;

import java.util.ArrayList;
import java.util.List;

public class Bankas {

    List<Bankomatas> list = new ArrayList<>();



    /*public void pridėkBankomata(Bankomatas bankomatas){
        list.add(bankomatas);


    }*/

    public void pridėkBankomata(Bankomatas bankomatas){
        list.add(bankomatas);

   // BankomatasX x = new BankomatasX();

    }

    public void issimkVisusPinigus(Bankomatas bankomatas){
        bankomatas.atiduokPinigu(99999999);

    }

    public void sukurkBankoKlienta(){
       pridėkBankomata(new BankomatasA());
        pridėkBankomata(new BankomatasA());
        pridėkBankomata(new BankomatasA());
        //pridėkBankomata(new BankomatasX());
    }
}
