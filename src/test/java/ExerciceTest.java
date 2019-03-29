import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class ExerciceTest {


    public enum Gender {
        MALE,
        FEMALE
    }

    public class Student1 {

        private String lastName;
        private String firstName;
        private int birthYear;
        private Gender gender;

        public Student1(String lastName, String firstName, int birthYear,
                        Gender gender) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.birthYear = birthYear;
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public int getBirthYear() {
            return birthYear;
        }
        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public Gender getGender() {
            return gender;
        }

    }

    public List<Student1> givenStudent1s(){
        final ArrayList<Student1> Student1s = new ArrayList<Student1>();
        Student1s.add(new Student1("AFFAGARD", "Christian", 1990, Gender.MALE));
        Student1s.add(new Student1("AGROUR", "Rachid", 1992, Gender.MALE));
        Student1s.add(new Student1("Adrego", "Alexandre", 1993, Gender.MALE));
        Student1s.add(new Student1("ALAGILLE", "Thomas", 1992, Gender.MALE));
        Student1s.add(new Student1("AIDEL", "Imene", 1992, Gender.FEMALE));
        Student1s.add(new Student1("ARDISSON", "Isabelle", 1992, Gender.FEMALE));
        return Student1s;
    }


    // 1 -  Créer une méthode qui renvoi des étudiantes qui sont nées en 1992 avec un ordre noms et puis leurs prénoms
    public List<Student1> filterFemaleStudent1sByBirthDate(final List<Student1> Student1s){

        return Student1s
                .stream()
                .filter(Student1 -> Student1.getGender() == Gender.FEMALE)
                .filter(Student1 -> Student1.getBirthYear() == 1992)
                .sorted(Comparator.comparing(Student1::getLastName).thenComparing(Student1::getFirstName))
                .collect(Collectors.toList());
    }


    @Test
    public void givenStudent1s_WhenFiltringStudent1s_thenCorrectlyFiltred(){

        final List<Student1> filterdList = filterFemaleStudent1sByBirthDate(givenStudent1s());
        Assert.assertEquals(filterdList.size(), 2);
        Assert.assertEquals(filterdList.get(0).getLastName(),"AIDEL");
        Assert.assertEquals(filterdList.get(1).getLastName(),"ARDISSON");

    }

    // 2-  deuxième question : Changer l'ordre de tri (On ajoute reversed) :
    //  ...sorted(Comparator.comparing(Student1::getLastName).reversed());

}
