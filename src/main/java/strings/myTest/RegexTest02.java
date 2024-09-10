package strings.myTest;

public class RegexTest02 {
    public static void main(String[] args) {
        System.out.println("nosa".matches("n(o)a"));
        System.out.println("nowdadad".matches("n(o\\w+)"));
        System.out.println("nowdadad aada".matches("\\p{javaLowerCase}.*"));
        System.out.println("asdasd  as".matches("\\b([a]\\w+)\\b"));
    }
}
