# Exercise 13: NHL statistics, part 1

A ready-made component `NHLStatistics` is included along with the exercise files for this excercise. It can be used to fetch and see NHL players' score data, including their number of played games, goals, assists, points, and penalty amount.

The main program imports (i.e. enables the use of) the component by adding the following line to the beginning of the file: `import nhlstats.NHLStatistics;`. The next example prints the top 10 players based on points:

```
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Mainprogram {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
    }
}
```

It will print (this was the situation on the 9th of January 2012):

```
Top ten by points
Henrik Sedin           VAN        43 11 + 38= 49  36
Phil Kessel            TOR        41 24 + 24= 48  10
Claude Giroux          PHI        36 18 + 30= 48  16
Joffrey Lupul          TOR        41 19 + 28= 47  36
Daniel Sedin           VAN        42 18 + 29= 47  32
Steven Stamkos         TBL        40 28 + 17= 45  34
Marian Hossa           CHI        41 17 + 27= 44  14
Evgeni Malkin          PIT        33 16 + 28= 44  30
Jordan Eberle          EDM        41 17 + 26= 43   6
Jason Pominville       BUF        41 14 + 29= 43   8
```

The name, abbreviation of the club, matches played, assists, points and penalties of players are printed.

The first command `NHLStatistics.sortByPoints()` sorts the list of NHL players by the points they have gathered. The second command `NHLStatistics.top(10);` prints the ten first players from the list. Any integer can be given as a parameter.

Similarly the players can be printed ordered by the goals or assists they have made, or by penalty minutes they have been given. First, we call the command to sort the players:

```
NHLStatistics.sortByPoints();     // orders the players by points
NHLStatistics.sortByGoals();      // orders the players by goals
NHLStatistics.sortByAssists();    // orders the players by assists
NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
```

After that the players are printed with the command `top` using the number of players to be printed as its parameter.

It is also possible to use the component to request the statistics of a certain player:

```
NHLStatistics.searchByPlayer("Jaromir Jagr");  // prints stats of Jaromir Jagr
NHLStatistics.searchByPlayer("Koivu");         // prints stats of Mikko Koivu and Saku Koivu
NHLStatistics.searchByPlayer("Teemu");         // prints stats of all players named Teemu
```

The component can also print the statistics of all players in a club:

```
NHLStatistics.teamStatistics("NYR");  // Statistics of New York Rangers
```

The order of the printed club statistics can be changed using a `sortBy...()` first.

The name of the club must be given using the official three letter abbreviation. You can check the abbreviations [here](http://everything2.com/title/Ice+hockey+acronyms+and+abbreviations) . The statistics component prints a list of the available abbreviations if you request the statistics of an invalid club.

__Create a program that does the following tasks into the main program body. The tasks must be done in exactly the same order as listed below. Do the tasks in the program body one after another without deleting tasks you have already done.__

__Note:__ When you first run the program, the execution might take a while because the information is downloaded from the web. Execution should be quick after the first run.

The program must do the following:

* Print the top ten players based on goals
* Print the top 25 players based on penalty amounts
* Print the statistics for Sidney Crosby
* Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
* Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points

After you have successfully submitted the exercise, you can play with the code as you wish!
