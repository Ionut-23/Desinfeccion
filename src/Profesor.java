public class Profesor extends Thread{
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.list){
                    Main.list.wait();
                    desinfectar();
                    Main.list.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void desinfectar() throws InterruptedException{
        int i = 0;
        System.out.println("El profesor empieza a desinfectar a Alumno "+i);
        sleep(1000);
        System.out.println("Alumno "+i+" desinfectado");
        Main.list.remove(i);
    }
}
