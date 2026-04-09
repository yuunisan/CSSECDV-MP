package Controller;

import java.util.regex.Pattern;

/**
 * InputValidator — centralized input validation (Section 2.3).
 *
 * Policy: Reject-by-Default.
 * - All validation failures return an error message (non-null).
 * - Callers MUST reject the input entirely on any non-null result.
 * - Sanitization or "cleaning" of input is strictly prohibited.
 */
public class InputValidator {

    // -------------------------------------------------------------------------
    // Constraints
    // -------------------------------------------------------------------------

    /** Maximum allowed length for a username (characters). */
    public static final int MAX_USERNAME_LENGTH = 32;

    /** Minimum allowed length for a password (characters). */
    public static final int MIN_PASSWORD_LENGTH = 8;

    /** Maximum allowed length for a password (characters). */
    public static final int MAX_PASSWORD_LENGTH = 64;

    /** Maximum allowed length for a product name (characters). */
    public static final int MAX_PRODUCT_NAME_LENGTH = 100;

    /** Maximum allowed stock value. */
    public static final int MAX_STOCK = 999999;

    /** Maximum allowed price value. */
    public static final double MAX_PRICE = 999999.99;

    /** Minimum valid role code (inclusive). */
    public static final int MIN_ROLE = 1;

    /** Maximum valid role code (inclusive). */
    public static final int MAX_ROLE = 5;

    // -------------------------------------------------------------------------
    // Whitelist Patterns
    // -------------------------------------------------------------------------

    /**
     * Username: alphanumeric characters and underscores only.
     * Matches: a-z, A-Z, 0-9, _
     */
    private static final Pattern USERNAME_PATTERN =
            Pattern.compile("^[a-zA-Z0-9_]+$");

    /**
     * Password policy: minimum 8, maximum 64 characters.
     * Must contain at least one uppercase letter, one lowercase letter,
     * one digit, and one special character from [@$!%*?&].
     */
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile(
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])"
                + "[A-Za-z\\d@$!%*?&]{" + MIN_PASSWORD_LENGTH + "," + MAX_PASSWORD_LENGTH + "}$"
            );

    /**
     * Product name: alphanumeric characters, spaces, hyphens, underscores,
     * and periods only.
     */
    private static final Pattern PRODUCT_NAME_PATTERN =
            Pattern.compile("^[a-zA-Z0-9 \\-_.]+$");

    // -------------------------------------------------------------------------
    // Validation Methods
    // Returns null if the value is VALID.
    // Returns a non-null error message string if the value is INVALID.
    // -------------------------------------------------------------------------

    /**
     * Validates a username.
     * Rules: non-empty, max {@value #MAX_USERNAME_LENGTH} chars,
     * alphanumeric + underscore only (whitelist).
     *
     * @param username the username to validate
     * @return null if valid; error message string if invalid
     */
    public static String validateUsername(String username) {
        if (username == null || username.isEmpty()) {
            return "Username cannot be empty.";
        }
        if (username.length() > MAX_USERNAME_LENGTH) {
            return "Username must not exceed " + MAX_USERNAME_LENGTH + " characters.";
        }
        if (!USERNAME_PATTERN.matcher(username).matches()) {
            return "Username may only contain alphanumeric characters and underscores.";
        }
        return null; // valid
    }

    /**
     * Validates a password against the password policy.
     * Rules: length [{@value #MIN_PASSWORD_LENGTH}–{@value #MAX_PASSWORD_LENGTH}],
     * must include uppercase, lowercase, digit, and special character.
     *
     * @param password the plaintext password to validate
     * @return null if valid; error message string if invalid
     */
    public static String validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            return "Password cannot be empty.";
        }
        if (password.length() < MIN_PASSWORD_LENGTH || password.length() > MAX_PASSWORD_LENGTH) {
            return "Password must be between " + MIN_PASSWORD_LENGTH
                    + " and " + MAX_PASSWORD_LENGTH + " characters.";
        }
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            return "Password must contain at least 1 uppercase letter, "
                    + "1 lowercase letter, 1 digit, and 1 special character (@$!%*?&).";
        }
        return null; // valid
    }

    /**
     * Validates a product name.
     * Rules: non-empty, max {@value #MAX_PRODUCT_NAME_LENGTH} chars,
     * alphanumeric + spaces + hyphens + underscores + periods only (whitelist).
     *
     * @param name the product name to validate
     * @return null if valid; error message string if invalid
     */
    public static String validateProductName(String name) {
        if (name == null || name.isEmpty()) {
            return "Product name cannot be empty.";
        }
        if (name.length() > MAX_PRODUCT_NAME_LENGTH) {
            return "Product name must not exceed " + MAX_PRODUCT_NAME_LENGTH + " characters.";
        }
        if (!PRODUCT_NAME_PATTERN.matcher(name).matches()) {
            return "Product name may only contain letters, digits, spaces, "
                    + "hyphens, underscores, and periods.";
        }
        return null; // valid
    }

    /**
     * Validates a stock integer value.
     * Rules: non-negative, at most {@value #MAX_STOCK}.
     *
     * @param stock the stock value to validate
     * @return null if valid; error message string if invalid
     */
    public static String validateStock(int stock) {
        if (stock < 0) {
            return "Stock must be a non-negative integer.";
        }
        if (stock > MAX_STOCK) {
            return "Stock must not exceed " + MAX_STOCK + ".";
        }
        return null; // valid
    }

    /**
     * Validates a price value.
     * Rules: non-negative, at most {@value #MAX_PRICE}.
     *
     * @param price the price to validate
     * @return null if valid; error message string if invalid
     */
    public static String validatePrice(double price) {
        if (price < 0.0) {
            return "Price must be a non-negative value.";
        }
        if (price > MAX_PRICE) {
            return "Price must not exceed " + MAX_PRICE + ".";
        }
        return null; // valid
    }

    /**
     * Validates a role code.
     * Rules: integer in range [{@value #MIN_ROLE}–{@value #MAX_ROLE}].
     *
     * @param role the role code to validate
     * @return null if valid; error message string if invalid
     */
    public static String validateRole(int role) {
        if (role < MIN_ROLE || role > MAX_ROLE) {
            return "Role code must be between " + MIN_ROLE + " and " + MAX_ROLE + ".";
        }
        return null; // valid
    }

    /**
     * Validates a purchase quantity.
     * Rules: positive integer, must not exceed available stock,
     * and must not exceed {@value #MAX_STOCK}.
     *
     * @param quantity  the requested purchase quantity
     * @param maxStock  the current available stock
     * @return null if valid; error message string if invalid
     */
    public static String validateQuantity(int quantity, int maxStock) {
        if (quantity <= 0) {
            return "Quantity must be a positive integer.";
        }
        if (quantity > maxStock) {
            return "Not enough stock available. Available: " + maxStock + ".";
        }
        if (quantity > MAX_STOCK) {
            return "Quantity must not exceed " + MAX_STOCK + ".";
        }
        return null; // valid
    }
}
