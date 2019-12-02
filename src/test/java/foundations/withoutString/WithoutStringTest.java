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

    @Test
    public void case_8() {
        //given
        String base = "aaa";
        String remove = "aa";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("a");
    }

    @Test
    public void case_9() {
        //given
        String base = "Hello there";
        String remove = "llo";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("He there");
    }

    @Test
    public void case_10() {
        //given
        String base = "Hello there";
        String remove = "e";

        //when
        String solution = withoutString.solution(base, remove);

        //then
        assertThat(solution).isEqualTo("Hllo thr");
    }
}