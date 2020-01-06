package foundations.encoder;

import java.util.HashMap;
import java.util.Map;

public class Encoder {

    public String[] encoder(String[] raw, String[] code_words) {
        int codeWordsIndex = 0;
        Map<String, String> encodedWords = new HashMap<>();
        String[] result = new String[raw.length];

        for (int i = 0; i < raw.length; i++) {
            String word = raw[i];
            if (encodedWords.get(word) != null) {
                result[i] = encodedWords.get(word);
            } else {
                String codeWord = code_words[codeWordsIndex];
                result[i] = codeWord;
                encodedWords.put(word, codeWord);
                codeWordsIndex++;
            }
        }
        return result;
    }
}
