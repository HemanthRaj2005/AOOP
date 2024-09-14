package week5inlab;

public abstract class LogHandler {
    protected LogHandler nextHandler;
    protected String level;
    
    public LogHandler(String level) {
        this.level = level;
    }
    
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public void handleMessage(String message) {
        if (canHandleMessage(message)) {
            processMessage(message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
    
    protected abstract boolean canHandleMessage(String message);
    protected abstract void processMessage(String message);
}
