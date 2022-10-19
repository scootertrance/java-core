class AreaOfPentagon {
    public static double getAreaOfPentagon(MyNumbers myNumbers) {

        // //Area of the pentagon
        double areaOfPentagon = AreaOfTriangles.getAreaOfFirstTriangle(myNumbers) +
                AreaOfTriangles.getAreaOfSecondTriangle(myNumbers) + AreaOfTriangles.getAreaOfThirdTriangle(myNumbers);
        return areaOfPentagon;
    }
}
