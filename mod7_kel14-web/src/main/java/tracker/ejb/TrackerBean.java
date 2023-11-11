/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
// TrackerBean.java
package tracker.ejb;

import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Stateful
public class TrackerBean implements TrackerBeanLocal {
    private double total = 0;
    private int count = 0;
    private List<Double> inputs = new ArrayList<>();

    @Override
    public double add(double value) {
        total += value;
        count += 1;
        inputs.add(value); // Menambahkan nilai ke daftar inputs
        return total;
    }

    @Override
    public double average() {
        return total / count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public List<Double> getInputs() {
        return inputs;
    }
    
    @Override
    public double getMaxValue() {
        if (!inputs.isEmpty()) {
            return Collections.max(inputs);
        }
        return 0;
    }

    // Fungsi baru untuk mendapatkan nilai terkecil dari inputan
    @Override
    public double getMinValue() {
        if (!inputs.isEmpty()) {
            return Collections.min(inputs);
        }
        return 0;
    }
}
