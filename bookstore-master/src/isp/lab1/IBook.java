
package isp.lab1;

import java.time.LocalDate;

public interface IBook extends Product {

    public String getISBN();

    public String getAuthor();

    public int getPages();  
}
