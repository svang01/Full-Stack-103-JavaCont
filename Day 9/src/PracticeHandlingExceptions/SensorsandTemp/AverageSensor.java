package PracticeHandlingExceptions.SensorsandTemp;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensors.stream().findAny().ifPresent(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Sensors are off or no sensors were added");
        }

        Integer reading = (int) this.sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .getAsDouble();

        this.readings.add(reading);

        return reading;
    }

    public List<Integer> readings() {
        return this.readings;
    }

}