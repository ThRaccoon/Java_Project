package Shop.exceptions.fileExceptions;

public class NoReceiptFilesFoundException extends Exception {
    public NoReceiptFilesFoundException() {
        super("No receipt files found in the receipts directory.");
    }
}
