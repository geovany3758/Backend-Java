package HarryF;

public class Personajes {

    private String  nombre,casa,genero,boggart, patronus;

  Personajes(){}



    Personajes(String nombre,String casa,String genero, String boggart, String patronus){
        this.nombre=nombre;
        this.casa=casa;
        this.genero=genero;
        this.boggart=boggart;
        this.patronus=patronus;

    }


    public String getNombre(){return nombre;}
    public String getCasa(){return casa;}
    public String getGenero(){return genero;}
    public String getBoggart(){return boggart;}
    public String getPatronus(){return patronus;}


    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }


    public boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa=casa;
            return true;
        }else
            return false;
    }



    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }



    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart=boggart;

            return true;
        }else
            return false;
    }



    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }



   public String showMessage(){


        return "nombre:"+nombre+"\n"+"genero:"+genero+"\n"+"casa:"+casa+"\n"+"boggart:"+boggart+"\n"+"patronus:"+patronus;




   }




}



