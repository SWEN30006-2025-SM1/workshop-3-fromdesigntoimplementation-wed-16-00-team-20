package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    private int attemptNum;
    private List<File> files;

    public Submission(int attemptNum) {
        this.attemptNum = attemptNum;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public File[] includedFiles() {
        return files.toArray(new File[0]);
    }

    public int getAttemptNum() {
        return attemptNum;
    }
}