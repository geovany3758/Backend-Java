package comic;

import imonsh.Screen;

public class comicmain {

    public static void main(String[] args) {
        textcomic();
        imgcomic();

    }

    public  static void imgcomic(){
        Screen s=new Screen();
        imgquehace imgqh=new imgquehace();

        Runnable imgr=new Runnable() {
            @Override
            public void run() {
                try {
                    imgqh.img1(s);
                    Thread.sleep(3000);
                    imgqh.img2(s);
                    Thread.sleep(3000);
                    imgqh.img3(s);
                    Thread.sleep(3000);
                    imgqh.img4(s);
                    Thread.sleep(3000);
                    imgqh.img5(s);
                    Thread.sleep(3000);
                    imgqh.img6(s);
                    Thread.sleep(3000);
                    imgqh.img7(s);
                    Thread.sleep(3000);
                    imgqh.img8(s);
                    Thread.sleep(3000);
                    imgqh.img9(s);
                    Thread.sleep(3000);
                    imgqh.img10(s);
                    Thread.sleep(3000);
                    imgqh.img11(s);



                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };







        Thread principal=new Thread(imgr);
        principal.start();




    }

    public static void textcomic(){
        Screen s=new Screen();

        textquehace textobj=new textquehace();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    textobj.text1(s);
                    Thread.sleep(3000);
                    textobj.text2(s);
                    Thread.sleep(3000);
                    textobj.text3(s);
                    Thread.sleep(3000);
                    textobj.text4(s);
                    Thread.sleep(3000);
                    textobj.text5(s);
                    Thread.sleep(3000);
                    textobj.text6(s);
                    Thread.sleep(3000);
                    textobj.text7(s);
                    Thread.sleep(3000);
                    textobj.text8(s);
                    Thread.sleep(3000);
                    textobj.text9(s);
                    Thread.sleep(3000);
                    textobj.text10(s);
                    Thread.sleep(3000);
                    textobj.text11(s);




                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };


        Thread hil2=new Thread(runnable);
        hil2.start();





    }




}
