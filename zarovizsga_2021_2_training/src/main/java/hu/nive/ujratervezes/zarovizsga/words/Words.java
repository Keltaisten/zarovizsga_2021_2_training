package hu.nive.ujratervezes.zarovizsga.words;

import java.util.stream.Collectors;

public class Words {
    public boolean hasMoreDigits(String s){
        return s.chars().mapToObj(c -> (char) c).mapToInt(k-> Character.isDigit(k) ? 1 : -1).sum() > 0;
    }
}
