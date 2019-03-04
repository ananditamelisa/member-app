package com.TugasDay1.memberapp;

public class Member {
    private String memberID;
    private String fullName;
    private String gender;
    private String address;
    private String phoneNumber;

    public Member(String memberID, String fullName, String gender, String address, String phoneNumber) {
        this.memberID = memberID;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void updateProfile(String memberID){

    }
    public void deleteMember(String memberID){

    }
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
