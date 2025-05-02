package ejerc04;

public class Mirror {
    public String mirrorEnds(String input) {
        if (input.isEmpty()) {
            return "";
        }

        StringBuilder mirrored = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == input.charAt(length - 1 - i)) {
                mirrored.append(input.charAt(i));
            } else {
                break;
            }
        }

        return mirrored.toString();
    }
}