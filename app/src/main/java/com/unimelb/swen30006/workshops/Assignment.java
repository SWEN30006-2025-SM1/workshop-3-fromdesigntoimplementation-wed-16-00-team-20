package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private List<Submission> submissions;

    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
        this.submissions = new ArrayList<>();
    }

    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

    public Submission[] invalidSubmissions() {
        List<Submission> invalid = new ArrayList<>();
        for (Submission s : submissions) {
            if (s.getAttemptNum() > maxAttempts) {
                invalid.add(s);
            }
        }
        return invalid.toArray(new Submission[0]);
    }

    public Submission[] validSubmissions() {
        List<Submission> valid = new ArrayList<>();
        for (Submission s : submissions) {
            if (s.getAttemptNum() <= maxAttempts) {
                valid.add(s);
            }
        }
        return valid.toArray(new Submission[0]);
    }
}