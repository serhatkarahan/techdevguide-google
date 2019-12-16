package foundations.interpret;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class InterpretTest {

    private Interpret interpret;

    @Before
    public void setUp() {
        interpret = new Interpret();
    }

    @Test
    public void case_1() {
        //given
        int value = 0;
        String[] commands = {};
        int[] args = {};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void case_2() {
        //given
        int value = 0;
        String[] commands = {"+"};
        int[] args = {0};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(0);
    }
}