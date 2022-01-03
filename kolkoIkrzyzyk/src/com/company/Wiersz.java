package com.company;

public class Wiersz {

    public static String[] znakSpec = {"|"};
    public int j = 0;

    private boolean top;
    private boolean bot;
    private int[] wiersz;
    public static int wymiar = 3;

    public Wiersz(){
        this.top = false;
        this.bot = false;

    }

    public Wiersz(boolean top, boolean bot){
        this.top = top;
        this.bot = bot;
    }

    public Wiersz(int[] wiersz){
        this.top = false;
        this.bot = false;
        this.setWiersz(wiersz);
    }



    public int[] getWiersz() {
        return wiersz;
    }

    public void setWiersz(int[] wiersz) {
        this.wiersz = wiersz;
    }

    private String getTOP(){
        return "";
    }

    private String getMID(){
        System.out.print(" " + znakSpec[0]);
        for (int i = 1; i < wymiar+1; i++) {
            System.out.print(i+znakSpec[0]);
        }

        System.out.println("\n " + znakSpec[0] + "------");

        String s = Wiersz.znakSpec[0];
        for (int value : this.wiersz){
            Pole p = new Pole(value);
            s = s + p.toString() + Wiersz.znakSpec[0];

        }
        return s;
    }

    private String getBOT(){
        return "";
    }

    @Override
    public String toString() {
        String s = "";
        if(this.top){
            s+=this.getTOP();
        }
        s+= "1" + this.getMID();
        if (this.bot){
            s+=this.getBOT();
        }
        j++;
        return s;
    }



    public static void main(String[] args){
        System.out.println("Testujemy Wiersz");
        Wiersz w = new Wiersz();
        Wiersz w2 = new Wiersz();
        Wiersz w3 = new Wiersz();
       // int[] row = {1,2,4,0,1,0,1,2,2,3,-1};
        int[] row =  {1,2,1};

        w.setWiersz(row);



        System.out.println(w.toString());


    }
}
