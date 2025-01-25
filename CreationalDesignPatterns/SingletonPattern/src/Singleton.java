public class Singleton {

     private static Singleton instance;

    private Singleton() {
        System.out.println("Inside ctor of Singleton class, Instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(()->{Singleton.getInstance();});
        Thread th2 = new Thread(()->{Singleton.getInstance();});

        th1.start();
        th2.start();
    }
}
