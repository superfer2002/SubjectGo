package com.example.subject;

public class Subject {
    int title;
    int description;
    int credits;
    int teacher;

    public Subject(int title, int description, int credits, int teacher) {
        this.title = title;
        this.description = description;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public int getTeacher() {
        return teacher;
    }
}
