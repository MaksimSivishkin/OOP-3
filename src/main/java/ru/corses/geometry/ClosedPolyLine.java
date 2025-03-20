package ru.corses.geometry;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine() {
        setLines(lines);
    }

    @Override
    public void addPolyLine(Line line){
        lines.add(line);
    }

    @Override
    public double sumPolyLine(){ //Метод возвращает сумму линий замкнутой кривой
        double sum=0;
        for(Line line : lines){
            sum += line.getLine(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY());
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Закрытая кривая %s",lines);
    }
}
