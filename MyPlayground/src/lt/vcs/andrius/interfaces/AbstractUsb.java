package lt.vcs.andrius.interfaces;

public abstract class AbstractUsb {

    public abstract void connect();

    public abstract void disconnect();

    public void transferData(){
        System.out.println("Transferring..");
        System.out.println("Transferred!");
    }


}
