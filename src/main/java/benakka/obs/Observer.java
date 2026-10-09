package benakka.obs;

@FunctionalInterface
public interface Observer {
    void update(Observable o);
}
