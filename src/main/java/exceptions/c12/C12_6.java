package exceptions.c12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
class MyException1 extends Exception{
   static Logger logger = Logger.getLogger("Myexception");

    public MyException1() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}
public class C12_6 extends  Exception {

    public static void main(String[] args) {

        try {

            throw new MyException();

        } catch (Exception e) {
//            System.out.println(e);
            System.err.println(e);
        }
    }

}
