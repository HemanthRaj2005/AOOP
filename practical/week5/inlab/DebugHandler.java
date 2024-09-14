package week5inlab;

public class DebugHandler extends LogHandler {
    public DebugHandler() {
        super(LogLevel.DEBUG);
    }
    
    @Override
    protected boolean canHandleMessage(String message) {
      
        return message.contains(LogLevel.DEBUG);
    }
    
    @Override
    protected void processMessage(String message) {
        System.out.println("DEBUG: " + message);
    }
}