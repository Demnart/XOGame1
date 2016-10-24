/**
 * Created by Алина on 24.10.2016.
 */
public class Board {
    public static final int SIZE = 3;
    private Type[][] cells = new Type[SIZE][SIZE];


    void initCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = Type.NOT_INSTALLED;
            }
        }
    }

    void show() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case NOT_INSTALLED:
                        System.out.print(".");
                        break;
                    default:
                        System.out.print("woops");
                }
            }
                        System.out.println();
        }
        System.out.println("\n");
    }

    void doShoot(Point point, Type type) {
        if (cells[point.getX()][point.getY()] == Type.NOT_INSTALLED) {
            cells[point.getX()][point.getY()] = type;
        }
//        if (cells[point.getX()][point.getY()] == Type.X){}
//        if (cells[point.getX()][point.getY()] == Type.O){}
        //TODO Сделать возможность для выстрела в случае если ячейка уже занята фигурой
    }

    boolean checkWinner(Type type) {

        if (cells[0][0] == type & cells[0][1] == type & cells[0][2] == type) {
            return true;
        }
        if (cells[1][0] == type & cells[1][1] == type & cells[1][2] == type) {
            return true;
        }
        if (cells[2][0] == type & cells[2][1] == type & cells[2][2] == type) {
            return true;
        }
        if (cells[0][2] == type & cells[1][1] == type & cells[2][1] == type) {
            return true;
        }
        if (cells[0][2] == type & cells[1][2] == type & cells[2][2] == type) {
            return true;
        }
        if (cells[0][0] == type & cells[1][0] == type & cells[2][0] == type) {
            return true;
        }
        if (cells[0][0] == type & cells[1][1] == type & cells[2][2] == type) {
            return true;
        }
        if (cells[0][2] == type & cells[1][1] == type & cells[2][0] == type) {
            return true;
        }

        return false;
    }

    boolean isGameNotEnd() {
        if (checkWinner(Type.X)) {
            System.out.println("Победил игрок X");
            return true;
        }
        if (checkWinner(Type.O)) {
            System.out.println("Победил игрок O");
            return true;
        }
        return false;
    }
}
