package ProjectInputOuput;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory:");
        String inputPath = scanner.nextLine();

        try {
            Path path = Paths.get(inputPath);
            if (!Files.isDirectory(path)) {
                System.out.println("Invalid directory path.");
                return;
            }

            boolean exit = false;
            while (!exit) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Display directory contents");
                System.out.println("2. Copy a file");
                System.out.println("3. Move a file");
                System.out.println("4. Delete a file");
                System.out.println("5. Create a directory");
                System.out.println("6. Delete a directory");
                System.out.println("7. Search for a file");
                System.out.println("8. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayDirectoryContents(path);
                        break;
                    case 2:
                        System.out.println("Enter the source file name:");
                        String sourceFile = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String targetFile = scanner.nextLine();
                        copyFile(path.resolve(sourceFile), path.resolve(targetFile));
                        break;
                    case 3:
                        System.out.println("Enter the source file name:");
                        String srcFile = scanner.nextLine();
                        System.out.println("Enter the target file name:");
                        String tgtFile = scanner.nextLine();
                        moveFile(path.resolve(srcFile), path.resolve(tgtFile));
                        break;
                    case 4:
                        System.out.println("Enter the file name to delete:");
                        String fileToDelete = scanner.nextLine();
                        deleteFile(path.resolve(fileToDelete));
                        break;
                    case 5:
                        System.out.println("Enter the name of the new directory:");
                        String newDir = scanner.nextLine();
                        createDirectory(path.resolve(newDir));
                        break;
                    case 6:
                        System.out.println("Enter the name of the directory to delete:");
                        String dirToDelete = scanner.nextLine();
                        deleteDirectory(path.resolve(dirToDelete));
                        break;
                    case 7:
                        System.out.println("Enter the file name or extension to search for:");
                        String searchTerm = scanner.nextLine();
                        searchFiles(path, searchTerm);
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }
    }

    private static void displayDirectoryContents(Path dirPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            System.out.println("\nDirectory contents:");
            for (Path entry : stream) {
                BasicFileAttributes attrs = Files.readAttributes(entry, BasicFileAttributes.class);
                String type = attrs.isDirectory() ? "Directory" : "File";
                long size = attrs.size();
                LocalDateTime lastModified = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneOffset.UTC);
                System.out.printf("%-10s %-10d %-20s %s%n", type, size, lastModified.format(formatter), entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error reading directory contents: " + e.getMessage());
        }
    }

    private static void copyFile(Path source, Path target) {
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    private static void moveFile(Path source, Path target) {
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }

    private static void deleteFile(Path file) {
        try {
            Files.delete(file);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }

    private static void createDirectory(Path dir) {
        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    private static void deleteDirectory(Path dir) {
        try {
            Files.delete(dir);
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting directory: " + e.getMessage());
        }
    }

    private static void searchFiles(Path dir, String searchTerm) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, searchTerm)) {
            System.out.println("\nSearch results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }
}