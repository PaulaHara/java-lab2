package javaLab.regions;

/**
 * @author paulahara
 */
public class Country {
    private String name = "Canada";
    private Province[] provinces = new Province[10];

    /**
     * Set the array of provinces with the ten provinces of Canada.
     */
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

    /**
     * Print the details of all provinces of the array.
     */
    public void displayAllProvinces(){
        for(Province province : provinces){
            System.out.println(province.getDetails());
        }
    }

    /**
     * Count the number of provinces that has a population number between min and max (include).
     *
     * @param min
     * @param max
     * @return the number of provinces with population between min and max
     */
    public int howManyHaveThisPopulation(int min, int max){
        int count = 0;

        for(Province province : provinces){
            if(province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max){
                count++;
            }
        }

        return count;
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
     * @param provinces
     */
    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }

    /**
     *
     * @return provinces
     */
    public Province[] getProvinces() {
        return provinces;
    }
}
