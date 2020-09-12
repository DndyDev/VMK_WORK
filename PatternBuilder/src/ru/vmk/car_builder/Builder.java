package ru.vmk.car_builder;

import ru.vmk.car_builder.cars.Type;
import ru.vmk.car_builder.components.Engine;
import ru.vmk.car_builder.components.GPSNavigator;
import ru.vmk.car_builder.components.Transmission;
import ru.vmk.car_builder.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
