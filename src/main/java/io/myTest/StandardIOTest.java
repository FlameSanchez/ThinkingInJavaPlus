package io.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIOTest {


    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println(stdin.readLine());
        System.err.println(stdin.readLine());
    }
}
