package com.company;

public class Pole {
    public static String[] znak = {".", "o", "x"}; // zmienna statyczna
    private int status; // wartości statusów = 2, 1, 0  alt + insert getter setter

    public Pole(){
        this.status = 0;
    }

    public Pole(int status) {
        this.setStatus(status);
    }


    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        if (status == 1 || status == 2) {
            this.status = status; }
        else {
            this.status = 0;
        }
    }

    @Override
    public String toString() {
        return Pole.znak[this.getStatus()];
    }





    public static void main(String[] args){
        System.out.println("Testy dla klasy pole.");
        Pole p= new Pole();
        System.out.println(p.toString());
        p.setStatus(2);
        System.out.println(p.toString());
        p.setStatus(1);
        System.out.println(p.toString());
        p.setStatus(100);
        System.out.println(p.toString());

        System.out.println("Testy cd.");
        Pole p1 = new Pole();
        System.out.println(p1.toString());
        Pole p2 = new Pole(2);
        System.out.println(p2.toString());
        Pole p3 = new Pole(-12);
        System.out.println(p3.toString());
    }

}

