package parte1;

import java.util.ArrayList;

public class PrintService<T> {
    private ArrayList<T> values = new ArrayList<>();

    public void addValue(T value){
        this.values.add(value);
    }

    public T first(){
        return this.values.get(0);
    }

    public void print(){
        StringBuilder result = new StringBuilder("[");

        result.append(this.first());

        for (int i = 1; i < this.values.size(); i++){
            result.append("," + this.values.get(i));
        }

        result.append("]");

        System.out.println(result);
    }
}
