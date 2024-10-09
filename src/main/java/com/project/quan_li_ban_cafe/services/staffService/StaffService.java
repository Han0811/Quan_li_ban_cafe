package com.project.quan_li_ban_cafe.services.staffService;

import com.project.quan_li_ban_cafe.models.Staff;
import com.project.quan_li_ban_cafe.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff createStaff(Staff staff) {
        if(staff != null) {
            return staffRepository.save(staff);
        }
        return null;
    }

    @Override
    public Staff updateStaff(long id, Staff staff) {
        if(staff != null) {
            Staff result = staffRepository.getById(id);
            if(result != null) {
                result.setFullname(staff.getFullname());
                result.setGender(staff.getGender());
                result.setAddress(staff.getAddress());
                result.setMail(staff.getMail());
                result.setPhone_number(staff.getPhone_number());
                result.setBirthday(staff.getBirthday());

                return staffRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteStaff(long id) {
        if(id > 0){
            Staff result = staffRepository.getById(id);
            if(result != null) {
                staffRepository.delete(result);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getOneStaff(long id) {
        return staffRepository.getById(id);
    }
}
