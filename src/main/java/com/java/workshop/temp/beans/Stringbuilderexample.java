package com.java.workshop.temp.beans;

public class Stringbuilderexample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" java");
        sb.append("is");
        sb.append("the");
        sb.append("most");
        sb.append("used");
        sb.append("language");
        sb.append("for");
        sb.append(" enterprise");
        sb.append(" applications");
        
        System.out.println(sb.toString());
    }
}
