package io.khasang.seabattletwo;

public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    public void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    public void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    public void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Супер! Корабль потоплен");
                cells[shoot] = 'Y';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Уже стреляли!");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    public void show() {
        System.out.println(cells);
    }

    public boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }
}
