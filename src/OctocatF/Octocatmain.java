package OctocatF;

public class Octocatmain {

    public static void main(String[] args) {

        octocatoriginalM();
        SurftocatM();
        IroncatM();
        SaintNictocatM();
        ScubatocatM();

    }


    public static  void octocatoriginalM(){

        Octocat octocatoriginal=new Octocat("octocat","original",1);

        System.out.println(octocatoriginal.showMessage());
        octocatoriginal.quehace();

        System.out.println("*********************************");
    }


    public static  void SurftocatM(){


        Surftocat surftocat=new Surftocat("surfocat","tabla surf",162);


        System.out.println(surftocat.showMessage());

        surftocat.quehace();
        System.out.println("**********************************");


    }


    public static  void IroncatM(){

        Ironcat ironcat=new Ironcat("ironcat","traje de iron-man",24);
        System.out.println(ironcat.showMessage());
        ironcat.quehace();
        System.out.println("************************************");

    }




    public static  void SaintNictocatM(){


        SaintNictocat saintNictocat=new SaintNictocat("SaintNictocat","traje de santa y bolsa de regalos",130);

        System.out.println(saintNictocat.showMessage());
        saintNictocat.quehace();

        System.out.println("*************************************+");

    }



    public static  void ScubatocatM(){
        Scubatocat scubatocat=new Scubatocat(" Scubatocat","traje de buceo y tanque de oxigeno",136);
        System.out.println(scubatocat.showMessage());
        scubatocat.quehace();

    }




}
