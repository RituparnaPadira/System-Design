package org.example.user;

import lombok.Getter;

@Getter
public abstract class User {
    String name;
    int id;
    int matchesPlayed;
    int matchesWon;
}
