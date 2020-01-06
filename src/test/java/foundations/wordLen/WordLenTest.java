package foundations.wordLen;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordLenTest {

    private WordLen wordLen;

    @Before
    public void setUp() {
        wordLen = new WordLen();
    }

    @Test
    public void case_1() {
        //given
        String[] strings = {"a", "bb", "a", "bb"};

        //when
        Map<String, Integer> result = wordLen.wordLen(strings);

        ///then
        assertThat(result).hasSize(2);
        assertThat(result.get("a")).isEqualTo(1);
        assertThat(result.get("bb")).isEqualTo(2);
    }

    @Test
    public void case_2() {
        //given
        String[] strings = {"this", "and", "that", "and"};

        //when
        Map<String, Integer> result = wordLen.wordLen(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("that")).isEqualTo(4);
        assertThat(result.get("and")).isEqualTo(3);
        assertThat(result.get("this")).isEqualTo(4);
    }

    @Test
    public void case_3() {
        //given
        String[] strings = {"code", "code", "code", "bug"};

        //when
        Map<String, Integer> result = wordLen.wordLen(strings);

        ///then
        assertThat(result).hasSize(2);
        assertThat(result.get("code")).isEqualTo(4);
        assertThat(result.get("bug")).isEqualTo(3);
    }
}