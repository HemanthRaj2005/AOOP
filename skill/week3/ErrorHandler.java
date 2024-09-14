package week5inlab;

public class ErrorHandler extends LogHandler {
    public ErrorHandler() {
        super(LogLevel.ERROR);
    }
    
    @Override
    protected boolean canHandleMessage(String message) {
    
        return message.contains(LogLevel.ERROR);
    }
    
    @Override
    protected void processMessage(String message) {
        System.out.println("ERROR: " + message);
    }
}
