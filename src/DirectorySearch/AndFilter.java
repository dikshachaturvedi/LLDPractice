package DirectorySearch;

import java.util.List;

public class AndFilter implements Filter {
    private final List<Filter> filters;

    public AndFilter(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public boolean apply(FileInfo file) {
        if (filters == null || filters.isEmpty()) return true;
        for (Filter f : filters) {
            if (f != null && !f.apply(file)) return false;
        }
        return true;
    }
}

