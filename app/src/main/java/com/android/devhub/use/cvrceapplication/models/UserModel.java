package com.android.devhub.use.cvrceapplication.models;

/**
 * Created by user on 7/24/2018.
 */

public class UserModel {
    private  String regid,username,first_name,last_name,email,branch,hostel;

    public UserModel(String regid, String username,String first_name,String last_name,String email,String branch,String hostel) {
        this.regid = regid;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.branch=branch;
        this.hostel=hostel;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getBranch() {
        return branch;
    }


    public String getFirst_name() {
        return regid;
    }

    public void setFirst_name(String regid) {
        this.regid = regid;
    }


    public String getLast_name() {
        return regid;
    }

    public void setLast_name(String regid) {
        this.regid = regid;
    }


    public String getEmail() {
        return regid;
    }

    public void setEmail(String regid) {
        this.regid = regid;
    }




    public void setBranch(String branch) {
        this.branch= branch;
    }
    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

}
