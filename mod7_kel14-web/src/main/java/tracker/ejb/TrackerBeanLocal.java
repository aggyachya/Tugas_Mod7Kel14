// TrackerBeanLocal.java
package tracker.ejb;

import jakarta.ejb.Local;
import java.util.List;

@Local
public interface TrackerBeanLocal {
    public double add(double value);
    public double average();
    public int getCount();
    public double getTotal();
    public List<Double> getInputs();
    public double getMaxValue();
    public double getMinValue();
}
