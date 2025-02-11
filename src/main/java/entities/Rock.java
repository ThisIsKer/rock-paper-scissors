package entities;

import interfaces.Choice;
import enums.Type;

public class Rock implements Choice {

    private static final String WIN_MESSAGE = "You win! Rock beats Scissors!";
    private static final String LOSE_MESSAGE = "You lose! Paper beats Rock!";
    private static final String DESCRIPTION = "Rock";

    @Override
    public boolean winsAgainst(Choice choice) {
        return choice.getType().equals(Type.SCISSORS);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public Type getType() {
        return Type.ROCK;
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
