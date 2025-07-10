package com.example.game;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "*")
public class GuessingGameController {

    private static final int MAX_ATTEMPTS = 5;
    private int targetNumber = new Random().nextInt(100) + 1;
    private int attempts = 0;
    private final Set<Integer> previousGuesses = new HashSet<>();

   @GetMapping("/start")
        public Map<String, Object> startGame() {
        targetNumber = new Random().nextInt(100) + 1;
        attempts = 0;
        previousGuesses.clear();
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Game started! Guess a number between 1 and 100.");
        response.put("attemptsLeft", MAX_ATTEMPTS);
        return response;
    }

    @PostMapping("/guess")
    public ResponseEntity<Map<String, Object>> guessNumber(@RequestParam int guess) {
        Map<String, Object> response = new HashMap<>();

        if (guess < 1 || guess > 100) {
            response.put("message", "Invalid input! Guess between 1 and 100.");
            response.put("attemptsLeft", MAX_ATTEMPTS - attempts);
            return ResponseEntity.badRequest().body(response);
        }

        if (previousGuesses.contains(guess)) {
            response.put("message", "You already guessed this number! Try a different one.");
            response.put("attemptsLeft", MAX_ATTEMPTS - attempts);
            // Return OK since it's a game rule, not a bad request format
            return ResponseEntity.ok(response);
        }

        previousGuesses.add(guess);
        attempts++;

        if (attempts > MAX_ATTEMPTS) {
            response.put("message", "No attempts left! The number was " + targetNumber + ". Please start a new game.");
            response.put("attemptsLeft", 0);
            return ResponseEntity.ok(response);
        }

        if (guess == targetNumber) {
            response.put("message", "🎉 Congratulations! You guessed the number.");
            response.put("attemptsLeft", MAX_ATTEMPTS - attempts);
        } else if (attempts == MAX_ATTEMPTS) {
            response.put("message", "Game over! No attempts left. The number was " + targetNumber + ". Please reset the game and try again.");
            response.put("attemptsLeft", 0);
        } else if (guess < targetNumber) {
            response.put("message", "Too low!");
            response.put("attemptsLeft", MAX_ATTEMPTS - attempts);
        } else {
            response.put("message", "Too high!");
            response.put("attemptsLeft", MAX_ATTEMPTS - attempts);
        }

        return ResponseEntity.ok(response);
    }
}
