package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {


    @DisplayName("자동차 이름 5글자 이하, 공백이면 에러")
    @ParameterizedTest
    @ValueSource(strings = {"  ", "abcdef"})
    void validateName(String name) {
        assertThrows(IllegalArgumentException.class, () -> new Name(name));
    }


}
