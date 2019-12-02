package foundations.sumNumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumNumbersTest {

    SumNumbers sumNumbers;

    @Before
    public void setUp() {
        sumNumbers = new SumNumbers();
    }

    @Test
    public void case_1() {
        //given
        String str = "";

        //when
        int result = sumNumbers.sumNumbers(str);

        ///then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void case_2() {
        //given
        String str = "1";

        //when
        int result = sumNumbers.sumNumbers(str);

        ///then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case_3() {
        //given
        String str = "abc123xyz";

        //when
        int result = sumNumbers.sumNumbers(str);

        ///then
        assertThat(result).isEqualTo(123);
    }

    @Test
    public void case_4() {
        //given
        String str = "aa11b33";

        //when
        int result = sumNumbers.sumNumbers(str);

        ///then
        assertThat(result).isEqualTo(44);
    }

    @Test
    public void case_5() {
        //given
        String str = "7 11";

        //when
        int result = sumNumbers.sumNumbers(str);

        ///then
        assertThat(result).isEqualTo(18);
    }
}