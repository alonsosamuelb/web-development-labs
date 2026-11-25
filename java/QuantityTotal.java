/**
 * AI-assisted learning exercise for parsing command-line arguments.
 */
public final class QuantityTotal {
    private QuantityTotal() {}

    static long total(String[] quantities) {
        if (quantities.length == 0) {
            throw new IllegalArgumentException("Provide at least one positive whole number.");
        }

        long result = 0;
        for (String quantity : quantities) {
            int value;
            try {
                value = Integer.parseInt(quantity);
            } catch (NumberFormatException exception) {
                throw new IllegalArgumentException("Each quantity must be a positive whole number within the integer range.");
            }
            if (value <= 0) {
                throw new IllegalArgumentException("Quantities must be greater than zero.");
            }
            result += value;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(total(args));
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
            System.exit(2);
        }
    }
}
