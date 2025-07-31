package prac.com.factory;

import prac.com.vehicle.Vehicle;
import prac.com.vehicle.bike.RoyalEnfieldBike;
import prac.com.vehicle.bike.SplendorBike;

public class BikeFactory implements Factory{

    @Override
    public Vehicle getVehicle(String company) throws Exception {
        if(company.equals("splendor")) {
            return new SplendorBike();
        } else if (company.equals("royal enfield")) {
            return new RoyalEnfieldBike();
        }
        throw new Exception("Requested company bike is not manufactured in bike factory");
    }
}
