class Solution {
    public String reverseWords(String s) {
  
        StringBuilder result = new StringBuilder();

        // Start from the end
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;

            // End of current word
            int end = i;

            // Move left until space
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Extract word
            String word = s.substring(i + 1, end + 1);

            if (result.length() > 0)
                result.append(" ");

            result.append(word);
        }

        return result.toString();
      }
}