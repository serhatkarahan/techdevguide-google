package foundations.canBalance;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanBalanceTest {

    CanBalance canBalance;

    @Before
    public void setUp() {
        canBalance = new CanBalance();
    }

    @Test
    public void case_1() {
        //given
        int[] nums = new int[]{1,1};

        //when
        boolean result = canBalance.canBalance(nums);

        ///then
        assertThat(result).isTrue();
    }

    @Test
    public void case_2() {
        //given
        int[] nums = new int[]{1,2};

        //when
        boolean result = canBalance.canBalance(nums);

        ///then
        assertThat(result).isFalse();
    }
}