package enumerated.test;


public class EnumTest {
    enum Enum1 {
        Black{
            @Override
            void doing() {
                System.out.println("black");
                enum1=Yellow;
            }
        },
        Yellow{
            @Override
            void doing(int x) {
                System.out.println(x+2);
                enum1=Black;
            }
        },
        Red("w");
        static Enum1 enum1=Yellow;
        int state=0;
        Enum1() {}
        Enum1(String x) {state=1;}

        void doing() { }
        void doing(int x) {System.out.println(x);
        }
        public static void main(String[] args) {
            while (enum1 == Yellow) {
                Yellow.doing(3);
                if (enum1 == Black)
                    Black.doing();
            }

        }
    }
    public static void main(String[] args) {
//        enum1=Enum1.Black;



////valueof(Class<T> enumType,String name)****************
//        for(String s : "Black Red Yellow".split(" ")) {
//            System.out.println(Enum.valueOf(Enum1.class, s));
//        }
//        System.out.println(Arrays.toString(Enum1.values()));
////valueof(String name)************************
//        System.out.println(Enum1.valueOf("Black"));


    }
}
