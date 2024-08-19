package school.mjc.stage0.loops.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class HourglassTest extends BaseIOTest {

    @Test
    void printHourglassOfGivenSizePrintsHourglass() {
        String expected = "5\n";

        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(5);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsHourglassEven() {
        String expected = "6\n";


        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(6);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsSmallestHourglass() {
        String expected = "3\n";


        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(3);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsNothing() {

        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(0);


        assertOutEquals("");
    }
}