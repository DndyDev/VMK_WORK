package vmk.ru;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 18.02.2020
 * vmk.ru.SnowFlake
 *
 * @author Tikhomirov Sergey (ITIS/VMK)
 * @version v1.0
 */
//Рекуррентное соотношение для вершины
// На вход подаём две точки начало и конец

public class SnowFlake extends Canvas {


    public void paint (Graphics graphics){
        setBackground(Color.black);
        graphics.setColor(Color.blue);

        Point a = new Point(0,10);
        Point b = new Point(this.getWidth(),10);

        drawKochLine(graphics,a,b,0,10);
    }


    public void drawKochLine( Graphics graphics,Point firstPoint, Point lastPoint,
                              double angleOfRotation, int recursionLength){
        if (recursionLength <= 0){
            graphics.drawLine(firstPoint.x,firstPoint.y,
                    lastPoint.x, lastPoint.y); // рисуем прямую, если достигнута необходимая глубина рекурсии
        }else{
            double length = Math.pow(Math.pow(lastPoint.y - firstPoint.y,2)
                    + Math.pow(lastPoint.x-firstPoint.x,2), 0.5); // длина отрезка (a,b)

            double length1Of3 = length / 3;

            Point oneToTwo = new Point (
                    firstPoint.x + (int)Math.round(length1Of3 * Math.cos(angleOfRotation)),
                    firstPoint.y + (int) Math.round((length1Of3 * Math.sin(angleOfRotation)))
            );

            /* находим точку, делящую отрезок как 2:3. */
            Point twoToThree = new Point(
                    oneToTwo.x + (int) Math.round((length1Of3 * Math.cos(angleOfRotation))),
                    oneToTwo.y + (int) Math.round((length1Of3 * Math.sin(angleOfRotation)))
            );

            /* находим точку, которая будет вершиной равностороннего
             треугольника. */
            Point top = new Point(
                    oneToTwo.x + (int) Math.round((length1Of3 * Math.cos(angleOfRotation + Math.PI / 3))),
                    oneToTwo.y + (int) Math.round((length1Of3 * Math.sin(angleOfRotation + Math.PI / 3)))
            );

            recursionLength--;
            drawKochLine(graphics, oneToTwo, top, angleOfRotation + Math.PI / 3, recursionLength);
            drawKochLine(graphics, top, twoToThree, angleOfRotation - Math.PI / 3, recursionLength);

            recursionLength--;
            drawKochLine(graphics, firstPoint, oneToTwo, angleOfRotation, recursionLength);
            drawKochLine(graphics, lastPoint, twoToThree, angleOfRotation, recursionLength);
        }

    }
}

class Main {
    private static int height = 600, width = 800;

    public static void main(String[] args) {
        final Frame frame = new Frame("Кривая Коха");
        frame.setSize(width, height);
        frame.add(new SnowFlake());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}