package teachback;

public interface Shape {
	
	public void draw();

}


class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}


class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
    
}

class main {
public static void main(String[] args) {
	
	Circle circle = new Circle();
	circle.draw();
	
	Square square = new Square();
	square.draw();
}
}
