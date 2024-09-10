    package io.myTest;

import net.mindview.util.CollectionData;
import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

    public abstract class Test {

        Test io() {
            return this;
        }

        public static void main(String[] args) throws IOException, ClassNotFoundException {


//        ArrayList<String> list = new ArrayList<>(CollectionData.list(new RandomGenerator.String(), 5));
//        String[] objects = (String[]) list.toArray();
//        String[] strings = list.toArray(new String[6]);
//        System.out.println(Arrays.toString(objects));

        System.out.println(new Test1().io());

//        ByteBuffer bb = ByteBuffer.allocate(1024);
//        CharBuffer cb = bb.asCharBuffer();
//        System.out.println(cb);



    }
}
