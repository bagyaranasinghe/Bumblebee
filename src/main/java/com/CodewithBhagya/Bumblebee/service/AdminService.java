package com.CodewithBhagya.Bumblebee.service;

import java.io.IOException;
import java.sql.SQLException;

import com.CodewithBhagya.Bumblebee.models.Admin;

public interface AdminService {
    public Admin verifyLogin(String adminEmail, String adminPassword) throws SQLException, ClassNotFoundException, IOException;

}
