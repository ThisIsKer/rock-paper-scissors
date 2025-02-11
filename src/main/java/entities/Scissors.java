package entities;

import interfaces.Choice;
import enums.Type;

public class Scissors implements Choice {

    private static final String WIN_MESSAGE = "You win! Scissors beat Paper!";
    private static final String LOSE_MESSAGE = "You lose! Rock beats Scissors!";
    private static final String DESCRIPTION = "Scissors";

    @Override
    public boolean winsAgainst(Choice choice) {
        return choice.getType().equals(Type.PAPER);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public Type getType() {
        return Type.SCISSORS;
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
