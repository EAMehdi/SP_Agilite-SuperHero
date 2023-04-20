package agilite.superhero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * Classe-test agilite.superhero.AvengersTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class AvengersTest
{
    private SuperHero mimi;
    private SuperHero mima;
    private SuperHero mimo;
    private List<SuperHero> heros;


    /**
     * Constructeur de la classe-test agilite.superhero.AvengersTest
     */
    public AvengersTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        Avengers avengers = new Avengers(members);
        mimi = new SuperHero("mimi", "Voyager dans le temps", 23);
        mima = new SuperHero("mima", "Télépathie", 45);
        mimo = new SuperHero("mimo", "Lire dans les pensées", 40);
    }


    @Test
    public void addMemberTest()
    {
        Avengers avengers1 = new Avengers(members);
    }
}





