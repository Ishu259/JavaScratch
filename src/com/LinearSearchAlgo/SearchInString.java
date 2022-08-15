package com.LinearSearchAlgo;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Ishwarya";
        char target = 'm';
        System.out.println(search(name, target));
        System.out.println(search2(name, 'a'));
    }

    //using charat()
    static boolean search(String str, char target) {
        if (str.length() == 0) {  //for string...to get length..we should call the length() func...but in array,its(length) is a variable
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //usign for each method
    static boolean search2(String str, char target) {
        if (str.length() == 0) {  //for string...to get length..we should call the length() func...but in array,its(length) is a variable
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
