/**
 * Created by Arjun on 2/19/17.
 */
import java.util.*;

public class UseInvoice {
    public static void main(String[] args)
    {
        Date today = new Date();
        Invoice myInvoice = new Invoice("Arjun K", "Arlington, VA", 12, today);
        Invoice.InvoiceItem myInvItem = myInvoice.new InvoiceItem(1,345,"A toy train",2);
    }

}
