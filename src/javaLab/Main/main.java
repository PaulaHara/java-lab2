package javaLab.Main;

import javaLab.regions.Country;
import javaLab.regions.Province;

/**
 * @author paulahara
 */
public class main {

    public static void main(String[] args) {
        Country country = new Country();
        Province province = new Province();

        country.displayAllProvinces();
        System.out.println("\nThere are "+country.howManyHaveThisPopulation(4, 6)+" provinces " +
                "with population between 4 and 6 millions\n");

        System.out.println(province.getDetails()+"\n");

        // ==============================================================
        Province province2 = new Province("Ontario", "Toronto", 14);
        System.out.println(province2.getDetails()+"\n");

        // ==============================================================
        Province province3 = new Province("São Paulo", "São Paulo", 45);
        System.out.println(province3.getDetails());

    }
}
