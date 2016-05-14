public class Zadacha4 {
    public static void main(String[] args){
        //side of the triangle
        float a = 24.11f;
        float b = 15.3f;                //Стороны треугольника: 24.11 см, 15.3 см и 42.41 см.
        float c = 42.41f;               //Вычислить его площадь и вывести на экран. (Подсказка: используйте формулу Герона)
        float p = (a + b + c)/2;
        double areaTriangle = Math.sqrt (p * ( p - a ) * ( p - b ) * ( p - c ));
        System.out.println(areaTriangle);

    }
}
