package org.learn.model;

import java.util.ArrayList;
import java.util.Date;

public class ComplexForm {

    private String txtName;
    private String  txtId;
    private String txtDOB;
    private ArrayList subjects = new ArrayList();
    private String gender;
    private String studentType;

    private ComplexFormAddress address;

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtDOB() {
        return txtDOB;
    }

    public void setTxtDOB(String txtDOB) {
        this.txtDOB = txtDOB;
    }

    public ArrayList getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList list) {
        this.subjects = list;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public ComplexFormAddress getAddress() {
        return address;
    }

    public void setAddress(ComplexFormAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComplexForm{" +
                "txtName='" + txtName + '\'' +
                ", txtId='" + txtId + '\'' +
                ", txtDOB='" + txtDOB + '\'' +
                ", list=" + subjects +
                ", gender='" + gender + '\'' +
                ", studentType='" + studentType + '\'' +
                ", address ='" + address + '\'' +
                '}';
    }
}
