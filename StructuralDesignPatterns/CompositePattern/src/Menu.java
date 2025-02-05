import java.util.ArrayList;
import java.util.List;

public class Menu implements UIComponent {
    List<UIComponent> children = new ArrayList<>();

    @Override
    public void draw() {
        for (UIComponent component : children) {
            component.draw();
        }
    }

    @Override
    public void add(UIComponent component) {
        children.add(component);
    }

    @Override
    public void remove(UIComponent component) {
        children.remove(component);
    }
}
