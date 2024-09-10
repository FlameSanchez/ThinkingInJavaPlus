package strings.myTest;

public class StringBuilderTest {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(1);
        sb.append(2);
        sb.append(3);
        sb.append(4);
        sb.append(5);
        System.out.println(sb.length());

//        sb.delete(sb.length() - 2, sb.length()-1);
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb.toString());

    }
}
