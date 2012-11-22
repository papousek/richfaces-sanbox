package org.richfaces.demo;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TestBean implements Serializable
{
    // dummy documents
    private List<DummyDocument> documents;

    public List<DummyDocument> getDocuments()
    {
        if ( documents == null)
        {
            documents = new ArrayList<DummyDocument>();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try
            {
                documents.add(new DummyDocument("sdvwergersgtw.pdf", dateFormat.parse("2012-03-04")));
                documents.add(new DummyDocument("jtment znwezt.doc", dateFormat.parse("2012-07-18")));
                documents.add(new DummyDocument("p3qrvqwrbw.pdf", dateFormat.parse("2012-11-09")));
            }
            catch ( ParseException e )
            {
                e.printStackTrace();
            }
        }

        return documents;
    }

    public void updateDocument(DummyDocument dummyDocument)
    {
        System.out.println("Updating expiry date for "+dummyDocument.getFileName()+" to "+ dummyDocument.getExpiryDate());
    }

    public static class DummyDocument
    {
        private String fileName;
        private Date expiryDate;

        public DummyDocument(String fileName, Date expiryDate)
        {
            this.fileName = fileName;
            this.expiryDate = expiryDate;
        }

        public String getFileName()
        {
            return fileName;
        }

        public Date getExpiryDate()
        {
            return expiryDate;
        }

        public void setExpiryDate(Date expiryDate)
        {
            this.expiryDate = expiryDate;
        }

    }
}
