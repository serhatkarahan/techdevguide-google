package foundations.mapShare;

import java.util.Map;

public class MapShare {

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        return map;
    }
}
