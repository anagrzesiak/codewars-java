package katas;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String s = Arrays.stream(morseCode.trim().split("   ")).map(MorseCodeDecoder::translate).collect(Collectors.joining(" "));
        return s;
    }

    public static String translate(String word) {
        String s = Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
        return s;
    }
}

