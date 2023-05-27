class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // If the input array is empty, return an empty string
        }

        String prefix = strs[0]; // Initialize the prefix with the first string

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return ""; // If the prefix becomes empty, there is no common prefix
                }
            }
        }

        return prefix;
    }
}