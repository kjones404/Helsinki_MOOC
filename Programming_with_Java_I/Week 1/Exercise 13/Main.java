import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        // Top ten by goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        // Top 25 by penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        // Statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        // Satistics for Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        // Players in Anaheim Ducks ordered by points
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
