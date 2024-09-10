package enumerated.test;


public enum EnumTest4 {
         Appetizer(2),
        MainCourse(12),
        Dessert(23),
        Coffee(45);

         int x;

        EnumTest4(int x) {
            this.x = x;
        }

        EnumTest4 test() {
            return this;
        }

        public static void main(String[] args) {

            System.out.println(Appetizer.test());
            System.out.println(MainCourse.test());
            System.out.println(Dessert.test());

        }
}