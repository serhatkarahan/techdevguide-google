package foundations.encoder;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EncoderTest {

    private Encoder encoder;

    @Before
    public void setUp() {
        encoder = new Encoder();
    }

    @Test
    public void case_1() {
        //given
        String[] raw = {"a"};
        String[] code_words = {"1", "2", "3", "4"};

        //when
        String[] result = this.encoder.encoder(raw, code_words);

        ///then
        String[] expected = {"1"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case_2() {
        //given
        String[] raw = {"a", "b"};
        String[] code_words = {"1", "2", "3", "4"};

        //when
        String[] result = this.encoder.encoder(raw, code_words);

        ///then
        String[] expected = {"1", "2"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case_3() {
        //given
        String[] raw = {"a", "b", "a"};
        String[] code_words = {"1", "2", "3", "4"};

        //when
        String[] result = this.encoder.encoder(raw, code_words);

        ///then
        String[] expected = {"1", "2", "1"};
        assertThat(result).isEqualTo(expected);
    }
}