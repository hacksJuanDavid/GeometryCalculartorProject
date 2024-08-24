package calculator;

// Class for the regular tetrahedron
public class RegularTetrahedron {
    // Vars for the regular tetrahedron
    private float area;
    private float volume;
    
    // Constructor
    public RegularTetrahedron(Float side) {
        this.area = (float) (Math.sqrt(3) * side * side);
        this.volume = (float) ((Math.pow(side, 3) * Math.sqrt(2)) / 12);
    }
    
    // Getters
    public Float getArea() {
        return this.area;
    }
    
    public Float getVolume() {
        return this.volume;
    }
}
