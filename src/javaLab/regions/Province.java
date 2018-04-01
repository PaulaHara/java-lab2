package javaLab.regions;

/**
 * Created by paula on 01/04/18.
 */
public class Province {
    private String name;
    private String capital;
    private int populationInMillions;

    public static final int DEFAULT_POPULATION_MILLIONS = 4;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";

    public Province(String name, String capital, int populationInMillions){
        if(isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(populationInMillions)){
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        }else{
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }
    }

    public Province(){
        this.setName(DEFAULT_PROVINCE);
        this.setCapital(DEFAULT_CAPITAL);
        this.setPopulationInMillions(DEFAULT_POPULATION_MILLIONS);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    private boolean isValidProvince(String province){
        String[] provinces = {"Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island",
                "Quebec", "Saskatchewan"};
        int count = 0;

        while(count < provinces.length){
            if(provinces[count].equals(province)){
                return true;
            }
            count++;
        }

        return false;
    }

    private boolean isValidCapitalCity(String capital){
        String[] capitals = {"Edmonton", "Victoria", "Winnipeg", "Fredericton",
                "St. John's", "Halifax", "Toronto", "Charlottetown",
                "Quebec City", "Regina"};

        for(int index = 0; index < capitals.length; index++){
            if(capitals[index].equals(capital)){
                return true;
            }
        }

        return false;
    }

    private boolean isValidPopulation(int population){
        if(population >= 4 && population <= 38){
            return true;
        }
        return false;
    }

    public String getDetails(){
        return "The capital of "+this.getName()+" (pop. "+this.getPopulationInMillions()+" million) " +
                "is "+this.getCapital();
    }
}
