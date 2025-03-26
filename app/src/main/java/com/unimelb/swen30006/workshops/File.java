package com.unimelb.swen30006.workshops;

import java.util.Date;

public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public File(Date createdDate, String fileData, String fileName) {
        this.createdDate = createdDate;
        this.fileData = fileData;
        this.fileName = fileName;
    }

    public String content() {
        return fileData;
    }

    public int fileSize() {
        return fileData != null ? fileData.length() : 0;
    }

    public String fileType() {
        if (fileName != null && fileName.contains(".")) {
            return fileName.substring(fileName.lastIndexOf('.') + 1);
        }
        return "unknown";
    }

    public String getFileName() {
        return fileName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}