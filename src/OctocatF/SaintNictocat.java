package OctocatF;

public class SaintNictocat extends Octocat{

    SaintNictocat(String nombre, String vestimenta, int numerodeoctocat){
        super(nombre,vestimenta,numerodeoctocat);
    }

    @Override
    public  void quehace(){
        System.out.println("alegra la navidad santa version octocat");
    }
}
