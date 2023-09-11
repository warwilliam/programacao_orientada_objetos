package org.example;

import org.example.model.User;
import org.example.service.ServiceDownloadProxy;

public class Main {
    public static void main(String[] args) {

        User user = new User("warwilliam",true);
        User user1 = new User("jukinha",false);


            ServiceDownloadProxy serviceDownloadProxy = new ServiceDownloadProxy();
            serviceDownloadProxy.doDownloadMusic(user);
            serviceDownloadProxy.doDownloadMusic(user1);



    }
}
