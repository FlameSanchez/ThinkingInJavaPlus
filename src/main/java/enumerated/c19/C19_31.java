package enumerated.c19;

import net.mindview.util.Enums;

public class C19_31 {

    private Letters[] values;

    public Letters randomSelection() {
        return Enums.random(values);
    }

    interface Letters {

        enum VOWEL implements Letters {
            A,E,I,O,U;
        }
        enum SOMETIMES_A_VOWEL implements Letters {
            Y,W;
        }
        enum CONSONANT implements Letters {
            C,D,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,X,Z;
        }
    }

    public static void main(String[] args) {

//        C19_3 c1 = C19_3.VOWEL;
//        C19_3 c2 = C19_3.SOMETIMES_A_VOWEL;
//        System.out.println(c1.values[1]);
//        System.out.println(c2.values[1]);

    }

}
