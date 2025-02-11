package entities;

import interfaces.Choice;

import java.util.HashMap;
import java.util.Map;

public class GameSettings {

    private static final Choice ROCK = new Rock();
    private static final Choice PAPER = new Paper();
    private static final Choice SCISSORS = new Scissors();

    private static final Choice[] CHOICES = {ROCK, PAPER, SCISSORS};
    private static final Map<String, Choice> USER_INPUT_TO_CHOICES = new HashMap<>();

    private static GameSettings instance;

    private GameSettings() {
        //Do we need a singleton? No, but we want to over-engineer this project when we have the opportunity
    }

    public static GameSettings getInstance() {
        if(instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public Choice getRock() {
        return ROCK;
    }

    public Choice getPaper() {
        return PAPER;
    }

    public Choice getScissors() {
        return SCISSORS;
    }

    public Choice[] getChoices() {
        return CHOICES;
    }

    public Map<String, Choice> getUserInputToChoices() {
        return USER_INPUT_TO_CHOICES;
    }
}