import numpy
from OpenGL.GL import *
from OpenGL.GLUT import *
from PIL import Image

'''  Initialize material property and light source.
 '''


def myinit():
    ambient = [0.0, 0.0, 0.0, 1.0]
    diffuse = [1.0, 1.0, 1.0, 1.0]
    specular = [1.0, 1.0, 1.0, 1.0]
    position = [0.0, 3.0, 3.0, 0.0]

    lmodel_ambient = [0.2, 0.2, 0.2, 1.0]
    local_view = [0.0]

    glLightfv(GL_LIGHT0, GL_AMBIENT, ambient)
    glLightfv(GL_LIGHT0, GL_DIFFUSE, diffuse)
    glLightfv(GL_LIGHT0, GL_POSITION, position)
    glLightModelfv(GL_LIGHT_MODEL_AMBIENT, lmodel_ambient)
    glLightModelfv(GL_LIGHT_MODEL_LOCAL_VIEWER, local_view)

    glFrontFace(GL_CW)
    # glEnable(GL_LIGHTING)
    glEnable(GL_LIGHT0)
    glEnable(GL_AUTO_NORMAL)
    glEnable(GL_NORMALIZE)
    glEnable(GL_DEPTH_TEST)

    glDepthMask(GL_TRUE)
    glDepthFunc(GL_LEQUAL)




def display():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)

    glColor3f(1.0, 1.0, 1.0)
    glPolygonMode(GL_FRONT_AND_BACK, GL_LINE)
    glEnable(GL_LINE_SMOOTH)
    glEnable(GL_BLEND)
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)

    glPushMatrix()
    glScalef(1.3, 1.3, 1.3)
    glRotatef(20.0, 1.0, 0.0, 0.0)

    glPushMatrix()
    glTranslatef(-0.75, 0.5, 0.0)
    glRotatef(45.0, 1.0, 0.0, 0.0)
    glMaterial(GL_FRONT, GL_AMBIENT, [0.0215, 0.1745, 0.0215, 1.0])
    glMaterialfv(GL_FRONT, GL_DIFFUSE, [0.07568, 0.61424, 0.07568])
    glMaterialfv(GL_FRONT, GL_SPECULAR, [0.633, 0.727811, 0.633])
    glMaterialf(GL_FRONT, GL_SHININESS, 0.6 * 128.0)
    glEnable(GL_COLOR_MATERIAL)
    glColorMaterial(GL_FRONT, GL_DIFFUSE)
    glColor3f(0.1, 0.5, 0.9)
    glutSolidTorus(0.275, 0.85, 10, 15)
    glPopMatrix()

    glPushMatrix()
    glTranslatef(-0.75, -1, 0.0)
    glRotatef(45.0, 45.0, 0.0, 45.0)
    glMaterial(GL_FRONT, GL_AMBIENT, [0.135, 0.2225, 0.1575, 1.0])
    glMaterialfv(GL_FRONT, GL_DIFFUSE, [0.54, 0.89, 0.63])
    glMaterialfv(GL_FRONT, GL_SPECULAR, [0.316228, 0.316228, 0.316228])
    glMaterialf(GL_FRONT, GL_SHININESS, 0.1 * 128.0)
    glColorMaterial(GL_FRONT, GL_DIFFUSE)
    glColor3f(0.6, 0.5, 0.1)
    glutSolidCube(1)
    glPopMatrix()

    glPushMatrix()
    glTranslatef(1, -0.5, -1.0)
    glRotatef(45.0, 1.0, 0.0, 0.0)
    glMaterial(GL_FRONT, GL_AMBIENT, [0.05375, 0.05, 0.06625, 1.0])
    glMaterialfv(GL_FRONT, GL_DIFFUSE, [0.18275, 0.17, 0.22525])
    glMaterialfv(GL_FRONT, GL_SPECULAR, [0.332741, 0.328634, 0.346435])
    glMaterialf(GL_FRONT, GL_SHININESS, 0.3 * 128.0)
    glColorMaterial(GL_FRONT, GL_DIFFUSE)
    glColor3f(0.2, 0.9, 0.1)
    glutSolidCylinder(0.5, 1, 20, 15)

    glPopMatrix()
    glFlush()


def read_texture(filename):
    img = Image.open(filename).convert("RGB")
    img_data = numpy.array(list(img.getdata()), numpy.int8)
    texture_id = glGenTextures(1)
    glBindTexture(GL_TEXTURE_2D, texture_id)  # This is what's missing
    glPixelStorei(GL_UNPACK_ALIGNMENT, 1)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST)
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST)
    glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_DECAL)
    glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, img.size[0], img.size[1], 0, GL_RGB, GL_UNSIGNED_BYTE, img_data)
    return texture_id


def myReshape(w, h):
    glViewport(0, 0, w, h)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    if w <= h:
        glOrtho(-2.5, 2.5, -2.5 * h / w,
                2.5 * h / w, -10.0, 10.0)
    else:
        glOrtho(-2.5 * w / h,
                2.5 * w / h, -2.5, 2.5, -10.0, 10.0)
    glMatrixMode(GL_MODELVIEW)


def polygon_mode(value):
    if value == 1:
        glEnable(GL_DEPTH_TEST)
        glEnable(GL_LIGHTING)
        glDisable(GL_BLEND)
        glPolygonMode(GL_FRONT_AND_BACK, GL_FILL)
    elif value == 2:
        glDisable(GL_DEPTH_TEST)
        glDisable(GL_LIGHTING)
        glColor3f(1.0, 1.0, 1.0)
        glPolygonMode(GL_FRONT_AND_BACK, GL_LINE)
        glEnable(GL_LINE_SMOOTH)
        glEnable(GL_BLEND)
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA)

    glutPostRedisplay()


def main_menu(value):
    if value == 666:
        exit(0)


'''  Main Loop
 *  Open window with initial window size, bar, 
 *  RGBA display mode, handle input events.
 '''


def main():
    glutInit(sys.argv)
    glutInitWindowPosition(200, 0)
    glutInitWindowSize(1000, 1000)
    glutCreateWindow(sys.argv[0])
    myinit()
    glutReshapeFunc(myReshape)
    glutDisplayFunc(display)
    submenu = glutCreateMenu(polygon_mode)
    glutAddMenuEntry("Filled", 1)
    glutAddMenuEntry("Outline", 2)
    glutCreateMenu(main_menu)
    glutAddMenuEntry("Quit", 666)
    glutAddSubMenu("Polygon mode", submenu)
    glutAttachMenu(GLUT_LEFT_BUTTON)
    glutMainLoop()


if __name__ == '__main__':
    main()
