package calculator;

// Class for the cube
public class Cube {
    // Vars for the cube
    private float  area;
    private float volume;
    
    // Constructor
    public Cube(Float side) {
        this.area = 6 * side * side;
        this.volume = side * side * side;
    }
    
    // Getters
    public Float getArea() {
        return this.area;
    }
    
    public Float getVolume() {
        return this.volume;
    }
}
