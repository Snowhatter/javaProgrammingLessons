/**
 * Created by Arjun on 2/19/17.
 */

import java.util.*;

public class Invoice {
    private String strCustName;
    private String strCustAddr;
    private int intInvoiceNum;
    private Date dtInvoiceDate;

    Invoice(String sCN, String sCA, int iN, Date dt)
    {
        strCustName = sCN;
        strCustAddr = sCA;
        intInvoiceNum = iN;
        dtInvoiceDate = dt;
    }

    class InvoiceItem
    {
        private int intLineItem;
        private int intItemId;
        private String strItemDesc;
        private int intUnits;

        InvoiceItem(int li, int id, String desc, int iu)
        {
            intLineItem = li;
            intItemId = id;
            strItemDesc = desc;
            intUnits = iu;
        }

        public void showInvoice()
        {
            System.out.println("customer name:" + Invoice.this.strCustName);
            System.out.println("Item Description" + strItemDesc);
        }
    }
}


