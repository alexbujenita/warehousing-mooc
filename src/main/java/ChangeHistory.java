
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alex.bujenita
 */
public class ChangeHistory {

    private final ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        return Collections.max(this.history);
    }

    public double minValue() {
        return Collections.min(this.history);
    }

    public double average() {
        OptionalDouble avgOptional = this.history.stream()
                .mapToDouble(a -> a)
                .average();
        return avgOptional.orElse(0);
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
