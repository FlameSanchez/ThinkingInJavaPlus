package arrays.myTest;

import java.util.Random;

public class RandomSeedTest {
    int i;
    int j;

    public RandomSeedTest(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "RandomSeedTest{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args) {

        Random random = new Random(47);
        RandomSeedTest randomSeed = new RandomSeedTest(random.nextInt(50), random.nextInt(50));
        System.out.println(randomSeed);


    }
}
