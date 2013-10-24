package Model;


import java.util.Random;


public class Bot extends Unit {


    public Bot(Mediator med) {
        super(med);
        rand = new Random();
    }


    public void add(Table tab) {
        this.tab = tab;
        while (!go) {
            int i = rand.nextInt(3);
            int j = rand.nextInt(3);
            if (tab.getElemenet(i, j) == 0) {
                numButton = getNumberButton(i, j);
                tab.setValueTable(numButton, 2);
                go = true;
            } else {
                continue;
            }
        }
        go = false;
        System.out.println("\nBOT-----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab.getElemenet(i, j) + " ");
            }
            System.out.println();
        }
    }


    public int getNumberButton() {
        return numButton;
    }


    public Table getTable() {
        return tab;
    }


    @Override
    public void notify(Table table) {
        this.tab = table;
    }


    private int getNumberButton(int i, int j) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i == 0 && j == 1) {
            numButton = 2;
        }
        if (i == 0 && j == 2) {
            numButton = 3;
        }
        if (i == 1 && j == 0) {
            numButton = 4;
        }
        if (i == 1 && j == 1) {
            numButton = 5;
        }
        if (i == 1 && j == 2) {
            numButton = 6;
        }
        if (i == 2 && j == 0) {
            numButton = 7;
        }
        if (i == 2 && j == 1) {
            numButton = 8;
        }
        if (i == 2 && j == 2) {
            numButton = 9;
        }
        return numButton;
    }


    private Table tab;
    private Random rand;
    private boolean go = false;
    private int numButton;
}
