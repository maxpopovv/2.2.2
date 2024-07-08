package model;

public class TheCar {
    private int id;
    private String mark;
    private String model;

    // Конструктор по умолчанию
    public TheCar() {
    }

    // Конструктор с параметрами
    public TheCar(int id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    // Геттер для id
    public int getId() {
        return id;
    }

    // Сеттер для id
    public void setId(int id) {
        this.id = id;
    }

    // Геттер для mark (марка)
    public String getMark() {
        return mark;
    }

    // Сеттер для mark (марка)
    public void setMark(String mark) {
        this.mark = mark;
    }

    // Геттер для model (модель)
    public String getModel() {
        return model;
    }

    // Сеттер для model (модель)
    public void setModel(String model) {
        this.model = model;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "theCar{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}