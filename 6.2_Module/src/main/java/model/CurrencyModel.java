package model;


public class CurrencyModel {

    public double exchangeCurrency(int amount, String from, String to) {

        String conversion = from + " to " + to;
        
        switch (conversion) {
            // EUR MUUNNOKSET
            case "EUR to USD" -> {
                return amount * 1.043;}
            case "EUR to GBP" -> {
                return amount * 0.829;}
            case "EUR to SEK" -> {
                return amount * 11.203;}
            case "EUR to EUR" -> {
                return amount;}

            // USD MUUNNOKSET
            case "USD to EUR" -> {
                return amount * 0.958;}
            case "USD to GBP" -> {
                return amount * 0.794;}
            case "USD to SEK" -> {
                return amount * 10.737;}
            case "USD to USD" -> {
                return amount;}

            // GBP MUUNNOKSET
            case "GBP to EUR" -> {
                return amount * 1.207;}
            case "GBP to USD" -> {
                return amount * 1.259;}
            case "GBP to SEK" -> {
                return amount * 13.519;}
            case "GBP to GBP" -> {
                return amount;}

            // SEK MUUNNOKSET
            case "SEK to EUR" -> {
                return amount * 0.089;}
            case "SEK to USD" -> {
                return amount * 0.093;}
            case "SEK to GBP" -> {
                return amount * 0.074;}
            case "SEK to SEK" -> {
                return amount;}

            default -> throw new AssertionError();
        }
    } 
}
