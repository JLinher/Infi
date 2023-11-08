package at.Jali.basis;

public class CaesarVerschluesselung {
    public static String encrypt(String text, int shiftKey) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char encryptedChar = (char) (base + (character - base + shiftKey) % 26);
                result.append(encryptedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shiftKey) {
        return encrypt(text, 26 - shiftKey); // Umgekehrter Shift für Entschlüsselung
    }

    public static void main(String[] args) {
        String originalText = "Jan Linher";
        int shiftKey = 3;

        String encryptedText = encrypt(originalText, shiftKey);
        System.out.println("Verschlüsselt: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shiftKey);
        System.out.println("Entschlüsselt: " + decryptedText);
    }
}