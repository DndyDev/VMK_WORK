package ru.vmk.simpleFactory.ChicagoStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class ChicagoStileClamPizza extends Pizza {
   @Override
   public void bake() {
       System.out.println("Clam pizza baked");
   }

   @Override
   public void prepare() {
       System.out.println("Clam pizza is served with soy sauce");
   }

}
