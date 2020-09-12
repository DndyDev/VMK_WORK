
class Order{
  public Double getTotalPrice(){
    // получение позиций корзины
    // получение накопительной скидки текущего покупателя
    // расчёт итоговой цены
    return price
  }
}
// Desision #1
class BaseOrderAlgorithm{
  private products;
  private discount;

  public Double getTotalPrice(){
    products = this.getProducts()
    discount = this.getDiscount()
    return calculate(products, discount)
    }
  public ArrayList<Product> getProducts(){
    // получение все позиций корзины
  }
  public double getDiscount(){
    // получение накопительной скидки
  }
  public void calculate(products,discount){
    // расчёт итоговой цены
  }
}
// Desision #2
// Шаблонный метод
abstract class BaseOrderAlgorithm {
  public Double getTotalPrice(){
    products = this.getProducts()
    discount = this.getDiscount()
    return calculate(products, discount)
    }
    abstract public ArrayList<Product> getProducts(){}
    abstract public double getDiscount(){}
    public void calculate(products,discount){
      // расчёт итоговой цены
    }
}
class MainOrderStrategy extdends BaseOrderAlgorithm{
  public ArrayList<Product> getProducts(){
      // получение накопительной скидки
  }
  public double getDiscount(){
    // расчёт итоговой цены
  }
}
