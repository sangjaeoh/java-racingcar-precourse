package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars) {
        validateDuplicate(cars);
        this.cars = cars;
    }

    private void validateDuplicate(List<Car> cars) {
        Set<Car> duplicateCarSet = new HashSet<>(cars);
        if (duplicateCarSet.size() != cars.size()) {
            throw new IllegalArgumentException(Message.ERROR.getMessage() + " 자동차 이름이 중복되었습니다.");
        }
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomNumberUtil.getNumber());
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Car car : cars) {
            stringBuffer.append(car.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}

