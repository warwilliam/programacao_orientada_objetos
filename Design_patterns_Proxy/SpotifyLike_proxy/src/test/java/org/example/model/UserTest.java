package org.example.model;

import org.example.service.ServiceDownloadProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("warwilliam",true);
    User user1 = new User("jukinha",false);

    @Test
    public void testDownload(){

        ServiceDownloadProxy serviceDownloadProxy = new ServiceDownloadProxy();
        serviceDownloadProxy.doDownloadMusic(user);
        serviceDownloadProxy.doDownloadMusic(user1);
    }


}