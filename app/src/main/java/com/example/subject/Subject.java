package com.example.subject;

public class Subject {
    String title;
    String description;
    int credits;
    String teacher;

    public Subject(String title, String description, int credits, String teacher) {
        this.title = title;
        this.description = description;
        this.credits = credits;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public String getTeacher() {
        return teacher;
    }
}
