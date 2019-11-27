package foundations.findLongestWord;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class CharPositionBuilderTest {

    CharPositionBuilder charPositionBuilder;

    @Before
    public void setUp() {
        charPositionBuilder = new CharPositionBuilder();
    }

    @Test
    public void for_single_letter() {
        //given
        String s = "a";
        
        //when
        Map<Character, List<Integer>> result = charPositionBuilder.buildDense(s);

        //then
        assertThat(result).isNotNull();
        List<Integer> positionsForA = result.get('a');
        assertThat(positionsForA).isNotNull().isEqualTo(List.of(-1));
    }
}