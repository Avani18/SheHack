package com.example.shehack;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class Details {

    @SerializedName("line")
    private List<String> line;

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

}
