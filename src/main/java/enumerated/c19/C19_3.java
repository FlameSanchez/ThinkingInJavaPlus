package enumerated.c19;

import net.mindview.util.Enums;

public enum  C19_3 {

    VOWEL(Letters.VOWEL.class),
    SOMETIMES_A_VOWEL(Letters.SOMETIMES_A_VOWEL.class),
    CONSONANT(Letters.CONSONANT.class);

    private Letters[] values;

    private C19_3(Class<? extends Letters> kind) {
        values = kind.getEnumConstants();
    }

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
        for (int i = 0; i < 6; i++) {

        }
            for (C19_3 value : C19_3.values()) {
                System.out.println(value+"\t"+value.randomSelection());
            }

//        C19_3 c1 = C19_3.VOWEL;
//        C19_3 c2 = C19_3.SOMETIMES_A_VOWEL;
//        System.out.println(c1.values[1]);
//        System.out.println(c2.values[1]);



    }


}
