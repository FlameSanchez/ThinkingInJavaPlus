package arrays.myTest;
// test Arrays.equal() ,more importantly,test equal();
public class Equal {

    public Equal() {
    }

    public Equal(int x) {
        this.x = x;
    }

    int x;
    public static void main(String[] args) {
       //String 比较 new String()
        String s = "hi";
        System.out.println(s.equals(new String("hi")));

        //看似一样的Equal比较
        Equal e = new Equal();
        Equal e1 = new Equal();
        System.out.println(e.equals(e1));

        //构造方法比较
        Equal equal = new Equal(2);
        Equal equal1 = new Equal(2);
        System.out.println(equal.equals(equal1));


    }
}
