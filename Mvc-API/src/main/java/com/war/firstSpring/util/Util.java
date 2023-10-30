package com.war.firstSpring.util;

import java.sql.Timestamp;
import java.util.Date;

public class Util {

    public static Timestamp datetimestamp(Date date){
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }
}
