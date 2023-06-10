package command.live2;

public class Client {


        public static void main(String[] args) {
            //Tenemos este tablero de tictac
            //Queremos poder
            TicTac game = new TicTac();
            game.placeMark(0, 0, 'X'); // X's turn
            game.printBoard();
            game.placeMark(0, 1, 'O'); // O's turn
            game.printBoard();


        }

}
