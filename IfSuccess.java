package com.life;

public class IfSuccess {

	 public static void main(String[] args) {

	        boolean success = false;
	        int attempts = 0;

	        while (!success) {
	            attempts++;

	            System.out.println("Attempt: " + attempts);

	            success = tryAgain();

	            if (!success) {
	                learnFromMistakes();
	            }
	        }

	        System.out.println("🎉 Success achieved after " + attempts + " attempts!");
	    }

	    public static boolean tryAgain() {
	        return Math.random() > 0.7;
	    }

	    public static void learnFromMistakes() {
	        System.out.println("Learning from mistakes... Improving 🔁");
	    }
	}
	
	
	