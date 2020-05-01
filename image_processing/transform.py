import cv2 as cv
import numpy as np

img = cv.imread("Loli.jpeg")
img = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
rows, cols = img.shape

cv.imshow("Picture", img)
cv.waitKey(0)
cv.destroyAllWindows()

# Biggest
n = 1.5

M = np.float32([[n, 0, 0], [0, n, 0]])
dst = cv.warpAffine(img, M, (int(cols * n), int(rows * n)))

cv.imshow("BigPicture", dst)
cv.waitKey(0)
cv.destroyAllWindows()


# Smallest
n = 0.7

M = np.float32([[n, 0, 0], [0, n, 0]])
dst = cv.warpAffine(img, M, (int(cols * n), int(rows * n)))

cv.imshow("SmallPicture", dst)
cv.waitKey(0)
cv.destroyAllWindows()

# Reflection Vertical
M = np.float32([[-1, 0, cols], [0, 1, 0]])
dst = cv.warpAffine(img, M, (cols, rows))

cv.imshow("P.-cture", dst)
cv.waitKey(0)
cv.destroyAllWindows()

# Reflection Horizontal
M = np.float32([[1, 0, 0], [0, -1, rows]])
dst = cv.warpAffine(img, M, (cols, rows))

cv.imshow("P!cture", dst)
cv.waitKey(0)
cv.destroyAllWindows()

# Rotation
M = cv.getRotationMatrix2D((cols / 2, rows / 2), 45, 1)
dst = cv.warpAffine(img, M, (cols, rows))

cv.imshow("RotationPicture", dst)
cv.waitKey(0)
cv.destroyAllWindows()
