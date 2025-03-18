public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine() {
        setLines(lines);
    }

    @Override
    public String toString() {
        return String.format("Закрытая кривая %s",lines);
    }
}
