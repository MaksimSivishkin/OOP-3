package ru.corses.geometry;

import ru.corses.main.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Interfaces.Measurable {
    protected ArrayList <Line> lines=new ArrayList<>();

    public void addPolyLine(Line line){
        lines.add(line);
    }

    public List listPolyLine(){  //Метод возвращает список длин линий
        ArrayList<Double> lines1=new ArrayList<>();
        for(Line line : lines){
            lines1.add(line.getLenghth(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY()));
        }
        return lines1;
    }

    public double getLenghth(){ //Метод возвращает сумму линий из списка
        double sum=0;
        for(Line line : lines){
            sum += line.getLenghth(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY());
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


    @Override
    public double getLenghth(double x1, double y1, double x2, double y2) {
        return 0;
    }
}