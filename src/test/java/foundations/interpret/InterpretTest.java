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
    public void valid_input_case_1() {
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
    public void valid_input_case_2() {
        //given
        int value = 0;
        String[] commands = {"+"};
        int[] args = {1, 2};

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

    @Test
    public void case_3() {
        //given
        int value = 0;
        String[] commands = {"+"};
        int[] args = {1};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void case_4() {
        //given
        int value = 0;
        String[] commands = {"-"};
        int[] args = {1};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void case_5() {
        //given
        int value = 0;
        String[] commands = {"*"};
        int[] args = {1};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void case_6() {
        //given
        int value = 3;
        String[] commands = {"*", "+"};
        int[] args = {2, 4};

        //when
        int result = this.interpret.interpret(value, commands, args);

        ///then
        assertThat(result).isEqualTo(10);
    }
}