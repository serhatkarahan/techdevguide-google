package foundations.findLongestWord;

import foundations.findLongestWord.helper.WordTuple;

import java.util.*;

/*
    An optimal O(N+L) approach for any alphabet.
    Instead of processing the words one at a time, we will process all words simultaneously
 */
public class FindLongestWordImpl4 implements FindLongestWord {

    public String solution(String s, List<String> d) {
        String result = "";

        Map<Character, List<WordTuple>> wordsByLettersToBeFoundNextInS = initializeWordsByLetters(d);
        List<WordTuple> found  = new ArrayList<>();
        for (char c : s.toCharArray()) {
            List<WordTuple> wordTupleList = wordsByLettersToBeFoundNextInS.get(c);
            if (wordTupleList != null) {
                List<WordTuple> toBePlaced  = new ArrayList<>();
                wordTupleList.forEach(wordTuple -> {
                    wordTuple.increment();
                    if (wordTuple.found()) {
                        found.add(wordTuple);
                    } else {
                        toBePlaced.add(wordTuple);
                    }
                });
                wordTupleList.clear();
                toBePlaced.forEach(toBePlacedWordTuple -> {
                    List<WordTuple> updatedWordTupleList = wordsByLettersToBeFoundNextInS
                            .getOrDefault(toBePlacedWordTuple.getCurrentLetter(), new ArrayList<>());
                    updatedWordTupleList.add(toBePlacedWordTuple);
                    wordsByLettersToBeFoundNextInS.put(toBePlacedWordTuple.getCurrentLetter(), updatedWordTupleList);
                });
            }
        }
        Optional<String> longestWordOptional = found.stream()
                .map(WordTuple::getWord)
                .max(Comparator.comparingInt(String::length));
        return longestWordOptional.orElse("");
    }

    private Map<Character, List<WordTuple>> initializeWordsByLetters(List<String> d) {
        List<WordTuple> wordTupleList = initializeWordTuples(d);
        Map<Character, List<WordTuple>> wordsByLettersToBeFoundNextInS = new HashMap<>();
        wordTupleList.forEach(wordTuple -> {
            String word = wordTuple.getWord();
            char firstLetter = word.charAt(0);
            List<WordTuple> wordTuplesByLetter = wordsByLettersToBeFoundNextInS.getOrDefault(firstLetter, new ArrayList<>());
            wordTuplesByLetter.add(wordTuple);
            wordsByLettersToBeFoundNextInS.put(firstLetter, wordTuplesByLetter);
        });
        return wordsByLettersToBeFoundNextInS;
    }

    private List<WordTuple> initializeWordTuples(List<String> d) {
        List<WordTuple> wordTupleList = new ArrayList<>();
        for (String word : d) {
            wordTupleList.add(new WordTuple(word));
        }
        return wordTupleList;
    }
}
