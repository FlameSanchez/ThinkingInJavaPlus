package arrays.myTest;

public class Wrapper {

    public static void main(String[] args) {

        //wrapper primitives convertion
        Boolean b=true;
        boolean c=false;
        b=c;
        c=b;

        Integer i=1;
        int j=2;
        i=j;
        j=i;

        //wrapper array primitives array convertion
        boolean[] b1 = new boolean[3];
        Boolean[] b2 = new Boolean[3];

        for(int x=0; x < b1.length; x++)
            b2[x] = b1[x]; // Autounboxing
         for(int x=0; x < b2.length; x++)
            b1[x] = b2[x]; // Autounboxing


        //!!!error:
//            b1=b2;
//            b2=b1;

//      string必然转不了char/character，因为char是单字符 只有先tochararray(),再遍历才能转。char/character必然能转string

        String s = "12sda";
        char ch = 'a';
        Character cha = 'b';

//        cha = s;
        s= String.valueOf(cha);

        //char convert to string
        s= String.valueOf(ch);
        //error:string convert to char
//        ch=s;
    }

}
