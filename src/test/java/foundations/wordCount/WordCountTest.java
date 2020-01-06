package foundations.wordCount;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCountTest {

    private WordCount wordCount;

    @Before
    public void setUp() {
        wordCount = new WordCount();
    }

    @Test
    public void case_1() {
        //given
        String[] strings = {"a", "b", "a", "c", "b"};

        //when
        Map<String, Integer> result = wordCount.wordCount(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("a")).isEqualTo(2);
        assertThat(result.get("b")).isEqualTo(2);
        assertThat(result.get("c")).isEqualTo(1);
    }

    @Test
    public void case_2() {
        //given
        String[] strings = {"c", "b", "a"};

        //when
        Map<String, Integer> result = wordCount.wordCount(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("a")).isEqualTo(1);
        assertThat(result.get("b")).isEqualTo(1);
        assertThat(result.get("c")).isEqualTo(1);
    }

    @Test
    public void case_3() {
        //given
        String[] strings = {"c", "c", "c", "c"};

        //when
        Map<String, Integer> result = wordCount.wordCount(strings);

        ///then
        assertThat(result).hasSize(1);
        assertThat(result.get("c")).isEqualTo(4);
    }
}