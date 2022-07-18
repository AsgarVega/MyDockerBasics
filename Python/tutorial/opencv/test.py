import cv2 as cv

img = cv.imread('Fotos/cat.jpg')

cv.imshow('cat', img)
r=500/img.shape[1]
#Se establecen las dimensiones de la nueva imagen
dim=(500, int(img.shape[0]*r))
#Se aplica el redimensionamiento con la función resize de OpenCV
redim=cv.resize(img,dim,interpolation=cv.INTER_AREA)
cv.imshow('rezized', redim)
cv.waitKey(0)