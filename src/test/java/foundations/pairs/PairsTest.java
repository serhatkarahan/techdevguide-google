package foundations.pairs;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PairsTest {

    private Pairs pairs;

    @Before
    public void setUp() {
        pairs = new Pairs();
    }

    @Test
    public void case_1() {
        //given
        String[] strings = {"code", "bug"};

        //when
        Map<String, String> result = pairs.pairs(strings);

        ///then
        assertThat(result).hasSize(2);
        assertThat(result.get("c")).isEqualTo("e");
        assertThat(result.get("b")).isEqualTo("g");
    }

    @Test
    public void case_2() {
        //given
        String[] strings = {"man", "moon", "main"};

        //when
        Map<String, String> result = pairs.pairs(strings);

        ///then
        assertThat(result).hasSize(1);
        assertThat(result.get("m")).isEqualTo("n");
    }

    @Test
    public void case_3() {
        //given
        String[] strings = {"man", "moon", "good", "night"};

        //when
        Map<String, String> result = pairs.pairs(strings);

        ///then
        assertThat(result).hasSize(3);
        assertThat(result.get("m")).isEqualTo("n");
        assertThat(result.get("g")).isEqualTo("d");
        assertThat(result.get("n")).isEqualTo("t");
    }
}