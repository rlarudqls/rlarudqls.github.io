package org.opentutorials.javatutorials.method;
 
public class ReturnDemo3{
 
    public static String[] getMembers() {
        String[] members = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}