package Interface;

public class lesson150M {
    public static void main(String[] args) {

        VideoGame Diablo;
        Diablo = new VideoGame();

        Diablo.SaveState(22);

        Diablo.RetrieveState( Diablo.SaveState(22));
    }
}