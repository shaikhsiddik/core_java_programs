package com.ssquare.java.oops.inheritance.Multilevel;

public class Staff extends Person {
    private int staffId;
    Staff(String name,int staffId)
    {
        super(name);
        setStaffId(staffId);
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public void display()
    {
        super.display();
        System.out.println("Staff Id is  = " + staffId);
    }
}
