package week5inlab;

public class InfoHandler extends LogHandler {
    public InfoHandler() {
        super(LogLevel.INFO);
    }
    
    @Override
    protected boolean canHandleMessage(String message) {
        // Determine if message is INFO based on some criteria
        return message.contains(LogLevel.INFO);
    }
    
    @Override
    protected void processMessage(String message) {
        System.out.println("INFO: " + message);
    }

    public void setNextHandler(DebugHandler debugHandler) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNextHandler'");
    }
}
