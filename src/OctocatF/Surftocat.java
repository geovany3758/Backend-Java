package OctocatF;

public class Surftocat extends Octocat{


    Surftocat(String nombre,  String vestimenta, int numerodeoctocat){
        super(nombre,vestimenta,numerodeoctocat);
    }

    @Override
    public void quehace(){
        System.out.println("Yo surfeo");
    }


}
