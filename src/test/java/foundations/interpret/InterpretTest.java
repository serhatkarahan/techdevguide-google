package foundations.interpret;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterpretTest {

    private Interpret interpret;

    @Before
    public void setUp() {
        interpret = new Interpret();
    }

    @Test
    public void case1() {
        //given
        int value = 0;
        String[] commands = {};
        int[] args = {};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(-1);
    }
}