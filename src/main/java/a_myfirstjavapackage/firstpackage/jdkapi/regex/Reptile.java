package a_myfirstjavapackage.firstpackage.jdkapi.regex;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reptile {

    public static void main(String[] args) throws IOException {
        /* 扩展需求2:
            把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
            中所有的身份证号码都爬取出来。
        */

        //创建一个URL对象
        URL url = new URL("https://www.bilibili.com/video/BV17F411T7Ao?p=166&vd_source=98b362be4ce5f7bcf50722b0455add05");
        //连接上这个网址
        //细节:保证网络是畅通
        URLConnection conn = url.openConnection();//创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //获取正则表达式的对象pattern
//        String regex = "[1-9]\\d{17}";
//        String regex = "API-12-爬虫";
        String regex = "黑马程序员";
        Pattern pattern = Pattern.compile(regex);//在读取的时候每次读一整行
        while ((line = br.readLine()) != null) {
            //拿着文本匹配器的对象matcher按照pattern的规则去读取当前的这一行信息
//            Matcher matcher = pattern.matcher(line);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
            System.out.println(line);

        }
        br.close();
    }
}
