import java.util.Map;
import java.util.HashMap;
import java.lang.String;

public class Board {

    public Board(int lenght) {
        int i = 1;
        String str = "";
        Map<String, Integer> board = new HashMap<>();
        while (i<=lenght) {
            str = "A" + i;
            board.put(str, 0);
            str = "B" + i;
            board.put(str, 0);
            str = "C" + i;
            board.put(str, 0);
            str = "D" + i;
            board.put(str, 0);
            str = "E" + i;
            board.put(str, 0);
            str = "F" + i;
            board.put(str, 0);
            str = "G" + i;
            board.put(str, 0);
            str = "H" + i;
            board.put(str, 0);
            str = "I" + i;
            board.put(str, 0);
            str = "J" + i;
            board.put(str, 0);
            i++;
        }
    }

    public void squareStatus(String board, String Coordonates) {
        return board.get(Coordonates);
    }

    public void putShip(String Board, String Ship) {

    }

    public void shotAt(String Coordonates) {

    }
}
