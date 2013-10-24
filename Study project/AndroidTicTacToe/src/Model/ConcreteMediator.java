package Model;


public class ConcreteMediator extends Mediator {


    public void setBot(Bot bot) {
        this.bot = bot;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }


    @Override
    public void Send(Table table, Unit unit) {
        if (unit == player) {
            bot.notify(table);
        } else {
            player.notify(table);
        }
    }

    private Player player;
    private Bot bot;
}
