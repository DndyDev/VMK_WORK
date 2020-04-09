from graphics import *
from math import pi, sin, cos


def Draw2(x, y, l, u, t):
    Draw(x, y, l, u, t)
    x = x + l * cos(u)
    y = y - l * sin(u)
    return x, y


def Draw(x, y, l, u, t):
    if l > 3:
        l /= 3
        x, y = Draw2(x, y, l, u, t - 1)
        x, y = Draw2(x, y, l, u + pi / 3, t - 1)
        x, y = Draw2(x, y, l, u - pi / 3, t - 1)
        x, y = Draw2(x, y, l, u, t - 1)
    else:
        line = Line(Point(round(x), round(y)), Point(round(x + cos(u) * l), round(y - sin(u) * l)))
        line.draw(win)


if __name__ == '__main__':
    width = 300

    win = GraphWin("Draw  a Koch curve", width, width / 2)
    Draw(0, width / 2, width, 0, 100)
    win.getMouse()
    win.close()
