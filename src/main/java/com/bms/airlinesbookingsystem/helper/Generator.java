package com.bms.airlinesbookingsystem.helper;

import java.util.Random;

public class Generator {
    private static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final Random random = new Random();
    private static final StringBuilder code = new StringBuilder();
    private Generator() {
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static String generateAirCraftNumber() {

        for (int i = 0; i < 3; i++) {
            code.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        code.append("-");

        for (int i = 0; i < 3; i++) {

            code.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }

        code.append("-");

        for (int i = 0; i < 4; i++) {
            code.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }

        return code.toString();
    }

    public static String generateRouteCode() {

        for (int i = 0; i < 3; i++) {
            code.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }

        code.append("-");

        for (int i = 0; i < 3; i++) {
            code.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }

        code.append("-");

        for (int i = 0; i < 2; i++) {
            code.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }

        return code.toString();
    }
}
