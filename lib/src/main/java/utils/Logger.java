package utils;

import Config.Globals;

public class Logger<T> {
    public enum level{
        INFO, DEBUG, ERROR
    }
    private String head = "";
    public Logger(T clazz){
        String className = clazz.getClass().getName();
        if(className.equals("")){
            head = "[Logger] ";
        }else {
            head = String.format("[%s] ", className);
        }
    }

    public void info(String content){
        head = String.format("[%s]", level.INFO) + head;
        System.out.println(head + content);
    }

    public void debug(String content){
        if(Globals.isDebug){
            head = String.format("[%s]", level.DEBUG) + head;
            System.out.println(head + content);
        }
    }

    public void error(String content){
        head = String.format("[%s]", level.ERROR) + head;
        System.out.println(head + content);
    }
}
