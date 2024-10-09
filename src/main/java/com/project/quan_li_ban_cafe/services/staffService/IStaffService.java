package com.project.quan_li_ban_cafe.services.staffService;

import com.project.quan_li_ban_cafe.models.Staff;

import java.util.List;

public interface IStaffService {
    public Staff createStaff(Staff staff);
    public Staff updateStaff(long id,Staff staff);
    public boolean deleteStaff(long id);
    public List<Staff> getAllStaff();
    public Staff getOneStaff(long id);
}
