// change
package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void move (){ // будет управлять движением всех лошадей.
        for (Horse horse : horses) {
            horse.move();
        }
    }

    void print (){ // отрисовывать их на экран.
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    public void run() { // будет управлять move И print
        for (int i=1; i<=100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner() {
        Horse horseName = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > horseName.getDistance())
                horseName = horse;
        }
        return horseName;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {

    ArrayList<Horse>horses = new ArrayList<>();
        horses.add(new Horse("Shugar", 3, 0));
        horses.add(new Horse("Lucki", 3, 0));
        horses.add(new Horse("Slevin", 3, 0));
        game = new Hippodrome(horses);

        game.run();
        game.printWinner();
    }


}
