package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);

        // posunutí doprava na domeček
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(160);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliDOmecek(zofka);

        zofka.penUp();
        zofka.turnRight(150);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliDOmecek(zofka);

        posunutiNaDomecekLeva(zofka);

        nakresliDOmecek(zofka);

        for (int i = 0; i < 3; i++) {
            posunutiNaDomecekLeva(zofka);
            nakresliDOmecek(zofka);

        }
        zofka.penUp();
        zofka.turnLeft(30);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliDOmecek(zofka);

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(90);

        paprsekSlunicka(zofka);

        for (int i = 0; i < 12; i++) {
            paprsekSlunicka(zofka);
        }

        for (int i = 0; i < 48; i++) {
              zofka.move(2);
              zofka.turnRight(7.5);
        }

        zofka.penUp();
        zofka.turnRight(150);
        zofka.move(250);
        zofka.penDown();

        pismenoT(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.penDown();

        pismenoY(zofka);

        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
        zofka.penDown();

        zofka.move(60);
        zofka.turnRight(135);
        zofka.move(84.9);
        zofka.turnLeft(135);
        zofka.move(60);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(15);
        zofka.penDown();

        pismenoA(zofka);

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

    }

    private void posunutiNaDomecekLeva(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(45);
        zofka.penDown();
    }

    private void nakresliDOmecek(Turtle zofka) {
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(30);
        zofka.move(40);
        zofka.turnLeft(120);
        zofka.move(40);

    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);

        zofka.turnLeft(45);
        zofka.move(42.4);
        zofka.turnRight(90);
        zofka.move(42.4);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(60);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(100);
        zofka.penDown();

        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);
    }

    private void pismenoA(Turtle zofka) {
        zofka.turnLeft(60);
        zofka.move(67.1);
        zofka.turnRight(120);
        zofka.move(67.1);
        zofka.turnRight(180);
        zofka.move(22);
        zofka.turnLeft(60);
        zofka.move(45.2);
    }

    private void pismenoN(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void pismenoN(Turtle zofka, int byAngle, int byAngle1, double pixels) {
        zofka.move(60);
        zofka.turnRight(byAngle);
        zofka.move(pixels);
        zofka.turnLeft(byAngle1);
        zofka.move(60);
    }

    private void pismenoY(Turtle zofka) {
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(42.4);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.penDown();
        zofka.move(21.2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(21.2);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(42.4);
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(30);
    }

    private void pismenoT(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
    }
}
