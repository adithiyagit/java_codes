import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.IntegerProperty;

public class ShapeModel {
    private final ObjectProperty<String> shapeType = new SimpleObjectProperty<>("Circle");
    private final IntegerProperty shapeCount = new SimpleIntegerProperty(0);

    public String getShapeType() {
        return shapeType.get();
    }

    public void setShapeType(String s) {
        shapeType.set(s);
    }

    public ObjectProperty<String> shapeTypeProperty() {
        return shapeType;
    }

    public int getShapeCount() {
        return shapeCount.get();
    }

    public void setShapeCount(int count) {
        shapeCount.set(count);
    }

    public IntegerProperty shapeCountProperty() {
        return shapeCount;
    }

    public void incrementCount() {
        shapeCount.set(shapeCount.get() + 1);
    }

    public void resetCount() {
        shapeCount.set(0);
    }
}
