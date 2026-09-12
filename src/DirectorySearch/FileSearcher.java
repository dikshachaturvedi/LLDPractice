package DirectorySearch;

import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public List<FileInfo> search(List<FileInfo> files, List<Filter> filters) {
        List<FileInfo> result = new ArrayList<>();
        if (files == null) return result;

        for (FileInfo f : files) {
            boolean ok = true;
            if (filters != null) {
                for (Filter filter : filters) {
                    if (filter != null && !filter.apply(f)) {
                        ok = false;
                        break;
                    }
                }
            }
            if (ok) result.add(f);
        }
        return result;
    }
}

