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
    public void for_repeating_single_letter() {
        //given
        String s = "aa";

        //when
        Map<Character, List<Integer>> result = charPositionDenseBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(1, -1));
    }
}