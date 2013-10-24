package Model;


public class Game {


    public Game() {
        table = new Table();
        cm = new ConcreteMediator();
        player = new Player(cm);
        bot = new Bot(cm);

        cm.setBot(bot);
        cm.setPlayer(player);
    }


    public String setXO(int numBut) {
        if (game) {
            if (flag) {
                player.add(numBut);
                player.send(table);
                flag = false;
            } else {
                bot.add(player.getTable());
                bot.send(table);
                val = bot.getNumberButton();
                flag = true;
            }
        } else {
            game = true;
            player.add(numBut, table);
            flag = false;
        }
        return flag ? O : X;
    }


    public int getNum() {
        return val;
    }


    public boolean isWin() {
        return (table.isWin()) ? true : false;
    }


    private int val = 0;
    private boolean game = false;
    private final String X = "X";
    private final String O = "O";
    private boolean flag = true;
    private Player player;
    private Bot bot;
    private Table table;
    private ConcreteMediator cm;
}
