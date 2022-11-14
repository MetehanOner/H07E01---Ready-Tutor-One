package de.tum.in.ase;

public class Grade {
    private double value;
    private Status status;

    public Grade(double value, Status status) {
        this.value = value;
        this.status = status;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

