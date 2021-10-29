package io.khasang.seabattletwo;

public class Field {
    static final int SIZE = 20;
    static final int SHIPS_AMOUNT = 4;

    char[] cells = new char[SIZE];
    Ship[] ships = new Ship[SHIPS_AMOUNT];

    public void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    public void setShip() {
        for (int i = 0; i < SHIPS_AMOUNT; i++) {
            Ship tempShip = new Ship();

            boolean isIntersect;
            do {
                isIntersect = false;
                tempShip.initRandomInSize();
                for (int j = 0; j < i; j++) {
                    if (tempShip.isIntersectWithAnotherShip(ships[j])) {
                        isIntersect = true;
                    }
                }
            } while (isIntersect);


            drawShip(tempShip);
            ships[i] = tempShip;
        }
    }

    private void drawShip(Ship tempShip) {
        for (int i = 0; i < tempShip.size; i++) {
            cells[tempShip.positionStart + i] = 'X';
        }
    }

    public void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Супер! Корабль потоплен или ранен");
                cells[shoot] = '-';
                show();
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
        for (char cell : cells) {
            if (cell == 'X') {
                return true;
            }
        }
        return false;
    }
}
