package interfaces;

import enums.Type;

public interface Choice {
    public boolean winsAgainst(Choice choice);
    public Type getType();

    public String getDescription();

    public String winMessage();

    public String loseMessage();

}
