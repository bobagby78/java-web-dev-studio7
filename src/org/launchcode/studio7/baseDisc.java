package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class baseDisc {
    //TODO add name capacity contents and disc type
    private String name;
    private int totalCapacity;
    private int availableCapacity;
    private int usedCapacity;
    private ArrayList<String> contents;
    private String discType;

    public baseDisc(String name, int totalCapacity, String discType) {
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.discType = discType;
    }
    public void writeDate(int kb, ArrayList<String> content){
        if(kb < availableCapacity){
            usedCapacity += kb;
            availableCapacity = totalCapacity - usedCapacity;
            contents = content;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }



}
