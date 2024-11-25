package java17.ex01;

import java.util.function.Function;

import org.junit.Test;

import java17.data.Account;
import java17.data.Person;

/**
 * Exercice 01 - java.util.function.Function
 */
public class Function_01_Test {

    /**
     * ****** PART 1 - Integer -> Person ******
     */
    // tag::intToPerson[]
    // Fonction permettant de transformer un entier en objet Person
    private Function<Integer, Person> intToPerson = (Integer number) -> {
        return new Person(
                "first_" + number, // Prénom
                "last_" + number, // Nom
                number, // Âge
                "pass_" + number // Mot de passe
        );
    };
    // end::intToPerson[]

    @Test
    public void test_intToPerson() throws Exception {

        // Appel de la fonction
        Person result = intToPerson.apply(10);

        // Assertions
        assert result.getFirstname().equals("first_10");
        assert result.getLastname().equals("last_10");
        assert result.getAge().equals(10);
        assert result.getPassword().equals("pass_10");
    }

    /**
     * ****** PART 2 - Person -> Account ******
     */
    // tag::personToAccount[]
    // Fonction permettant de transformer un objet Person en objet Account
    private Function<Person, Account> personToAccount = (Person person) -> {
        return new Account(person, 1000); // Owner = person, Balance = 1000
    };
    // end::personToAccount[]

    @Test
    public void test_personToAccount() throws Exception {

        // Création d'une personne
        Person person = new Person("Jules", "France", 10, "pass");

        // Appel de la fonction
        Account result = personToAccount.apply(person);

        // Assertions
        assert result.getOwner().equals(person);
        assert result.getBalance().equals(1000);
    }
}
