package cna;

import cna.interfaces.CharacterInfo;
import cna.interfaces.FranchiseInfo;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Do napisania funkcjonalności powinny wystarczyć metody z CosplayDatabaseData, po prostu trzeba przeszukac to co dostarczaja i zwrocic wynik.
 *
 * Created by jereczem on 08.12.15.
 */
public class CosplayNamesAPI {
    /**
     * Zwróć mi listę imion użytkoników którzy kiedykolwiek się przebierali za postać o danym imieniu (a co za tmy idzie do danej Franczyzy)
     * Uwaga! Imiona nie mogą się powtarzać.
     * Uwaga! Pamiętajcie, że samo imię postaci do za mało, musi się zgadzać jego franczyza!
     */
    public static ArrayList<String> getUserNamesCosplayedFor(CharacterInfo cInfo){
        String franchiseName = cInfo.getFranchiseName(); //to musi być użyte aby odszukac
        String characterName = cInfo.getCharacterName(); //to musi być użyte aby odszukac

        /* Coś takiego powinno zwrócić aby przejść 2 pierwsze scenariusze oraz czwarty, (trzeci to po prostu pusta lista)
        ArrayList<String> names = new ArrayList<String>();
        names.add("ThreeXe");
        names.add("Shafear");
        return names;
        */

        throw new NotImplementedException();
    }

    /**
     * Zwróć mi imiona użytkowników którzy kiedykolwiek się przebierali za coś z danej franczyzy
     * Uwaga! imiona nie mogą się powtarzać.
     */
    public static ArrayList<String> getUserNamesCosplayedForSomeoneFrom(FranchiseInfo fInfo){
        String franchiseName = fInfo.getFranchiseName(); //to musi być użyte aby odszukac

        /* Coś takiego powinno zwrócić aby przejść 2 pierwsze scenariusze, (trzeci to po prostu pusta lista)
        ArrayList<String> names = new ArrayList<String>();
        names.add("ThreeXe");
        names.add("Shafear");
        return names;
        */

        throw new NotImplementedException();
    }

    /**
     * Zwróć mi listę imion postaci które należą do franczyzy jakiejśtam.
     * Uwaga! Imiona nie mogą się powtarzać.
     */
    public static ArrayList<String> getCharacterNamesFrom(FranchiseInfo fInfo){
        String franchiseName = fInfo.getFranchiseName(); //to musi być użyte aby odszukac

        /* Coś takiego powinno zwrócić aby przejść 2 pierwsze scenariusze, (trzeci to po prostu pusta lista)
        ArrayList<String> names = new ArrayList<String>();
        names.add("Charizard");
        names.add("Pikachu");
        names.add("Pichu");
        return names;
        */

        throw new NotImplementedException();
    }
}