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
    }
}
