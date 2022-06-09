package OctocatF;

public class Ironcat extends Octocat{
    Ironcat(String nombre, String vestimenta, int numerodeoctocat){
        super(nombre,vestimenta,numerodeoctocat);
    }

    @Override
    public void quehace() {
        System.out.println("tiene el poder de iron man en version octocat");
    }
}
