package agilite.superhero;
import java.util.List;

public class Avengers implements SuperHeroTeam {
    
    private List<SuperHero> members;

    public Avengers(List<SuperHero> members) {
        this.members = members;
    }

    /**
     * Ajoute un super-héros à l'équipe des Avengers.
     *
     * @param hero le super-héros à ajouter à l'équipe
     */
    @Override
    public void addMember(SuperHero hero) {
        this.members.add(hero);
    }
    
    /**
     * Supprime un super-héros de l'équipe des Avengers.
     *
     * @param hero le super-héros à supprimer de l'équipe
     */
    @Override
    public void removeMember(SuperHero hero) {
        this.members.remove(hero);
    }
    
    /**
     * Calcule et retourne le niveau total de l'équipe des Avengers en additionnant les niveaux de tous les membres.
     *
     * @return le niveau total de l'équipe des Avengers
     */
    @Override
    public int teamLevel() {
        int totalLevel = 0;
        for (SuperHero hero : members) {
            totalLevel = totalLevel + hero.getNiveau();
        }
        return totalLevel;   
    }

    /**
     * Affiche le niveau total de l'équipe des Avengers en additionnant les niveaux de tous les membres.
     */
    @Override
    public void displayTeamLevel() {
        int totalLevel = teamLevel();
        System.out.println("Les Avengers ont un niveau total de " + totalLevel + ", équivalent à celui de " + totalLevel + " super-héros.");
    }
}

