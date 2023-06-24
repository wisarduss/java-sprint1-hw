public class Converter {

    double convertToKm(int steps){
        int kmToCm = 100000;
        int stepInCm = 75;
        return (stepInCm * steps) / kmToCm;
    }

    double convertStepsToKilocalories(int steps){
        int stepInCalories = 50;
        int kiloСaloriesToCalories = 1000;
        return (stepInCalories * steps) / kiloСaloriesToCalories;
    }
}
