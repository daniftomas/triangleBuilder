public class Triangle {

    private int[] sides;

    public Triangle(int[] sides) {
        this.sides = sides;
    }

    public String typeOfTriangle(){

        if (this.sides[0] == this.sides[1] && this.sides[0] == this.sides[2]){
            return "equilateral";
        }
        if (this.sides[0] != this.sides[1] && this.sides[0] != this.sides[2] && this.sides[1] != this.sides[2]){
            return "scalene";
        }

        return "isosceles";
    }

}
