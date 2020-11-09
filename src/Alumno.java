import java.util.Scanner;

public class Alumno extends Thread{
    Scanner sc = new Scanner(System.in);
    double sleepingTime;
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.list) {
                    for (int i = 0; i <= 10; i++) {
                        System.out.println("Alumno "+Main.list.get(i)+" ha llegado");
                        System.out.println("Alumno "+Main.list.get(i)+" espera a que el profesor le desinfecte");
                        Main.list.notify();
                        Main.list.wait();
                        llegaTarde();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void llegaTarde(){
        boolean llegaTarde = sc.nextBoolean();
        if(!llegaTarde){
            sleepingTime = sc.nextInt(4000);
        }else{
            sleepingTime = sc.nextInt(20000) + 5000;
        }
    }
}
