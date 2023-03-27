package exceptions;

public class StockInsuffisantException extends Exception {
    /**
     * Creates a new instance of <code>StockInsuffisantException</code> without
     * detail message.
     */
    public StockInsuffisantException() {
    }

    /**
     * Constructs an instance of <code>StockInsuffisantException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public StockInsuffisantException(String msg) {
        super(msg);
    }

}
