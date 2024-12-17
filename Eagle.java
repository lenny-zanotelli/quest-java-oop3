public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff() {
        if (!flying) {
            flying = true;
            altitude = 0;  // L'aigle commence au sol
            System.out.println("Hawkeye takes off in the sky.");
        }
    }

    @Override
    public void ascend(int meters) {
        if (flying) {
            altitude += meters;
            System.out.printf("Hawkeye flies upward, altitude: %d%n", altitude);
        }
    }

    @Override
    public void glide() {
        if (flying) {
            System.out.println("Hawkeye glides into the air.");
        }
    }

    @Override
    public void descend(int meters) {
        if (flying) {
            altitude -= meters;
            altitude = Math.max(altitude, 0);  // On ne descend pas sous le sol
            System.out.printf("Hawkeye flies downward, altitude: %d%n", altitude);
        }
    }

    @Override
    public void land() {
        if (altitude > 10) {
            System.out.println("Hawkeye is too high, it can't land.");
        } else {
            System.out.println("Hawkeye lands on the ground.");
            flying = false;
            altitude = 0;  // L'aigle est maintenant sur le sol
        }
    }
}
