package nextstep.ladder.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class IndexTest {

    @Test
    @DisplayName("next 테스트")
    void next() {
        Index index = new Index();
        Index next = index.next();
        assertThat(next).isEqualTo(Index.ONE);
    }

    @Test
    @DisplayName("prev 테스트")
    void prev() {
        Index index = Index.ONE;
        Index prev = index.prev();
        assertThat(prev).isEqualTo(new Index());
    }

    @Test
    @DisplayName("next, prev시 복구 테스트")
    void nextAndPrev() {
        Index index = Index.ONE;
        index.next();
        index.prev();
        assertThat(index).isEqualTo(index);
    }

    @Test
    @DisplayName("음수 값이 들어올 경우 IllegalArgumentException 발생")
    void validationNegative() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Index(-1));
    }

    @Test
    @DisplayName("prev시 음수값으로 넘어갈 경우 IllegalArgumentException 발생")
    void validationNegativeByPrev() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Index().prev());
    }
}