package com.arun.employee;

public class EmpModel {

    public  String empName;
    public String desig;
    public String salary;
    public String place;
    public String compName;
    public String email;
    public String mob;

    public EmpModel() {

    }

    public EmpModel(String empName, String desig, String salary, String place, String compName, String email, String mob) {
        this.empName = empName;
        this.desig = desig;
        this.salary = salary;
        this.place = place;
        this.compName = compName;
        this.email = email;
        this.mob = mob;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
