/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.interns.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leon
 */





import java.util.List;
import org.crce.interns.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("directoryService")
public class DirectoryServiceImpl implements DirectoryService {

    @Autowired
    private DirectoryDAO directoryDAO;

    public void setLoginDAO(DirectoryDAO directoryDAO) {
        this.directoryDAO = directoryDAO;
    }

   /* public String checkLogin(String userName, String userPassword) {
        System.out.println("In Service class...Check Login");
        return loginDAO.checkLogin(userName, userPassword);
    }
*/
        
        
    @Override
    public List createStudentFolder() {
        System.out.println("Service");
        return directoryDAO.createStudentFolder();
    }
    
    @Override
    public List createFacultyFolder()
    {
        System.out.println("fac Service");
        return directoryDAO.createFacultyFolder();
    }
    
    
    @Override
    public List createTpoFolder() {
        System.out.println(" tpo Service");
        return directoryDAO.createTpoFolder();
    }
    
    @Override
    public List createCompanyFolder()
    {
        System.out.println("Company Service");
        return directoryDAO.createCompanyFolder();
    }
}
