package GeneticAlgorithm;


import Utils.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents one pixel
 */
class Pixel {
    private int id;
    private int x;
    private int y;
    private static int identification = 0;
    private Color color; // RGB value
    private List<PixelNeighbor> neighbors = new ArrayList<>(); // List of neighboring genes (based on Moore neighborhood) {E, W, N, S, NE, SE, NW, SW}

    Pixel(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.id = identification++;
        this.color = color;
    }

    int getId() {
        return id;
    }

    Color getColor() {
        return color;
    }

    List<PixelNeighbor> getNeighbors() {
        return neighbors;
    }

    void addPixelNeighbor(Pixel neighbor) {
        double colorDistance = Utils.getEuclideanColorDistance(color, neighbor.getColor());
        PixelNeighbor pixelNeighbor = new PixelNeighbor(this, neighbor, colorDistance);
        neighbors.add(pixelNeighbor);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}