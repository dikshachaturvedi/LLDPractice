package DirectorySearch;

public class TypeFilter implements Filter {
    private final String type; // e.g. "pdf"

    public TypeFilter(String type) {
        this.type = type == null ? "" : type.toLowerCase();
    }

    @Override
    public boolean apply(FileInfo file) {
        return file != null && file.getExtension().equalsIgnoreCase(type);
    }
}

