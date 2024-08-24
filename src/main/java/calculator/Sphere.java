package calculator;

// Class for the sphere
public class Sphere {
    // Vars for the sphere
    private float area;
    private float volume;
    
    // Constructor
    public Sphere(Float radius) {
        this.area = (float) (4 * Math.PI * radius * radius);
        this.volume = (float) ((4 * Math.PI * radius * radius * radius) / 3);
    }
    
    // Getters
    public Float getArea() {
        return this.area;
    }
    
    public Float getVolume() {
        return this.volume;
    }
}
