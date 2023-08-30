package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("William");
        person1.setAge(36);
        person1.setLastName("Rodrigues");
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1,1000));
        accounts.add(new Account(2,100));
        accounts.add(new Account(3,5000));

        person1.setAccounts(accounts);

        double total = person1.sumTotalAccounts(accounts);
        String client = person1.getFullName();
        System.out.println("O total das contas do cliente: "+client+" e de R$: "+ total);

    }
}