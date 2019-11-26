package foundations;

import foundations.findLongestWord.FindLongestWord;
import foundations.findLongestWord.FindLongestWord1;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class FindLongestWordTest {

    FindLongestWord findLongestWord = new FindLongestWord1();

    @Test
    public void returns_empty_string_when_s_is_empty() {
        //given
        String s = "";
        List<String> d = List.of("a");

        //when
        String result = findLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("");
    }

    @Test
    public void returns_the_only_word_when_s_has_the_string() {
        //given
        String s = "a";
        List<String> d = List.of("a");

        //when
        String result = findLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("a");
    }

    @Test
    public void returns_the_matching_word_when_d_has_multiple_words() {
        //given
        String s = "a";
        List<String> d = List.of("b", "a");

        //when
        String result = findLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("a");
    }

    @Test
    public void returns_the_longest_word_when_s_contains_the_word_without_any_chars_int_the_middle() {
        //given
        String s = "abc";
        List<String> d = List.of("b", "ab");

        //when
        String result = findLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("ab");
    }

    @Test
    public void returns_the_longest_word_when_s_contains_the_word_with_some_chars_int_the_middle() {
        //given
        String s = "abcd";
        List<String> d = List.of("b", "ab", "abd");

        //when
        String result = findLongestWord.solution(s, d);

        //then
        assertThat(result).isEqualTo("abd");
    }
}