package entities;

import interfaces.Choice;
import enums.Type;

public class Paper implements Choice {

    private static final String WIN_MESSAGE = "You win! Paper beats Rock!";
    private static final String LOSE_MESSAGE = "You lose! Scissors beat Paper!";
    private static final String DESCRIPTION = "Paper";

    @Override
    public boolean winsAgainst(Choice choice) {
        return choice.getType().equals(Type.ROCK);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public Type getType() {
        return Type.PAPER;
    }

    @Override
    public String winMessage() {
        return WIN_MESSAGE;
    }

    @Override
    public String loseMessage() {
        return LOSE_MESSAGE;
    }
}
