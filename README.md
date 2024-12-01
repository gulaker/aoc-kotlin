# David Gulaker's Solutions for Advent of Code

This repository contains David Gulaker's solutions for the Advent of Code puzzles, implemented with Kotlin worksheets.

## Structure

Each day, a new directory is created following the template in the `dayX` folder. Due to copyright restrictions, input files are not included in this repository. To run a solution, you can manually add `example.txt` and `task.txt` files, for the example input and the main task input, respectively.

## Setup

When opening the project in IntelliJ IDEA, make sure to open `aoc-kotlin` as a module. This can be done by navigating to `File -> New -> Module from existing sources...` and selecting the `aoc-kotlin.iml` file.

## Running the Code

Each day's solution can be executed in IntelliJ by right-clicking the corresponding Kotlin worksheet file (`.ws.kts`) and running the code. To run only with example input `example.txt`, set the `exampleOnly` parameter to `true` in the `runSolution` function call in the code.