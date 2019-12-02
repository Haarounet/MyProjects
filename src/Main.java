import java.lang.String;


public class Main {
    public static void main (String[] args){
        Board board_j1 = new Board(10);
        System.out.println(board_j1);
        Board board_j2 = new Board(10);
        System.out.println(board_j2);
        Ship ship1_j1 = new Ship("CA", "B8", "S");
        squareStatus(board_j1, "A0");
    }


}
