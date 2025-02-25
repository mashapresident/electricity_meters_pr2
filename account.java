import java.util.HashMap;
import java.util.Map;

public class account {
    private int id;
    private Map<String, indicator> indicators;

    public account(int id) {
        this.id = id;
        this.indicators = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void addIndicator(indicator indicator) {
        indicators.put(indicator.getMeterId(), indicator);
    }

    public indicator getIndicator(String meterId) {
        return indicators.get(meterId);
    }

    public void updateIndicator(String meterId, int newDayReading, int newNightReading) {
        if (indicators.containsKey(meterId)) {
            indicators.get(meterId).updateReadings(newDayReading, newNightReading);
        } else {
            System.out.println("Лічильник не знайдено.");
        }
    }

    public void printIndicators() {
        for (indicator indicator : indicators.values()) {
            System.out.println("Лічильник: " + indicator.getMeterId() +
                               ", День: " + indicator.getDayReading() +
                               ", Ніч: " + indicator.getNightReading());
        }
    }
}
