package javaLab.regions;

/**
 * Created by paula on 01/04/18.
 */
public class Country {
    private String name = "Canada";
    private Province[] provinces = new Province[10];

    public Country(){
        provinces[0] = new Province("Alberta", "Edmonton", 4);
        provinces[1] = new Province("British Columbia", "Victoria", 4);
        provinces[2] = new Province("Manitoba", "Winnipeg", 1);
        provinces[3] = new Province("New Brunswick", "Fredericton", 0); //760.744
        provinces[4] = new Province("Newfoundland and Labrador", "St. John's", 0); //527.613
        provinces[5] = new Province("Nova Scotia", "Halifax", 0); //957.470
        provinces[6] = new Province("Ontario", "Toronto", 14);
        provinces[7] = new Province("Prince Edward Island", "Charlottetown", 0); //152.768
        provinces[8] = new Province("Quebec", "Quebec City", 8);
        provinces[9] = new Province("Saskatchewan", "Regina", 1);
    }

    public void displayAllProvinces(){
        for(Province province : provinces){
            System.out.println(province.getDetails());
        }
    }

    public int howManyHaveThisPopulation(int min, int max){
        int count = 0;

        for(Province province : provinces){
            if(province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max){
                count++;
            }
        }

        return count;
    }
}
