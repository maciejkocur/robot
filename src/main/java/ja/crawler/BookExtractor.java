package ja.crawler;
import ja.crawler.Entities.BookInfo;

import java.io.IOException;

public interface BookExtractor {

    Iterable<BookInfo> extract() throws IOException;
}