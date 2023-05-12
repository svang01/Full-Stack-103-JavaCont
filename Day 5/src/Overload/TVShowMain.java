package Overload;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TVShowMain {
    public static void main(String[] args) {
        List<TVShow> tvShowList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TV Show Entry");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Enter TV show name: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Enter number of episodes: ");
            int numEpisodes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();

            TVShow tvShow = new TVShow(showName, numEpisodes, genre);
            tvShowList.add(tvShow);
        }

        System.out.println("TV Show List:");
        for (TVShow tvShow : tvShowList) {
            System.out.println(tvShow.toString());
        }
    }
}
