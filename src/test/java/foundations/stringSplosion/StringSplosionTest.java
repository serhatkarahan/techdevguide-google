package foundations.stringSplosion;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringSplosionTest {

    StringSplosion stringSplosion;

    @Before
    public void setUp() {
        stringSplosion = new StringSplosion();
    }

    @Test
    public void single_letter() {
        //given
        String s = "a";

        //when
        String solution = stringSplosion.solution(s);

        //then
        assertThat(solution).isEqualTo("a");
    }

    @Test
    public void two_repeating_letters() {
        //given
        String s = "aa";

        //when
        String solution = stringSplosion.solution(s);

        //then
        assertThat(solution).isEqualTo("aaa");
    }

    @Test
    public void any_string() {
        //given
        String s = "Code";

        //when
        String solution = stringSplosion.solution(s);

        //then
        assertThat(solution).isEqualTo("CCoCodCode");
    }
}