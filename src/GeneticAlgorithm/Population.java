package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Individual> individuals = new ArrayList<>();

    // Parameters
    private int populationSize; // Number of Solutions in population
    private double crossOverRate;
    private double mutationRate;
    private int tournamentSize;


    Population(List<Pixel> pixels, List<Integer> initialChromosome, double initialColorDistanceThreshold, int populationSize, double crossOverRate, double mutationRate, int tournamentSize) {
        this.populationSize = populationSize;
        this.crossOverRate = crossOverRate;
        this.mutationRate = mutationRate;
        this.tournamentSize = tournamentSize;

        generateInitialPopulation(pixels, initialChromosome, initialColorDistanceThreshold);
    }

    private void generateInitialPopulation(List<Pixel> pixels, List<Integer> initialChromosome, double initialColorDistanceThreshold) {
        System.out.println("Generating Initial Population");
        for (int i = 0; i < populationSize; i++) {
            Individual individual = new Individual(pixels, initialChromosome, initialColorDistanceThreshold);
            individuals.add(individual);
        }
    }

    void tick() {

    }

    public List<Segment> getAlphaSegments() {
        return individuals.get(0).getSegments();
    }
}