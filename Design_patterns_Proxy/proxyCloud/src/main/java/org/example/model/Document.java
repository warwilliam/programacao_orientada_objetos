package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private int id;
    private String url;
    private String content;

    private List<Account> accounts = new ArrayList<>();

    public Document() {
    }

    public Document(int id, String url, String content) {
        this.id = id;
        this.url = url;
        this.content = content;
    }
    public boolean searchAccount(String email){
        boolean result = false;
    
        for (Account account : accounts){
      if(account.getEmail() == email){
            result = true;        
            } else {
          result = false;
      }
            
        }
    
        return result;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account account){
        this.accounts.add(account);
    }
}
