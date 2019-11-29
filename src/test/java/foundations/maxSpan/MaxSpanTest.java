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
    public void single_value() {
        //given
        int[] nums = {1};

        //when
        int solution = maxSpan.solution(nums);

        //then
        assertThat(solution).isEqualTo(1);
    }
}