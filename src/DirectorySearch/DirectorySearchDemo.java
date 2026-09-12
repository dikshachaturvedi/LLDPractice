package DirectorySearch;

import java.util.ArrayList;
import java.util.List;

public class DirectorySearchDemo {
    public static void main(String[] args) {
        // Usage example:
        // args[0] = directory path
        // args[1] = extension (optional) e.g. pdf
        // args[2] = min bytes (optional)
        // args[3] = max bytes (optional)
        // args[4] = recursive true/false (optional)

        String dir = args.length > 0 ? args[0] : ".";
        String ext = args.length > 1 ? args[1] : "";
        long min = args.length > 2 ? Long.parseLong(args[2]) : 0;
        long max = args.length > 3 ? Long.parseLong(args[3]) : Long.MAX_VALUE;
        boolean recursive = args.length > 4 && Boolean.parseBoolean(args[4]);

        DirectoryReader reader = new DirectoryReader();
        List<FileInfo> files = reader.read(dir, recursive);

        List<Filter> filters = new ArrayList<>();
        if (!ext.isEmpty()) filters.add(new TypeFilter(ext));
        filters.add(new SizeFilter(min, max));

        FileSearcher searcher = new FileSearcher();
        List<FileInfo> result = searcher.search(files, filters);

        for (FileInfo f : result) {
            System.out.println(f.getName() + " | " + f.getExtension() + " | " + f.getSizeBytes() + " | " + f.getPath());
        }
    }
}

