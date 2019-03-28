import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookServiceTest {

    @Test
    public void should_filter_books_by_plublication_year_sorted_by_price_then_sorted_by_authorName(){

        List<Book> books = GivenData.getBookList();

        List<Book> result = BookService.filterBooksByPublicationYearAndFilterByPriceTheFilterByAuthorName(books);


        result.forEach(b -> Assert.assertTrue( b.getDate().getYear() >= 2011));


        for(int i = 0; i < result.size() -1; i++){
            Assert.assertTrue(result.get(i).getPrice() >= result.get(i+1).getPrice());
        }


        for(int i = 0; i < result.size() - 1; i++){
            if(result.get(i).getPrice() == result.get(i+1).getPrice() )
                Assert.assertTrue(result.get(i).getAuthor().getName().compareTo(result.get(i+1).getAuthor().getName()) <= 0);
        }

    }

    @Test
    public void should_return_list_of_countries_of_author_destinct(){

        Set<String> Result = BookService.getAuthorCountriesDistinct(GivenData.getBookList());

        String[] authorName =  Result.toArray(new String[Result.size()]);

        for( int i= 0; i < authorName.length - 1; i++){
            Assert.assertTrue( !authorName[i].equals(authorName[i+1]));
        }

    }

    @Test
    public void should_return_map_of_price_grouped_by_category(){

        //Map<String,  Integer>  resultSummPriceGroupedByCategoy = BookService.getSumPriceGroupedByCategory(GivenData.getBookList());


    }
}
