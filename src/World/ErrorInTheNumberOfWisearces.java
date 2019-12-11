package World;

@SuppressWarnings("serial")
public class ErrorInTheNumberOfWisearces extends Exception {
    public ErrorInTheNumberOfWisearces() {
        super("Старцев слишком мало для начала истории");
    }
}