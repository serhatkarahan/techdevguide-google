package foundations.maxSpan;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSpanTest {

    MaxSpan maxSpan;

    @Before
    public void setUp() {
        maxSpan = new MaxSpan();
    }

    @Test
    public void tests() {
        assertThat(maxSpan.solution(new int[]{1})).isEqualTo(1);

        assertThat(maxSpan.solution(new int[]{1, 1})).isEqualTo(2);

        assertThat(maxSpan.solution(new int[]{1, 1, 2})).isEqualTo(2);
    }
}