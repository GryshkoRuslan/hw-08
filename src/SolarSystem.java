public enum SolarSystem {
    MERCURY(0, null, 0),
    VENUS(1, SolarSystem.MERCURY, 10),
    EARTH(2, SolarSystem.VENUS, 20),
    MARS(3, SolarSystem.EARTH, 30),
    JUPITER(4, SolarSystem.MARS,40),
    SATURN(5, SolarSystem.JUPITER,50),
    URANUS(6, SolarSystem.SATURN,60),
    NEPTUNE(7, SolarSystem.URANUS,70);

    private final int ORDER;
    private final SolarSystem PREVIOUS_PLANET;
    private final long DISTANCE_TO_PREVIOUS_PLANET;

    private final long DISTANCE_TO_SUN;





    SolarSystem(int ORDER, SolarSystem PREVIOUS_PLANET, int DISTANCE_TO_PREVIOUS_PLANET) {
        this.ORDER = ORDER;
        this.PREVIOUS_PLANET = PREVIOUS_PLANET;
        this.DISTANCE_TO_PREVIOUS_PLANET = DISTANCE_TO_PREVIOUS_PLANET;
        if (this.PREVIOUS_PLANET == null) {
          this.DISTANCE_TO_SUN = 5;   // from Mercury to Sun
        } else {
            this.DISTANCE_TO_SUN = PREVIOUS_PLANET.DISTANCE_TO_SUN + DISTANCE_TO_PREVIOUS_PLANET;
        }
    }


    @Override
    public String toString() {
        return "SolarSystem{" +
                "ORDER=" + ORDER +
                ", PREVIOUS_PLANET=" + (PREVIOUS_PLANET == null ? "Null" : PREVIOUS_PLANET.name()) +
                ", DISTANCE_TO_PREVIOUS_PLANET=" + DISTANCE_TO_PREVIOUS_PLANET +
                ", DISTANCE_TO_SUN=" + DISTANCE_TO_SUN +
                '}';
    }
}
