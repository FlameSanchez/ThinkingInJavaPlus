package containers.myTest;


public class CharTest {


    public static void main(String[] args) {
    //char c指向的a++只代表加一次后的结果，所以c.sout一直不变
        char a = 'a';
        char c = a++;
        char d = a++;
        char c1 = c++;


        for (int i = 0; i < 5; i++) {

            System.out.println(c++);
        }
        System.out.println(c);
        System.out.println(c);
        System.out.println(d);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(c1);


    }
}
