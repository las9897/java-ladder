package ladder.domain;

import static ladder.util.StringUtil.isBlank;

public class User {

    private static final int MAXIMUM_NAME_LENGTH = 5;

    private static final String INVALID_EMPTY_NAME_ERROR_MESSAGE = "사람의 이름은 반드시 제공되어야 한다.";
    private static final String INVALID_MAXIMUM_NAME_LENGTH_ERROR_MESSAGE = "사람의 이름은 최대 5글자까지만 입력가능하다.";

    private final String name;

    public User(String name) {
        checkNameNotBlank(name);
        checkNameLength(name);

        this.name = name;
    }

    private static void checkNameNotBlank(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException(INVALID_EMPTY_NAME_ERROR_MESSAGE);
        }
    }

    private static void checkNameLength(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(INVALID_MAXIMUM_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

}
