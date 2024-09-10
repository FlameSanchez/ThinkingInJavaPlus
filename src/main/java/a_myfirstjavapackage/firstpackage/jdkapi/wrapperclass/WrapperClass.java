package a_myfirstjavapackage.firstpackage.jdkapi.wrapperclass;

public class WrapperClass {

    /*包装类的存在意义
    * 1 object method(Object object){
    *   }
    * 2 collection
    * */

    /*8种包装类当中，除了Character都有对应的parseXxxl的方法，进行类型转换*/

    public static void main(String[] args) {

//       int取值范围 -2^31~2^31-1 2147483648(21亿)
//       long取值范围 -2^63~2^63-1
        int x=128;
        System.out.println(Long.MAX_VALUE);

//        Integer.valueOf()源码
//        if(-127~128)返回值
//        else new integer()
        Integer.valueOf("128");

        Integer y = 128;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toOctalString(y));
        System.out.println(Integer.toHexString(y));
    }
}
