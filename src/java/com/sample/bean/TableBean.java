/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.bean;

import com.sample.model.Car;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mauro
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean {
private List<Car> cars;
    /**
     * Creates a new instance of TableBean
     */
    public TableBean() {
   cars= new ArrayList<Car>();
   Car car1, car2,car3,car4;
   car1= new Car("Golf", "the best", "5", "Cuneo");
   car2=new Car("AstraSW", "la piu comoda", "2", "Trino");
   car3=new Car("Punto", "della FIAT", "5", "Milano");
   car4=new Car("Yaris", "auto elettrica", "1", "Mondovi");
           cars.add(car1);
           cars.add(car2);
           cars.add(car3);
           cars.add(car4);
           
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
}
