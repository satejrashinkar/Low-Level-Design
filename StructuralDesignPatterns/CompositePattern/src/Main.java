public class Main {
    public static void main(String[] args) {
        UIComponent uiComponent = new Menu();
        Button buttonOne = new Button();
        uiComponent.add(buttonOne);
        uiComponent.add(new Button());
        uiComponent.add(new Button());

        System.out.println("Before : ");
        uiComponent.draw();


        uiComponent.remove(buttonOne);
        System.out.println("After : ");
        uiComponent.draw();
    }
}