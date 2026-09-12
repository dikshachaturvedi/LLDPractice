package DirectorySearch;

public class FileInfo {
    private final String name;
    private final String path;
    private final long sizeBytes;
    private final String extension; // without dot, lower-cased (e.g. "pdf")

    public FileInfo(String name, String path, long sizeBytes, String extension) {
        this.name = name;
        this.path = path;
        this.sizeBytes = sizeBytes;
        this.extension = extension == null ? "" : extension;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public long getSizeBytes() {
        return sizeBytes;
    }

    public String getExtension() {
        return extension;
    }
}

