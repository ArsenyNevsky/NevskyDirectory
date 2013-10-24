package Model;

public class Player extends Unit {


    public Player(Mediator med) {
        super(med);
    }


    public void add(int numerBut, Table table) {
        tab = table;
        tab.setValueTable(numerBut, 1);
    }


    public void add(int numerBut) {
        tab.setValueTable(numerBut, 1);
    }


    public Table getTable() {
        return tab;
    }


    @Override
    public void notify(Table table) {
        this.tab = table;
    }
    private Table tab;
}
