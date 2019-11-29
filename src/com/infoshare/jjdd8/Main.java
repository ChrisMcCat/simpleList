package com.infoshare.jjdd8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<String> words = new ArrayList<>();

	words.add("quick");
	words.add("brown");
	words.add("fox");

        System.out.println(words);

        System.out.println(words.contains("fox"));

        System.out.println(!words.isEmpty());

        System.out.println(words.size() == 3);

        System.out.println(getSquares(10));
    }

    public static List<Integer> getSquares(int size) {
        List<Integer> squares = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            squares.add(i * i);
        }

        return squares;
    }
}
