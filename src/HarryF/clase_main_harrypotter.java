package HarryF;

public class clase_main_harrypotter {

    public static void main(String[] args) {
        harryM();
        ronM();
        germioneM();
        lordvoldemortM();
        dracoM();














    }

    private static void  harryM(){
        Personajes harry=new Personajes("Harry Potter","Gryffindor","Masculino","Dementor","ciervo");
        System.out.println("*******************************************************************************************************************************************************************************");


        System.out.println(harry.showMessage());

        System.out.println("*******************************************************************************************************************************************************************************");

    }

    private static void  ronM(){
        Personajes RonWeasley= new Personajes();
        RonWeasley.setNombre("Ron Weasley");
        RonWeasley.setPatronus("Masculino");
        RonWeasley.setBoggart("Griffindor");
        RonWeasley.setGenero("Arana Gigante");
        RonWeasley.setCasa("Jack Russell Terrier");

        System.out.println(RonWeasley.showMessage());

        System.out.println("*******************************************************************************************************************************************************************************");



    }

    private static void germioneM(){

        Personajes germaione=new Personajes("Germione Granger","Griffindor","Femenino","El fracaso","Nutria");
        System.out.println("nombre:"+germaione.getNombre());
        System.out.println("casa:"+germaione.getCasa());
        System.out.println("genero:"+germaione.getGenero());
        System.out.println("boggart:"+germaione.getBoggart());
        System.out.println("patronus:"+germaione.getPatronus());
        System.out.println("*******************************************************************************************************************************************************************************");



    }


    private static  void  lordvoldemortM(){

        Personajes lordvoldemort=new Personajes();

        lordvoldemort.setNombre("lord voldemort");
        lordvoldemort.setCasa("Slytherin");
        lordvoldemort.setGenero("Masculino");
        lordvoldemort.setBoggart("a morir");
        lordvoldemort.setPatronus("Nagini(serpiente)");


        System.out.println("nombre:"+lordvoldemort.getNombre());
        System.out.println("casa:"+lordvoldemort.getCasa());
        System.out.println("genero:"+lordvoldemort.getGenero());
        System.out.println("boggart:"+lordvoldemort.getBoggart());
        System.out.println("patronus:"+lordvoldemort.getPatronus());
        System.out.println("*******************************************************************************************************************************************************************************");








    }

    private static void dracoM(){

        Personajes draco=new Personajes("Draco Malfoy","Slytherin","Masculino","Lord Voldemort","no tiene");
        System.out.println(draco.showMessage());
        System.out.println("*******************************************************************************************************************************************************************************");


    }






}
