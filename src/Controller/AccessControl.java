package Controller;

import Model.User;

public class AccessControl {

    // Permissions
    public static final String VIEW_PRODUCTS = "VIEW_PRODUCTS";
    public static final String PURCHASE_PRODUCT = "PURCHASE_PRODUCT";
    public static final String MANAGE_PRODUCT = "MANAGE_PRODUCT"; // Add, Edit, Delete
    public static final String VIEW_ALL_HISTORY = "VIEW_ALL_HISTORY";
    public static final String VIEW_OWN_HISTORY = "VIEW_OWN_HISTORY";
    public static final String VIEW_USERS = "VIEW_USERS";
    public static final String VIEW_LOGS = "VIEW_LOGS";

    public static boolean hasAccess(User user, String permission) {
        if (user == null) {
            return false;
        }

        int role = user.getRole();

        // 1: Disabled
        // 2: Client
        // 3: Staff
        // 4: Manager
        // 5: Admin

        if (role == 1) { // Disabled fallback
            return false;
        }

        switch (permission) {
            case VIEW_PRODUCTS:
                return role == 2 || role == 3 || role == 4;
            case PURCHASE_PRODUCT:
                return role == 2;
            case MANAGE_PRODUCT:
                return role == 3 || role == 4;
            case VIEW_ALL_HISTORY:
                return role == 4;
            case VIEW_OWN_HISTORY:
                return role == 2 || role == 4; 
            case VIEW_USERS:
                return role == 5;
            case VIEW_LOGS:
                return role == 5;
            default:
                return false;
        }
    }
}
