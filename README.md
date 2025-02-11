# rock-paper-scissors

rock-paper-scissors is a tiny Java project, purposely over-engineered, that simulates the game rock/paper/scissors.

## The project structure

There are two main directories: "java" and "test".

The first one contains the game itself: the root contains the "GameRunner" class, which is responsible for the management of the game session. We then have the packages "entities", "enums" and "interfaces".

The "entities" package contains the three possible moves a player can make, coded to classes: "Rock", "Paper", "Scissors". Each of these classes implements the "Choice" interface contained in the "interfaces" package. "Enums" contains just the "Type" class, describing the types of possible moves.

Finally, the test directory contains the unit tests related to the correct functioning of the win-lose logics contained in the "Rock", "Paper" and "Scissors" classes.

## External libraries

The only libraries that I've indulged in are:

- **corretto-1.8**: the JDK I'm using

- **junit:4.13.1**: needed to run the JUnit tests

- **hamcrest-core:1.3**: needed in order to write assertions

I've also resorted to using Maven as a project management framework.


## How to run?
Running this project is pretty simple: just navigate to the previously mentioned "java" folder, open a terminal window and type the command


```bash
javac GameRunner.java
```
This will compile the .java files and produce the .class files necessary for the next step:

```bash
java GameRunner
```

## Usage

Usage is pretty simple, if not almost self-explainatory: just input the move you want to make and the game will tell you if you've won or lost!

## Next steps

>_"The things I love most are those that usually are considered to be useless."_ - Manuel Cuni

While transforming the project in a Spring Boot application and playing rock/paper/scissors using Postman would be pointless and bring no additional value... Wouldn't it be so much fun?



## License

[GPLv3](https://www.gnu.org/licenses/gpl-3.0.html)