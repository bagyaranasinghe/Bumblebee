package com.CodewithBhagya.Bumblebee.injector;

import com.CodewithBhagya.Bumblebee.dao.AdminManager;

public class Injector {
    public AdminManager getAdminManager(){
        return new AdminManager();
    }
}
