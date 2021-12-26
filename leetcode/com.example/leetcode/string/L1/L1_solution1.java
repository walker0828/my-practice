package com.example.leetcode.string.L1;

public class L1_Solutuion1 {
    public static void main(String[] args) {
        this.findOcurrences("1","1","1");
    }

    public String[] findOcurrences(String text, String first, String second) {
        String[] temp = new String[text.split(" ").length-2];
        String[] splitedWords = text.split(" ");
        int j = 0;
        for(int i =0; i< splitedWords.length-2;) {
            if(splitedWords[i].equals(first) && splitedWords[i+1].equals(second)){
                temp[j] = splitedWords[i+2];
                j++;
            }
            i++;
        }
        String[] result = new String[j];
        for(int i=0;i<j;i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
