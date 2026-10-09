package benakka.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history=new ArrayList<>();
    @Override
    public void update(int newSate) {
        history.add(newSate);
        double sum=0;
        for (int i = 0; i < history.size(); i++) {
            sum+=history.get(i);
        }
        System.out.println("Moyenne = "+sum/history.size());
    }
}
