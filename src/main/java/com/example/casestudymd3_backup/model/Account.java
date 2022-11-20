package com.example.casestudymd3_backup.model;

public class Account {
    private int id;
    private String name;
    private String password;
    private String image;
    private int isAdmin;
    private int isSell;

    public Account(String name, String password, String image) {
        this.name = name;
        this.password = password;
        this.image = image;
    }

    public Account(String name, String password, String image, int isAdmin, int isSell) {
        this.name = name;
        this.password = password;
        this.image = image;
        this.isAdmin = isAdmin;
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", isAdmin=" + isAdmin +
                ", isSell=" + isSell +
                '}';
    }
}
