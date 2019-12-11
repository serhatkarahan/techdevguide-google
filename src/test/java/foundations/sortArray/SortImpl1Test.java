package foundations.sortArray;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SortImpl1Test {

    private Sort sort;

    @Before
    public void setUp() {
        sort = new SortImpl1();
    }

    @Test
    public void case_1() {
        //given
        int[] input = {};

        //when
        int[] result = sort.sort(input);

        ///then
        assertThat(result).isEmpty();
    }

    @Test
    public void case_2() {
        //given
        int[] input = {1};

        //when
        int[] result = sort.sort(input);

        ///then
        assertThat(result).isEqualTo(new int[]{1});
    }
}