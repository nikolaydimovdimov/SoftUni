import implementations.BalancedParentheses;

public class Main {
    public static void main(String[] args) {
        String input = "{3*[2/(4+2)-5*(2/(3*(5-2)))+4]+5*[7/(2-3)+6]+15}+{3*(25-12)}";
        Boolean solve = new BalancedParentheses(input).solve();
        System.out.println(solve);
    }
}
