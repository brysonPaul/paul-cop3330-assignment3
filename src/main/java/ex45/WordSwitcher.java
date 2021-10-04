package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class WordSwitcher {
    public String leavingWord;
    public String wordReplacingLeavingWord;

    public WordSwitcher(String leavingWord,String wordReplacingLeavingWord){
        this.leavingWord=leavingWord;
        this.wordReplacingLeavingWord=wordReplacingLeavingWord;
    }

    /*
        if(string.length<switchingWord)
            return str
        end if
        newString = " "
        startIndex = 0
        if(string doesnt contain word)
            return string
        else
            startIndex= string.indexOf(switchingWOrd)
            newString= substring of everything before switching word + new word + substring of everything behind it
            return replaceWord(newString) //to check for more occurances (SO ELEGANT AHH)
        end if
     */
    public String replaceWordIfThere(String str){
        if(str.length()<leavingWord.length()){
            return str;//cant be here if less than
        }
        String newString = "";
        int startIndex = 0;
        if(!str.contains(leavingWord)){
            return str;
        } else{
            startIndex = str.indexOf(leavingWord);
            newString= str.substring(0,startIndex)+wordReplacingLeavingWord+str.substring(startIndex+leavingWord.length());
            return replaceWordIfThere(newString);
        }
    }



}
