package org.example.service;

import org.example.model.User;

public class ServiceDownload implements IServiceDownload{
    @Override
    public void doDownloadMusic(User user) {
        System.out.println("Usuario "+user.getUserName()+ " Premium, realizando download");
    }
}
