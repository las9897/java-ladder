package nextstep.ladder.model;

import nextstep.ladder.utils.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PlayersTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"aaaa,bbbb,cccc,,dddd", "aaaaaa,bbbb,cccc"})
    @DisplayName("입력값에 null 이나 빈값, 또는 5글자 이상이 들어갔을 경우")
    void validationMiddleEmpty(String names) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            String[] splitNames = StringUtils.validationNotNullAndEmpty(names).split(",");
            new Players(splitNames);
        });
    }

}