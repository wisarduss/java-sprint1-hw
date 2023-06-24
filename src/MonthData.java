public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(){
        for (int i = 0; i < days.length; i++){
            System.out.println(i+1 + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth(){
        int sum = 0;
        for (int day : days) {
            sum += day;
        }
        return sum;
    }

    int maxSteps(){
        int maxSteps = 0;
        for (int day : days) {
            if (day > maxSteps) {
                maxSteps = day;
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                currentSeries++;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        if (currentSeries > finalSeries){
            finalSeries = currentSeries;
        }
        return finalSeries;
    }

}
