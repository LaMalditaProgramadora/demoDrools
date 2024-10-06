package com.lmp.demoDrools.model;

public class Customer {
    private String code;
    private String fullName;
    private int numberOfPurchases;
    private double totalPurchases;
    private String category;

    public Customer() {
        this.category = "Uncategorized";
    }

    public Customer(String code, String fullName, int numberOfPurchases, double totalPurchases) {
        this.code = code;
        this.fullName = fullName;
        this.numberOfPurchases = numberOfPurchases;
        this.totalPurchases = totalPurchases;
        this.category = "Uncategorized";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    public void setNumberOfPurchases(int numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", numberOfPurchases=" + numberOfPurchases +
                ", totalPurchases=" + totalPurchases +
                ", category='" + category + '\'' +
                '}';
    }
}
