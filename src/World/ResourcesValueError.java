package World;

public class ResourcesValueError extends RuntimeException {
    public ResourcesValueError() {
        super("Количество ресурсов не сожет быть отрицательным");
    }
}
