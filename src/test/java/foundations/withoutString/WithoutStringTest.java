package foundations.withoutString;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WithoutStringTest {

    WithoutString withoutString;

    @Before
    public void setUp() {
        withoutString = new WithoutString();
    }

    @Test
    public void case_1() {
        //given
        String base = "";
        String remove = "a";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("");
    }
}