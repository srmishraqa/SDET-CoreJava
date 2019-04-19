package polymorphism;
/*
Polymorphism - the method /mechanism in OOP
that allows actions to cat differently in based Object - the action is performed on
 */
/*
Assigning different functionality according to the different types of Object we Created where all the Objects are inherited from
same base class
 */

//Example - classes

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }

}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take Over planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }
    //No Plot
}

public class PolymorphismConcept {
    public static void main(String[] args) {
       for(int i =1;i<11;i++)
       {
           Movie movie = randomMovie();
           System.out.println("Movie # "+i+" : "+movie.getName()+"\n"+"plot : "+movie.plot()+"\n");
       }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("The Random Number Generated is : " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            default:
                return null;


        }

    }
}
