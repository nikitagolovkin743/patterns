package com.golovkin.task1.domain;

import java.util.Random;

public class CardNumber {
    public static final int DIGIT_COUNT = 16;
    public static final int DIGIT_IN_GROUP_COUNT = 4;
    private static Random random = new Random();
    private int[] number;

    public CardNumber() {
        number = random.ints(DIGIT_COUNT, 0, 10).toArray();
    }

    @Override
    public String toString() {
        StringBuilder cardNumberStringBuilder = new StringBuilder();

        for (int i = 0; i < number.length; i++) {
            if (i % DIGIT_IN_GROUP_COUNT == 0 && i != 0) {
                cardNumberStringBuilder.append(' ');
            }

            cardNumberStringBuilder.append(number[i]);
        }

        return cardNumberStringBuilder.toString();
    }
}
