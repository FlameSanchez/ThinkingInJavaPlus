package a_myfirstjavapackage.firstpackage.jdkapi;

import java.io.IOException;

public class JDKFirstClass {
    //API/JDK Date
/*java.lang包下的工具类*/



    public static void main(String[] args) throws IOException {
        /*System
exit()
currentTimeMillis()         System.out.println(System.currentTimeMillis());
arraycopy(1,2,3,4,5)*/

        /*Runtime
public static Runtime getRuntime() 当前系统的运行环境对象
public void exit(int status) 停止虚拟机
public int availableProcessors() 获得CPU的线程数
public long maxMemory() JVM能从系统中获取总内存大小（单位byte)
public long totalMemory() JVM已经从系统中获取总内存大小（单位byte)
public long freeMemory() JVM剩余内存大小（单位byte)
public Process exec(String command) 运行cmd命令*/
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
//        System.out.println(Runtime.getRuntime().exec("ifconfig"));
    }
}
