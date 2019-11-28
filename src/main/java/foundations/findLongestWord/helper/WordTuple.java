package foundations.findLongestWord.helper;

public class WordTuple {

    private final String word;
    private Integer charsSeenUntil;

    public WordTuple(String word) {
        this.word = word;
        this.charsSeenUntil = 0;
    }

    public String getWord() {
        return word;
    }

    public int getCharsSeenUntil() {
        return charsSeenUntil;
    }

    public void setCharsSeenUntil(int charsSeenUntil) {
        this.charsSeenUntil = charsSeenUntil;
    }

    public void increment() {
        this.charsSeenUntil = this.charsSeenUntil + 1;
    }

    public boolean found() {
        return this.charsSeenUntil == word.length();
    }

    public char getCurrentLetter() {
        return word.charAt(charsSeenUntil);
    }

    @Override
    public int hashCode() {
        return word.hashCode() ^ charsSeenUntil.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WordTuple)) return false;
        WordTuple wordTupleO = (WordTuple) o;
        return this.word.equals(wordTupleO.getWord()) &&
                this.charsSeenUntil.equals(wordTupleO.getCharsSeenUntil());
    }
}
