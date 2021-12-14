/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.io.*;
import java.util.logging.*;
/**
 *
 * @author admin
 */
public class logfile {
    public static void main(String args[])
{
    Logger l=Logger.getLogger(logfile.class.getName());
    FileHandler fh;
try
{
    fh=new FileHandler("c:/mylogfile.log",true);
    l.addHandler(fh);
    l.setLevel(Level.ALL);
    SimpleFormatter sf=new SimpleFormatter();
    fh.setFormatter(sf);
    l.info("My first log");
}
catch(SecurityException e)
{
    e.printStackTrace();
}

catch(IOException e)
{
    e.printStackTrace();
}
l.info("Hi How r u?");
}
}

