package Model;


public abstract class Unit {

    public Unit(Mediator med) {
        this.med = med;
    }


    public void send(Table table) {
        med.Send(table, this);
    }


    public abstract void notify(Table table);

    private Mediator med;
}
