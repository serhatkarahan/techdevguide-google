package foundations.wordZero;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordZeroTest {

    private WordZero wordZero;

    @Before
    public void setUp() {
        wordZero = new WordZero();
    }

    @Test
    public void case_1() {
        //given
        String[] strings = {"a", "b", "a", "b"};

        //when
        Map<String, Integer> result = wordZero.word0(strings);

        ///then
        assertThat(result).hasSize(2);
        assertThat(result.get("a")).isEqualTo(0);
        assertThat(result.get("b")).isEqualTo(0);
    }

    @Test
    public void case_2() {
        //given
        String[] strings = {"a", "b", "a", "c", "b"};

        //when
        Map<String, Integer> result = wordZero.word0(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("a")).isEqualTo(0);
        assertThat(result.get("b")).isEqualTo(0);
        assertThat(result.get("c")).isEqualTo(0);
    }

    @Test
    public void case_3() {
        //given
        String[] strings = {"c", "b", "a"};

        //when
        Map<String, Integer> result = wordZero.word0(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("a")).isEqualTo(0);
        assertThat(result.get("b")).isEqualTo(0);
        assertThat(result.get("c")).isEqualTo(0);
    }
}