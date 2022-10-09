package racingcar;

public class Car {

    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void move(int number) {
        if (isMove(number)) {
            position.moveForward();
        }
    }

    private boolean isMove(int number) {
        return number >= 4;
    }


    @Override
    public String toString() {
        return name.toString() + " : " + position.toString();
    }


}
