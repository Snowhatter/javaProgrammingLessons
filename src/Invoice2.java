/**
 * Created by Arjun on 2/19/17.
 */
public class Invoice2 {
        Invoice2(String custName, String custAddr)
        {
            System.out.println("customer name: " + custName);
            System.out.println("customer addr: " + custAddr);
        }

        public static void main(String[] args)
        {
            Invoice2 myInv2 = new Invoice2("Arjun K","Arlington, VA");

                class InvoiceItem2
                {
                    InvoiceItem2(int intIn, String strDesc)
                    {
                        System.out.println("item number: " + intIn);
                        System.out.println("item desc: " + strDesc);
                    }
                }
            new InvoiceItem2(345,"toy train");
        }
}
