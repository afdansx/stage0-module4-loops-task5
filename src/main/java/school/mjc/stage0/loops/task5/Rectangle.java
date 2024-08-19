package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length <= 0 || height <= 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < length; i++) {
            sb.append('8');
        }
        sb.append('\n');


        for (int i = 0; i < height - 2; i++) {
            sb.append('8');
            for (int j = 0; j < length - 2; j++) {
                sb.append(' ');
            }
            sb.append('8');
            sb.append('\n');
        }


        if (height > 1) {
            for (int i = 0; i < length; i++) {
                sb.append('8');
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
