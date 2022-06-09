package SpiderverseF;

import imonsh.Screen;

public class Spider_man{
    int tierra;
    String nombre;
    String traje;
    String genero;



    public int getTierra(){return  tierra;}
    public String getNombre(){return nombre;}
    public String getTraje(){return traje;}
    public String getGenero(){return genero;}


    Spider_man(int tierra, String nombre, String traje, String genero){
        this.tierra=tierra;
        this.nombre=nombre;
        this.traje=traje;
        this.genero=genero;
    }



    public  boolean setTierra(int tierra){
        if (tierra>0){
            this.tierra=tierra;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return  false;
    }


    public boolean setTraje(String traje){
        if (!traje.isEmpty()){
            this.traje=traje;
            return true;
        }else
            return  false;
    }


    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return  false;
    }





    public  String  showMessage(){


        return    "\n"+"Tierra:"+tierra+"\n"+"nombre:"+nombre+"\n"+"traje:"+traje+"\n"+ "genero:"+genero+"\n";
    }



}










