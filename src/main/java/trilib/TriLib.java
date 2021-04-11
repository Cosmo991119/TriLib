package trilib;

enum TriType {
    ILLEGAL, EQUILATERAL, ISOSCELES, NORMAL
}

class TriLib {

    public static TriType determine(int a, int b, int c) {
        if (!(a + b > c && a + c > b && b + c > a)) {
            return TriType.ILLEGAL;
        }
        if (a == b && b == c) {
            return TriType.EQUILATERAL;
        }
        if (a == b || b == c || a == c) {
            return TriType.ISOSCELES;
        }
        return TriType.NORMAL;
    }

}