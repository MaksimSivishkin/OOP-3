package ru.corses.geometry;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    protected ArrayList <Line> lines=new ArrayList<>();

    public void addPolyLine(Line line){
        lines.add(line);
    }

    public List listPolyLine(){  //Метод возвращает список длин линий
        ArrayList<Double> lines1=new ArrayList<>();
        for(Line line : lines){
            lines1.add(line.getLine(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY()));
        }
        return lines1;
    }

    public double sumPolyLine(){ //Метод возвращает сумму линий из списка
        double sum=0;
        for(Line line : lines){
            sum += line.getLine(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY());
        }
        return sum;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return String.format("Линия %s", lines);
    }

}