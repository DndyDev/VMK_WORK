
// Потому что высоту и ширину прямоугольника можно изменять независимо;
// а высоту и ширину квадрата можно изменять только вместе
class Rectangle{
  int width
  int height

  public void setWidth(width){
    this.width = width

  }

  public void setHeight(height){
    this.height = height

  }
}
class Square extends Rectangle
{
  public void setWidth(width){
    super.setWidth(width);
    super.setHeight(height);

  }

  public void setHeight(height){
    super.setHeight(height);
    super.setWidth(width);

  }
}
