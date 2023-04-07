package com.CodewithBhagya.Bumblebee.service;

import com.CodewithBhagya.Bumblebee.dao.AdminManager;
import com.CodewithBhagya.Bumblebee.injector.Injector;
import com.CodewithBhagya.Bumblebee.models.Admin;

import java.io.IOException;
import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {
    private static AdminServiceImpl service;
    private static final Injector injector = new Injector();
    private final AdminManager adminManager = injector.getAdminManager();

    private AdminServiceImpl() {
    }

    public static synchronized AdminServiceImpl getAdminServiceInstance() {
        if (service == null) {
            service = new AdminServiceImpl();
        }
        return service;
    }

    @Override
    public Admin verifyLogin(String adminEmail, String adminPassword) throws SQLException, ClassNotFoundException, IOException {
        if (adminEmail==null || adminPassword==null) {
            return null;
        } else {
            //verify whether email is in correct format(example@example.com) before querying database
            String regex = "^[\\w\\d._%+-]+@[\\w\\d.-]+\\.[a-zA-Z]{2,}$";
            if (!adminEmail.matches(regex)) {
                return null;
            } else {
                return adminManager.verifyLogin(adminEmail, adminPassword);
            }
        }
    }
}
