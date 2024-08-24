package calculator;

import javax.swing.JOptionPane;

// Class for the manager
public class Manager {
    // Vars for the manager
    private Sphere sphere;
    private Cube cube;
    private RegularTetrahedron regularTetrahedron;

    // Constructor
    public Manager() {
        this.sphere = null;
        this.cube = null;
        this.regularTetrahedron = null;
    }
    
    // Menu for the manager
    public void menu() {
        // Get the input from the user for the menu option
        int option = 0;
        // Get the input from the user for the side
        float side = 0.0f;
        // Get the input from the user for the radius
        float radius = 0.0f;
        
        // Loop for the menu
        while(option != 4) {
            // Options for the menu using JOptionPane
            option = Integer.parseInt(JOptionPane.showInputDialog("1. Sphere\n2. Cube\n3. Regular Tetrahedron\n4. Exit"));
            
            // Switch for the menu option
            switch(option) {
                case 1:
                    // Get the input from the user for the side using JOptionPane
                    radius = Float.parseFloat(JOptionPane.showInputDialog("Enter the radius of the sphere: "));
                    // Create a new sphere
                    this.sphere = new Sphere(radius);
                    // Print the area and volume of the sphere
                    JOptionPane.showMessageDialog(null, "The area of the sphere is: " + this.sphere.getArea() + "\nThe volume of the sphere is: " + this.sphere.getVolume());
                    break;
                case 2:
                    // Get the input from the user for the side using JOptionPane
                    side = Float.parseFloat(JOptionPane.showInputDialog("Enter the side of the cube: "));                    
                    // Create a new cube
                    this.cube = new Cube(side);
                    // Print the area and volume of the cube
                    JOptionPane.showMessageDialog(null, "The area of the cube is: " + this.cube.getArea() + "\nThe volume of the cube is: " + this.cube.getVolume());
                    break;
                case 3:
                    // Get the input from the user for the side using JOptionPane
                    side = Float.parseFloat(JOptionPane.showInputDialog("Enter the side of the regular tetrahedron: "));
                    // Create a new regular tetrahedron
                    this.regularTetrahedron = new RegularTetrahedron(side);
                    // Print the area and volume of the regular tetrahedron
                    JOptionPane.showMessageDialog(null, "The area of the regular tetrahedron is: " + this.regularTetrahedron.getArea() + "\nThe volume of the regular tetrahedron is: " + this.regularTetrahedron.getVolume());
                    break;
                case 4:
                    // Exit the program
                    JOptionPane.showMessageDialog(null, "Exiting the program");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
