package foundations;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class FindLongestWordTest {

    @Test
    public void returns_empty_string_when_s_is_empty() {
        //given
        String s = "";
        List<String> d = List.of("a");

        //when
        String result = FindLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("");
    }

    @Test
    public void returns_the_only_word_when_s_has_the_string() {
        //given
        String s = "a";
        List<String> d = List.of("a");

        //when
        String result = FindLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("a");
    }

    @Test
    public void returns_the_matching_word_when_d_has_multiple_words() {
        //given
        String s = "a";
        List<String> d = List.of("b", "a");

        //when
        String result = FindLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("a");
    }
}