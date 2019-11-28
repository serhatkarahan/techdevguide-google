package foundations.findLongestWord;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class CharPositionDenseBuilderTest {

    CharPositionDenseBuilder charPositionDenseBuilder;

    @Before
    public void setUp() {
        charPositionDenseBuilder = new CharPositionDenseBuilder();
    }

    @Test
    public void for_single_letter() {
        //given
        String s = "a";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(-1));
    }

    @Test
    public void for_repeating_single_letter_twice() {
        //given
        String s = "aa";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(1, -1));
    }

    @Test
    public void for_repeating_single_letter_three_times() {
        //given
        String s = "aaa";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(1, 2, -1));
    }

    @Test
    public void for_two_different_letters() {
        //given
        String s = "ab";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(-1, -1));

        List<Integer> positionsForB = result.get('b');
        assertThat(positionsForB).isNotNull().isEqualTo(List.of(1, -1));
    }

    @Test
    public void for_three_different_letters() {
        //given
        String s = "abc";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(-1, -1, -1));

        List<Integer> positionsForB = result.get('b');
        assertThat(positionsForB).isNotNull().isEqualTo(List.of(1, -1, -1));

        List<Integer> positionsForC = result.get('c');
        assertThat(positionsForC).isNotNull().isEqualTo(List.of(2, 2, -1));
    }

    @Test
    public void for_three_different_letters_and_last_letter_is_repeated() {
        //given
        String s = "abcc";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(-1, -1, -1, -1));

        List<Integer> positionsForB = result.get('b');
        assertThat(positionsForB).isNotNull().isEqualTo(List.of(1, -1, -1, -1));

        List<Integer> positionsForC = result.get('c');
        assertThat(positionsForC).isNotNull().isEqualTo(List.of(2, 2, 3, -1));
    }

    @Test
    public void for_three_different_letters_and_first_letter_is_repeated() {
        //given
        String s = "abca";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(3, 3, 3, -1));

        List<Integer> positionsForB = result.get('b');
        assertThat(positionsForB).isNotNull().isEqualTo(List.of(1, -1, -1, -1));

        List<Integer> positionsForC = result.get('c');
        assertThat(positionsForC).isNotNull().isEqualTo(List.of(2, 2, -1, -1));
    }

    @Test
    public void for_three_different_letters_and_two_letters_are_repeated_with_other_letters_between() {
        //given
        String s = "abcab";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(3, 3, 3, -1, -1));

        List<Integer> positionsForB = result.get('b');
        assertThat(positionsForB).isNotNull().isEqualTo(List.of(1, 4, 4, 4, -1));

        List<Integer> positionsForC = result.get('c');
        assertThat(positionsForC).isNotNull().isEqualTo(List.of(2, 2, -1, -1, -1));
    }

    @Test
    public void for_five_different_letters() {
        //given
        String s = "abppplee";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('p');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(2, 2, 3, 4, -1, -1, -1, -1));
    }
}