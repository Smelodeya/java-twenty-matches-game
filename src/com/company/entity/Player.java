package com.company.entity;

public class Player {
    private String name;
    private int numberOfTakenMatches;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int numberOfTakenMatches) {
        this.name = name;
        this.numberOfTakenMatches = numberOfTakenMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTakenMatches() {
        return numberOfTakenMatches;
    }

    public void setNumberOfTakenMatches(int numberOfTakenMatches) {
        this.numberOfTakenMatches = numberOfTakenMatches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (numberOfTakenMatches != player.numberOfTakenMatches) return false;
        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + numberOfTakenMatches;
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", numberOfTakenMatches=" + numberOfTakenMatches +
                '}';
    }
}
