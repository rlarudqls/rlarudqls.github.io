package org.opentutorials.javatutorials.method;
 
public class ReturnDemo3{
 
    public static String[] getMembers() {
        String[] members = { "������", "������", "���̶�" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}