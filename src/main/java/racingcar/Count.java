package racingcar;

public class Count {

    private int count;

    public Count(int number) {
        validateCount(number);
        this.count = number;
    }

    public int getCount() {
        return count;
    }

    private void validateCount(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(Message.ERROR.getMessage() + " 시도 횟수는 1 이상이여야 합니다.");
        }
    }


}
