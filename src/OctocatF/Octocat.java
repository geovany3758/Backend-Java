package OctocatF;

public class Octocat {
    public String nombre, vestimenta;
    public int numerodeoctocat;

    Octocat(){}



    Octocat(String nombre,  String vestimenta, int numerodeoctocat){
        this.nombre=nombre;
        this.vestimenta=vestimenta;
        this.numerodeoctocat=numerodeoctocat;
    }


    public String getNombre(){return nombre;}
    public String getVestimenta(){return vestimenta;}
    public int getNumerodeoctocat(){return numerodeoctocat;}
/*
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setPersonaje(String personaje){
        if(!personaje.isEmpty()){
            this.personaje=personaje;
            return true;
        }else
            return false;
    }

    public boolean setVestimenta(String vestimenta){
        if(!vestimenta.isEmpty()){
            this.vestimenta=vestimenta;
            return true;
        }else
            return false;
    }

    public boolean setNumerodeoctocat(int numerodeoctocat){
        if(numerodeoctocat>0){
            return true;
        }else
            return false;
    }

 */





    public  void quehace(){
        System.out.println("que hace:"+"saluda octogat original");
    }


    public  String showMessage(){
        return "Nombre: "+nombre+"\n"+"Vestimenta:" +vestimenta+"\n"+"Numero de octocat: "+numerodeoctocat;
    }




}




