package com.Bridgelab;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class LineCompare {
    static Logger logger = Logger.getLogger(LineCompare .class);
    public static void main(String [] args){
        BasicConfigurator.configure();
//        creating default constructor object
        LineCompare  line = new LineCompare ();
        logger.info("welcome to Line Comparison Computation on Master branch  ");
    }

}