package JOOP_04_2_Interfaces_and_Abstraction_Ex.P05_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder output = new StringBuilder();
        for (String url : urls) {
            if (!url.matches("\\D+")) {
                try {
                    throw new NoSuchMethodException("Invalid URL!");
                } catch (NoSuchMethodException e) {
                    output.append(e.getMessage()).append(System.lineSeparator());
                }
            } else {
                output.append(String.format("Browsing: %s!%n", url));
            }
        }
        return output.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder output = new StringBuilder();
        for (String number : numbers) {
            if (!number.matches("\\d+")) {
                try {
                    throw new NoSuchMethodException("Invalid number!");
                } catch (NoSuchMethodException e) {
                    output.append(e.getMessage()).append(System.lineSeparator());
                }
            } else {
                output.append(String.format("Calling... %s%n", number));
            }
        }
        return output.toString().trim();
    }


    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
