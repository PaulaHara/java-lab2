package javaLab.regions;

/**
 * @author paulahara
 */
public class Province {
    private String name;
    private String capital;
    private int populationInMillions;

    public static final int DEFAULT_POPULATION_MILLIONS = 4;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";

    /**
     * If some parameter is not valid, the default values will be given.
     *
     * @param name
     * @param capital
     * @param populationInMillions
     */
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

    /**
     * Set the variables with the default values.
     */
    public Province(){
        this.setName(DEFAULT_PROVINCE);
        this.setCapital(DEFAULT_CAPITAL);
        this.setPopulationInMillions(DEFAULT_POPULATION_MILLIONS);
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param capital
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     *
     * @return capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     *
     * @param populationInMillions
     */
    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

    /**
     *
     * @return populationInMillions
     */
    public int getPopulationInMillions() {
        return populationInMillions;
    }

    /**
     * Verify if a province is valid, if it exists in the array.
     *
     * @param province
     * @return true if it's valid, false if it's not
     */
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

    /**
     * Verify if a capital is valid, if it exists in the array.
     *
     * @param capital
     * @return true if it's valid, false if it's not
     */
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

    /**
     * Verify if population is valid, must be between 4 and 38.
     *
     * @param population
     * @return true if it's valid, false if it's not
     */
    private boolean isValidPopulation(int population){
        if(population >= 4 && population <= 38){
            return true;
        }
        return false;
    }

    /**
     *
     * @return string with all the details of the province
     */
    public String getDetails(){
        return "The capital of "+this.getName()+" (pop. "+this.getPopulationInMillions()+" million) " +
                "is "+this.getCapital();
    }
}
