package foundations.mapShare;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapShareTest {

    private MapShare mapShare;

    @Before
    public void setUp() {
        mapShare = new MapShare();
    }

    @Test
    public void should_do_nothing_when_map_does_not_have_keys_a_or_c() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("d", "d");

        //when
        Map<String, String> result = mapShare.mapShare(map);

        ///then
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get("d")).isEqualTo("d");
    }
}