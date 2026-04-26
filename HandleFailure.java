package com.life;

import java.util.Random;

public class HandleFailure {

    public static void main(String[] args) {

        boolean success = false;

        while (!success) {
            try {
                achieveGoal();
                success = true;
                System.out.println("🎉 Goal achieved successfully!");
            } catch (Exception e) {
                learn(e);
                retry();
            }
        }
    }

    // Method to simulate success/failure
    public static void achieveGoal() throws Exception {
        Random rand = new Random();

        if (rand.nextInt(5) != 0) { // 80% failure chance
            throw new Exception("Failed attempt");
        }

        System.out.println("Trying...");
    }

    // Learn from mistake
    public static void learn(Exception e) {
        System.out.println("Learning from error: " + e.getMessage());
    }

    // Retry message
    public static void retry() {
        System.out.println("Retrying again... 🔁\n");
    }
}
