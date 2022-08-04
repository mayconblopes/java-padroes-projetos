package one.digitalinnovation.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private void SingletonLazy() {
    }

    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
