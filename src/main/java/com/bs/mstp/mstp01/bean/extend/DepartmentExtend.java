package com.bs.mstp.mstp01.bean.extend;

import com.bs.mstp.mstp01.bean.Department;
import com.bs.mstp.mstp01.bean.Staff;

public class DepartmentExtend extends Department {

    private Staff staff;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
