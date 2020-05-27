package com.bs.mstp.mstp01.bean.extend;

import com.bs.mstp.mstp01.bean.Department;
import com.bs.mstp.mstp01.bean.Staff;

public class StaffExtend extends Staff {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
