package termA.lesson8.Ex3;

public class Store {

    Delivery[] deliveryArray;
    CityDelivery[] cityArray;

    public String mostExpensiveDeliveryCity(){

        int mostCityDistance = 0;
        CityDelivery city = cityArray[0];
        for (int i = 0; i < cityArray.length; i++) {
            if(cityArray[i].distance > mostCityDistance){
                mostCityDistance = cityArray[i].distance;
                city = cityArray[i];
            }
        }
        return city.cityName;
    }

    public String[] clientNamesWithExpensiveDelivery(int price){
        for (int i = 0; i < cityArray.length; i++) {
            CityDelivery currentCity = cityArray[i];
            String cityDelivery = currentCity.cityName;
            int counter = 0;
            for (int j = 0; j < deliveryArray.length; j++) {
                if(cityDelivery.equals(deliveryArray[j].getCityName())){
                    counter++;
                }
            }

            for (int j = 0; j < deliveryArray.length; j++) {
                if(cityDelivery.equals(deliveryArray[j].getCityName())){
                    if(deliveryArray[j].price + ((currentCity.distance * 4.5)/ counter) > price){

                    }
                }

            }
        }

    }
}







