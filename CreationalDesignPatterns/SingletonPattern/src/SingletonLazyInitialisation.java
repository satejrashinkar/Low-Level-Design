public class SingletonLazyInitialisation {
    private SingletonLazyInitialisation(){
        System.out.println("Inside ctor of SingletonLazyInitialisation class, Instance created");
    }

    private static class Holder{
        private static final SingletonLazyInitialisation INSTANCE = new SingletonLazyInitialisation();
    }

    public static SingletonLazyInitialisation getInstance(){
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(()->{SingletonLazyInitialisation.getInstance();});
        Thread th2 = new Thread(()->{SingletonLazyInitialisation.getInstance();});

        th1.start();
        th2.start();
    }
}
