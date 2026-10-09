package benakka;

import benakka.obs.ObservableImpl;
import benakka.obs.Observer;
import benakka.obs.ObserverImpl1;
import benakka.obs.ObserverImpl2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);

        observable.subscribe((newSate) -> {
                System.out.println("++++++++++++ Obs Impl 3 ++++++++");
                System.out.println("Res = "+ newSate * Math.cos(newSate));
                System.out.println("++++++++++++++++++++++++++++++++");
        });

        observable.setState(60);
        observable.setState(80);
        observable.setState(100);
    }
}
