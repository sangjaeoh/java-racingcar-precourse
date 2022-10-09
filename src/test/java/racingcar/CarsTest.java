package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mockStatic;

public class CarsTest {

    @Test
    @DisplayName("자동차 이름에 중복이 있는지 확인")
    void validateName() {
        assertThrows(IllegalArgumentException.class, () -> new Cars(Arrays.asList(new Car("name"), new Car("name"))));
    }

    @Test
    @DisplayName("전진")
    void move() {
        MockedStatic<RandomNumberUtil> mock = mockStatic(RandomNumberUtil.class);
        mock.when(() -> RandomNumberUtil.getNumber()).thenReturn(1, 9, 9);
        Cars cars = new Cars(Arrays.asList(
                new Car("car1"),
                new Car("car2"),
                new Car("car3")
        ));
        cars.move();
        assertThat(cars.toString()).contains("car1 : ", "car2 : -", "car3 : -");
    }
}
