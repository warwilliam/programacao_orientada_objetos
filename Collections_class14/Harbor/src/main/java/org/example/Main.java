package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Container> containers = new ArrayList<>();


        Container c2 = new Container(02, "USA",true);
        Container c1 = new Container(01, "Brazil",true);
        Container c4 = new Container(04, "China",true);
        Container c3 = new Container(03, "France",true);


        containers.add(c1);
        containers.add(c2);
        containers.add(c3);
        containers.add(c4);

        Harbor harbor = new Harbor(containers);

        harbor.setContainers(containers);

        harbor.containersSorted(containers);

        harbor.countDangerousContainers();

        System.out.println(harbor.containersSorted(containers));
        System.out.println(harbor.countDangerousContainers());
    }
}