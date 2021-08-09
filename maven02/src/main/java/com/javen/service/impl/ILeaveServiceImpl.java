package com.javen.service.impl;

import com.javen.dao.LeaveDao;
import com.javen.model.Leave;
import com.javen.service.ILeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ILeaveServiceImpl implements ILeaveService {
    @Autowired
    private LeaveDao leaveDao;

    public int SelectCount() {
        return this.leaveDao.SelectCount();
    }

    public List<Leave> selectAll(Integer pageInteger, Integer limitInteger) {
        int Index = (pageInteger-1) * limitInteger;
        int Size = limitInteger;
        return this.leaveDao.selectAll(Index, Size);
    }

    public int update(Leave leave) {
        return this.leaveDao.update(leave);
    }

    public List<Leave> selectLimit(Leave leave) {
        return this.leaveDao.selectLimit(leave);
    }
}
