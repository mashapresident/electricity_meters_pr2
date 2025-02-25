class indicator {
    private String meterId;
    private int dayReading;
    private int nightReading;

    public indicator(String meterId, int dayReading, int nightReading) {
        this.meterId = meterId;
        this.dayReading = dayReading;
        this.nightReading = nightReading;
    }

    public String getMeterId() {
        return meterId;
    }

    public int getDayReading() {
        return dayReading;
    }

    public int getNightReading() {
        return nightReading;
    }

    public void updateReadings(int newDayReading, int newNightReading) {
        this.dayReading = newDayReading;
        this.nightReading = newNightReading;
    }
}
