package com.github.snowhite93.stringholder;

public class StringHolder {

    private String value;

    public void holdValue(String value) {
        this.value = value;
    }

    public String getStoredString() {
        return value;
    }

    public void reset() {
        this.value = null;
    }

    public boolean hasValue() {
        return value != null;
    }

}
