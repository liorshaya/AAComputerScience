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
        String[] result = new String[deliveryArray.length];
        int resultIndex = 0;

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
                    double deliveryCost = deliveryArray[j].price + ((currentCity.distance * 4.5)/ counter);
                    if(deliveryCost> price){
                        String[] nameParts = deliveryArray[j].name.split(" ");
                        String temp = "";
                        for (int k = 0; k < nameParts.length; k++) {
                            if(!nameParts[k].isEmpty()){
                                temp += nameParts[k].charAt(0);
                            }
                        }
                        result[resultIndex] = temp.toUpperCase();
                        resultIndex++;
                    }

                }

            }
        }
        String[] finalResult = new String[resultIndex];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
}







