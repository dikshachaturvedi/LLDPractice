package DirectorySearch;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {

    public List<FileInfo> read(String directoryPath) {
        return read(directoryPath, false);
    }

    public List<FileInfo> read(String directoryPath, boolean recursive) {
        Path dir = Paths.get(directoryPath);
        List<FileInfo> files = new ArrayList<>();

        if (!Files.exists(dir) || !Files.isDirectory(dir)) {
            return files;
        }

        try {
            if (!recursive) {
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                    for (Path p : stream) {
                        if (Files.isRegularFile(p)) {
                            files.add(toFileInfo(p));
                        }
                    }
                }
            } else {
                try (var walk = Files.walk(dir)) {
                    walk.filter(Files::isRegularFile).forEach(p -> {
                        try {
                            files.add(toFileInfo(p));
                        } catch (IOException ignored) {
                            // skip unreadable files
                        }
                    });
                }
            }
        } catch (IOException ignored) {
            // best-effort: return whatever we collected
        }

        return files;
    }

    private FileInfo toFileInfo(Path p) throws IOException {
        String name = p.getFileName().toString();
        String ext = getExtension(name);
        long size = Files.size(p);
        return new FileInfo(name, p.toAbsolutePath().toString(), size, ext);
    }

    private String getExtension(String name) {
        int i = name.lastIndexOf('.');
        if (i <= 0 || i == name.length() - 1) return "";
        return name.substring(i + 1).toLowerCase();
    }
}

