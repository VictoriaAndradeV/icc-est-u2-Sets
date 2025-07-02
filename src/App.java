import controller.ContactoController;
import controller.Sets;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        /*System.out.println("Autor: Victoria Andrade");
        runHashSet(sets);
        System.out.println("\n");
        runLinkedHashSet(sets);
        System.out.println("\n");
        runTreeSet(sets);
        System.out.println("\n");
        runComparationTreeSet(sets);*/

        ContactoController cC = new ContactoController();
        
    }

    public static void runHashSet(Sets sets){
        Set<String> ejemploHashSet = sets.construirHashSet();      
        System.out.println("Elementos del HashSet: ");
        for(String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(Sets sets){
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("Elementos del Linked HashSet: ");
        for(String elemento : ejemploLinkedHashSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(Sets sets){
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("Elementos del Tree Set: ");
        for(String elemento : ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runComparationTreeSet(Sets sets){
        Set<String> ejemploComparar = sets.construirTreeSetConComparador();
        System.out.println("Elementos comparados: ");
        for(String elemento : ejemploComparar){
            System.out.println(elemento);
        }
    }
}
