package Hilos;

public class PrintMe implements Runnable {

    Thread t;
    String nombre;

    public PrintMe()
    {
        t = new Thread(this,"Hilo 1");
        t.start();
    }

    public PrintMe(String nombre)
    {
        this.nombre = nombre;
        t = new Thread(this,"Hilo 1");
        t.start();
    }

    public void run()
    {
        try{
            for(int i = 1; i<10;i++)
            {
                System.out.println("Numero: "+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException  e){};
    }
}
