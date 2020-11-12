package com.phonecompany.billing.entity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Call {

    private String phoneNumber;
    private LocalDateTime start;
    private LocalDateTime end;
    private float length;

    // === constructors ===
    public Call(String csvRecord) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy H:m:s", Locale.ENGLISH);

        String[] parsedRecord = csvRecord.split(",");

        this.phoneNumber = parsedRecord[0];
        this.start = LocalDateTime.parse(parsedRecord[1], formatter);
        this.end = LocalDateTime.parse(parsedRecord[2], formatter);

        Duration diff = Duration.between(this.start, this.end);
        this.length = diff.toSeconds()/60f;
    }

    // === public methods ===
    public void getLength() {

    }

    // === getters and setters ===
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime endCall) {
        this.end = endCall;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Call{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", length=" + length +
                '}';
    }
}
