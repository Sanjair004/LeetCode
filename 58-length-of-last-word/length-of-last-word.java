class Solution {
    public int lengthOfLastWord(String s) {
        String [] split1=s.split(" ");
        return split1[split1.length-1].length();
    }
}