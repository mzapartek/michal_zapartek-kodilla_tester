public class Color {
    public String getColor() {
        String letter = UserDialogs.getColorSelection();

        return switch (letter) {
            case "R" -> "Red";
            case "G" -> "Green";
            case "B" -> "Blue";
            case "Y" -> "Yellow";
            default -> "Unknown color";
        };
    }
}