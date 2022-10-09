package racingcar;

import java.util.Objects;

public class Position {

    private final String HYPHEN = "-";

    private int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward() {
        this.position++;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < position; i++) {
            stringBuffer.append(HYPHEN);
        }
        return stringBuffer.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position target = (Position) o;
        return position == target.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
