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

    @Test
    public void case_2() {
        //given
        String base = "a";
        String remove = "a";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("");
    }

    @Test
    public void case_3() {
        //given
        String base = "a";
        String remove = "A";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("");
    }

    @Test
    public void case_4() {
        //given
        String base = "A";
        String remove = "a";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("");
    }

    @Test
    public void case_5() {
        //given
        String base = "A";
        String remove = "b";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("A");
    }

    @Test
    public void case_6() {
        //given
        String base = "aa";
        String remove = "a";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("");
    }

    @Test
    public void case_7() {
        //given
        String base = "ab";
        String remove = "a";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("b");
    }
}