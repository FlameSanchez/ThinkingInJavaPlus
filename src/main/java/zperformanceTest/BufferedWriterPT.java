package zperformanceTest;

import containers.TestParam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BufferedWriterPT {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<BufferedWriterTest>> tests =
            new ArrayList<Test<BufferedWriterTest>>();

    static {
        tests.add(new Test<BufferedWriterTest>("buffer") {

            @Override
            int test(BufferedWriterTest bwt, TestParam tp)  {
                    int loops = tp.loops;
                    int listSize = tp.size;
                    for (int i = 0; i < loops; i++) {
                        try {
                            bwt.BufferedwTest();
                            return loops;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                return 0;
            }});

        tests.add(new Test<BufferedWriterTest>("unbuffer") {

            @Override
            int test(BufferedWriterTest bwt, TestParam tp)  {

                int loops = tp.loops;
                try {
                    for (int i = 0; i < loops; i++) {
                        bwt.PrintwTest();
                    }
                    return loops;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });

    }

    static class BufferedWriterTester extends Tester<BufferedWriterTest> {

        public BufferedWriterTester(BufferedWriterTest container, List<Test<BufferedWriterTest>> tests) {
            super(container, tests);
        }
    }

    public static void main(String[] args) {
//        new BufferedWriterTester().timedTest();
        new BufferedWriterTester(new BufferedWriterTest(),tests).timedTest();
    }
}