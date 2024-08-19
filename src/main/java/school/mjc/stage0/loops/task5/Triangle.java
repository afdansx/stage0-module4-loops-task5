package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength <= 0) {
            return;
        }

        for (int x = 1; x <= cathetusLength; x++) {

            for (int y = 1; y <= x; y++) {
                System.out.print('8');
            }

            for (int y = x; y < cathetusLength; y++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }

}
