package OctocatF;

public class Scubatocat extends Octocat{
    Scubatocat(String nombre,String vestimenta,int numerodeoctocat){
        super(nombre,vestimenta,numerodeoctocat);
    }


    @Override

    public void quehace(){
        System.out.println("bucea en aguas profundas");
    }

}
