package eu.epfc.java1970.lesson33revision.robots;

public class DemoRobot {

    public static void main(String[] args) {
        Robot[] robots = new Robot[10];

        for (int i = 0; i < robots.length; ++i) {
            robots[i] = new Robot("MODEL", "Goldorack " + i, "super robot", 2000 * 1000, "" + i);
        }

        // triche car se base sur l'index dans robots et pas sur robots[0].getVersion()
        for (int i = 0; i < robots.length; ++i) {
            if (i % 2 == 0) {
                System.out.println(robots[i]);
            }
        }

        System.out.println("");
        // solution correcte
        for (Robot robot : robots) {
            try {
                int version = Integer.valueOf(robot.getVersion());
                if (version % 2 == 0) {
                    System.out.println(robot);
                }
            } catch (NumberFormatException ex) {

            }
        }
    }
}
