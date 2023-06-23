public class Converter {

    int convertToKm(int steps){
        int kmToCm = 100000;
        int stepsInKm = 0;
        int stepInCm = 75;
        stepsInKm = (stepInCm * steps) / kmToCm;
        return stepsInKm;
    }

    int convertStepsToKilocalories(int steps){
        int stepInCalories = 50;
        int kiloСaloriesToCalories = 1000;
        int stepsInKiloСalories = 0;
        stepsInKiloСalories = (stepInCalories * steps) / kiloСaloriesToCalories;
        return stepsInKiloСalories;
    }
}
