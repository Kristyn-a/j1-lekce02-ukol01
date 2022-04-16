package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

//        nakresliPrasatko(zofka);
//    }
//    private void nakresliPrasatko(Turtle zofka) {
//
//        zofka.move(60);
//        zofka.turnRight(90);
//        zofka.move(100);
//        zofka.turnRight(90);
//        zofka.move(60);
//        zofka.turnRight(90);
//        zofka.move(100);
//        zofka.turnRight(90);
//
//        zofka.turnLeft(45);
//        zofka.move(42.4);
//        zofka.turnRight(90);
//        zofka.move(42.4);
//
//        zofka.penUp();
//        zofka.turnRight(135);
//        zofka.move(60);
//        zofka.penDown();
//
//        zofka.turnRight(30);
//        zofka.move(60);
//        zofka.turnLeft(180);
//        zofka.move(60);
//        zofka.turnRight(120);
//        zofka.move(60);
//
//        zofka.penUp();
//        zofka.turnLeft(180);
//        zofka.move(60);
//        zofka.turnRight(120);
//        zofka.move(100);
//        zofka.penDown();
//
//        zofka.turnRight(120);
//        zofka.move(60);
//        zofka.turnLeft(180);
//        zofka.move(60);
//        zofka.turnRight(120);
//        zofka.move(60);
//
//        zofka.penUp();
//        zofka.turnLeft(180);
//        zofka.move(60);
//        zofka.turnLeft(60);
//        zofka.move(200);
//        zofka.turnRight(90);
//        zofka.move(200);
//        zofka.penDown();


        for (int i = 0; i < 48; i++) {
              zofka.move(2);
              zofka.turnRight(7.5);
        }

        paprsekSlunicka(zofka);

    }

    private void paprsekSlunicka(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(15);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(15);
        zofka.turnLeft(90);
        for (int i = 0; i < 4; i++) {
            zofka.move(2);
            zofka.turnRight(7.5);
        }
        zofka.penDown();
        for (int i = 1; i < 12; i++) {
            paprsekSlunicka(zofka);

        }
//
//    }

//        zofka.turnRight(90);
//        zofka.move(40);
//        zofka.turnRight(90);
//        zofka.move(60);
//        zofka.turnRight(90);
//        zofka.move(40);
//        zofka.turnRight(90);
//        zofka.move(60);
//        zofka.turnRight(30);
//        zofka.move(40);
//        zofka.turnRight(120);
//        zofka.move(40);
//
//    }

}
