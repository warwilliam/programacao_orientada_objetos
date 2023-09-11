package org.example.model;

import org.example.service.Access;
import org.example.service.AccessProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    Account account = new Account("warwilliam@bol.com.br");
    Account account1 = new Account("jhonDoe@bol.com.br");





    @Test
    public void testAccess(){
        Document document = new Document(01,"www.bol.com/cloudfiles/docs","arquivos de trabalho");
        document.getAccounts().add(account);
        Access access = new AccessProxy();
        access.accessContent("jhonDoe@bol.com.br","www.bol.com/cloudfiles/docs",document);
    }

}