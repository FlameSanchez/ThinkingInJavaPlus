package interfaces.c9;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

//: interfaces/C9_10/Music5.java
// Interfaces.

    interface Playable {
    void play(Note n); // Automatically public
    }
    interface Instrument {
        // Compile-time constant:
        int VALUE = 5; // static & final
        // Cannot have method definitions:
        void adjust();
    }

    class Wind implements  Instrument,Playable {
        public void play(Note n) {
            print(this + ".play() " + n);
        }
        public String toString() { return "Wind"; }
        public void adjust() { print(this + ".adjust()"); }
    }

    class Percussion implements Instrument,Playable {
        public void play(Note n) {
            print(this + ".play() " + n);
        }
        public String toString() { return "Percussion"; }
        public void adjust() { print(this + ".adjust()"); }
    }

    class Stringed implements  Instrument,Playable {
        public void play(Note n) {
            print(this + ".play() " + n);
        }
        public String toString() { return "Stringed"; }
        public void adjust() { print(this + ".adjust()"); }
    }

    class Brass extends  Wind {
        public String toString() { return "Brass"; }
    }

    class Woodwind extends  Wind {
        public String toString() { return "Woodwind"; }
    }

    public class C9_10 {
        // Doesn't care about type, so new types
        // added to the system still work right:
        interface aa{}
        static void tune(Playable p) {
            // ...
            p.play(Note.MIDDLE_C);
        }
        static void tuneAll( Playable [] e) {
            for( Playable p : e)
                tune(p);
        }
        void test(){
            System.out.println("1");
        }
        public static void main(String[] args) {
            // Upcasting during addition to the array:
            Playable [] orchestra = {
                    new Wind(),
                    new Percussion(),
                    new Stringed(),
                    new Brass(),
                    new Woodwind()
            };
            tuneAll(orchestra);
        }
    } /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~


