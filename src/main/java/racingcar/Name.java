package racingcar;

public class Name {

    private String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        validateNameEmpty(name);
        validateNameLength(name);
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(Message.ERROR.getMessage() + " 자동차 이름은 5글자 이하여야 합니다.");
        }
    }

    private void validateNameEmpty(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(Message.ERROR.getMessage() + " 자동차 이름은 공백일 수 없습니다.");
        }
    }


}
