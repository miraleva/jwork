package sınav;

interface Logger {
    default void log() {
        System.out.println("Logging");
    }
}

class FileLogger implements Logger {
    public void log() {
        System.out.println("File Logging");
    }
}
