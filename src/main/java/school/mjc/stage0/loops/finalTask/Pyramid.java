package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces for left alignment
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print("   ");
            }

            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}