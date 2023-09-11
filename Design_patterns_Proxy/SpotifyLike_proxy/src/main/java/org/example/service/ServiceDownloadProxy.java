package org.example.service;

import org.example.model.User;

import java.util.Scanner;

public class ServiceDownloadProxy implements IServiceDownload {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void doDownloadMusic(User user) {

        if (user.isPremium()){
            ServiceDownload serviceDownload = new ServiceDownload();
            serviceDownload.doDownloadMusic(user);
        } else {

            System.out.println("Usuario Free, não possiu a funcção download, gostaria de fazer upgrade agora?");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("sim")){
                System.out.println("Realizando o upgrade agora mesmo");
                user.upToPremium();
                ServiceDownload serviceDownload = new ServiceDownload();
                serviceDownload.doDownloadMusic(user);
                scanner.close();
            } else {
                System.out.println("COntinuar com a conta free");
                scanner.close();
            }
        }
    }
}
