package prac.com;

import prac.com.factory.BikeFactory;
import prac.com.factory.CarFactory;
import prac.com.factory.Factory;

public class FactoryProvider {

    public static Factory provideFactory(String factoryType) throws Exception {
        if(factoryType.equals("car")) {
            return new CarFactory();
        } else if(factoryType.equals("bike")) {
            return new BikeFactory();
        }
        throw new Exception("Factory type not supported");
    }

}
