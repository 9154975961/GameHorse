package com.javarush.task.task21.task2113;

public class Horse {

    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void move (){ // будет управлять движением всех лошадей.
        distance += speed * Math.random(); // скорость все время немного меняется на случайное число
    }

    void print (){ // отрисовывать их на экран.
        double res = Math.floor(distance); // округляем до меньшего
        for (int i = 0; i < res; i++) {
            System.out.print("."); // выводим точки на экран
        }
        System.out.print(getName()+"\n"); // имя лошади
    }
}
