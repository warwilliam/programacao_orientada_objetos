package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Harbor {

    protected List<Container> containers;

    public Harbor(List<Container> containers) {
        this.containers = containers;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    public int countDangerousContainers(){
        List<Container> dangerContainers = new ArrayList<>();
        for (Container container : containers){
            if (container.danger){
                dangerContainers.add(container);
            }
        }
        return dangerContainers.size();
    }

    public LinkedList<Container> containersSorted (List<Container> containers){
        LinkedList<Container> sortedContainers = new LinkedList<>();
        for (Container container : containers){
            sortedContainers.add(container);
        }
        return sortedContainers;
    }

}
