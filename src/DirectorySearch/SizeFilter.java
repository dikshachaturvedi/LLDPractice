package DirectorySearch;

public class SizeFilter implements Filter {
    private final long minBytesInclusive;
    private final long maxBytesInclusive;

    public SizeFilter(long minBytesInclusive, long maxBytesInclusive) {
        this.minBytesInclusive = minBytesInclusive;
        this.maxBytesInclusive = maxBytesInclusive;
    }

    @Override
    public boolean apply(FileInfo file) {
        if (file == null) return false;
        long s = file.getSizeBytes();
        return s >= minBytesInclusive && s <= maxBytesInclusive;
    }
}

