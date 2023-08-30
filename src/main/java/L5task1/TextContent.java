package L5task1;

public class TextContent {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\tl\\IdeaProjects\\L5task\\src\\main\\resources\\textPalindrome";

        String content = FileUtils.readFromFile(filePath);

        if (!content.isEmpty()) {
            System.out.println("The text contains characters.");
            System.out.println(content.length());
        }

        boolean isPalindrome = isPalindrome(content);

        if (isPalindrome) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String content) {
        String reversedText = new StringBuilder(content).reverse().toString();
        return content.equals(reversedText);
    }
}
